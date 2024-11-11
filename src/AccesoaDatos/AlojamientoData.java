/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Alojamiento;
import modelo.Ciudad;

/**
 *
 * @author dylan
 */
public class AlojamientoData {

    private Connection red = null;

    public AlojamientoData() {
        red = conexion.getConexion();
    }

    public void guardarAlojamiento(Alojamiento alojamiento) {
        String sql = "INSERT INTO alojamiento (Fecha_inicio, fecha_fin, estado, servicio, importe_diario, id_ciudadDestino, tipo_lojamiento) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(alojamiento.getFechaInicio()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaFin()));
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getCiudadDestino().getId_ciudad());
            ps.setString(7, alojamiento.getTipoAlojamiento());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alojamiento.setId_alojamiento(rs.getInt(1));
                //JOptionPane.showMessageDialog(null, "Alojamiento Registrado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento A");
        }

    }

    public void modificarAlojamiento(Alojamiento alojamiento) {
        String sql = "UPDATE alojamiento SET Fecha_inicio =?, fecha_fin=?, estado=?, servicio=?, importe_diario=?,tipo_lojamiento=? WHERE id_alojamiento=?";

        try {
            PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(alojamiento.getFechaInicio()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaFin()));
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setString(6, alojamiento.getTipoAlojamiento());
            ps.setInt(7, alojamiento.getId_alojamiento());

            int i = ps.executeUpdate();

            if (i == 1) {
                //JOptionPane.showMessageDialog(null, "El alojamiento se modifico con exito");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento B");
        }
    }

    public void darDeBaja(int id) {
        String sql = "UPDATE alojamiento SET estado = 0 WHERE id_alojamiento = ?";

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();

            if (i == 1) {
                //JOptionPane.showMessageDialog(null, "El alojamiento dado de baja");
            }

        } catch (SQLException e) {
        }

    }
    
    public void darDeAlta(int id) {
    String sql = "UPDATE alojamiento SET estado = 1 WHERE id_alojamiento = ?";

    try {
        PreparedStatement ps = red.prepareStatement(sql);
        ps.setInt(1, id);
        int i = ps.executeUpdate();

        if (i == 1) {
            //JOptionPane.showMessageDialog(null, "El alojamiento dedo de alta");
        }

    } catch (SQLException e) {
    }
}
    
    public boolean estadoAlojamiento(int id) {
    String sql = "SELECT estado FROM alojamiento WHERE id_alojamiento = ?";
    boolean estado = false;

    try {
        PreparedStatement ps = red.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            estado = rs.getBoolean("estado");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return estado;
}

    public void calculodeVacaciones(LocalDate fecha1, LocalDate fecha2) {
        String temporada = calculodeTemporada(fecha1);
        int diasVacaciones = calculardiasVacaciones(fecha1, fecha2);

        System.out.println("Temporada" + temporada);
        System.out.println("Dias de Vacaciones" + diasVacaciones);

    }

    public String calculodeTemporada(LocalDate fechaInicio) {
        Month mesInicio = fechaInicio.getMonth();

        if (mesInicio == Month.DECEMBER || mesInicio == Month.FEBRUARY) {
            return "temporada Alta";
        } else if (mesInicio == Month.JULY) {
            return "temporada Media";
        } else {
            return "temporada Baja";
        }
    }

    public int calculardiasVacaciones(LocalDate fechaInicio, LocalDate fechaFin) {

        long diferenciadeDias = fechaInicio.until(fechaFin, ChronoUnit.DAYS);

        return (int) diferenciadeDias;
    }

    public void eliminarAlojamiento(int id) {
        String sql = "DELETE FROM alojamiento WHERE id_alojamiento=?";

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();

            if (i == 1) {
                //JOptionPane.showMessageDialog(null, "El alojamiento se ha eliminado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar C");
        }
    }

    public Alojamiento buscarAlojamiento(int id) {
        String sql = "SELECT id_alojamiento, Fecha_inicio, fecha_fin, estado, servicio, importe_diario, id_ciudadDestino, tipo_lojamiento FROM alojamiento WHERE id_alojamiento = ?";
        Alojamiento a = null;

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                a = new Alojamiento();
                CiudadData c = new CiudadData();
                Ciudad ciudad = c.buscarCiudadporid(rs.getInt("id_ciudadDestino"));

                a.setId_alojamiento(id);

                if (rs.getDate("Fecha_inicio") != null) {
                    a.setFechaInicio(rs.getDate("Fecha_inicio").toLocalDate());
                } else {
                    a.setFechaInicio(null);
                }

                if (rs.getDate("fecha_fin") != null) {
                    a.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
                } else {
                    a.setFechaFin(null);
                }

                a.setEstado(rs.getBoolean("estado"));
                a.setServicio(rs.getString("servicio"));
                a.setImporteDiario(rs.getDouble("importe_diario"));
                a.setCiudadDestino(ciudad);
                a.setTipoAlojamiento(rs.getString("tipo_lojamiento"));

                //JOptionPane.showMessageDialog(null, "Alojamiento encontrado");
            }
        } catch (SQLException e) {

        }
        return a;
    }

  
    public List<Alojamiento> listarAlojamientosPorCiudad(int ciudad) {
    String sql = "SELECT id_alojamiento, fecha_inicio, fecha_fin, servicio, importe_diario, tipo_lojamiento FROM alojamiento WHERE id_ciudadDestino = ? AND estado = 1";
    List<Alojamiento> listasdeAlojamiento = new ArrayList<>();

    try (PreparedStatement ps = red.prepareStatement(sql)) {
        ps.setInt(1, ciudad);

        ResultSet rs = ps.executeQuery();
        CiudadData cd = new CiudadData();

        while (rs.next()) {
            Alojamiento aloja = new Alojamiento();
            Ciudad c = cd.buscarCiudadporid(ciudad);

            aloja.setId_alojamiento(rs.getInt("id_alojamiento"));
            aloja.setFechaInicio(rs.getDate("fecha_inicio").toLocalDate());
            aloja.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
            aloja.setEstado(true);  // Esto siempre es true según el filtro de la consulta
            aloja.setServicio(rs.getString("servicio"));
            aloja.setImporteDiario(rs.getDouble("importe_diario"));
            aloja.setCiudadDestino(c);
            aloja.setTipoAlojamiento(rs.getString("tipo_lojamiento"));

            listasdeAlojamiento.add(aloja);
        }
    } catch (SQLException e) {
        e.printStackTrace(); 
    }

    return listasdeAlojamiento;
}
    
    public void modificarAlojamientoPorId(int id, Alojamiento alojamiento) {
    String sql = "UPDATE alojamiento SET Fecha_inicio = ?, fecha_fin = ?, estado = ?, servicio = ?, importe_diario = ?, tipo_lojamiento = ? WHERE id_alojamiento = ?";

    try {
        PreparedStatement ps = red.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(alojamiento.getFechaInicio()));
        ps.setDate(2, Date.valueOf(alojamiento.getFechaFin()));
        ps.setBoolean(3, alojamiento.isEstado());
        ps.setString(4, alojamiento.getServicio());
        ps.setDouble(5, alojamiento.getImporteDiario());
        ps.setString(6, alojamiento.getTipoAlojamiento());
        ps.setInt(7, id);

        int resultado = ps.executeUpdate();

        if (resultado == 1) {
            //JOptionPane.showMessageDialog(null, "Alojamiento modificado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un alojamiento con el ID especificado.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el alojamiento: ");
    }
}
 public List<Alojamiento> listarAlojamientoPorFechas(String fecha_inicio) {
    String sql = "SELECT id_alojamiento, Fecha_inicio, fecha_fin, servicio, importe_diario, tipo_lojamiento " +
                 "FROM alojamiento WHERE Fecha_inicio = ? AND estado = 1";
    List<Alojamiento> listasdeAlojamiento = new ArrayList<>();

    try {
        PreparedStatement ps = red.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(fecha_inicio));

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Alojamiento aloja = new Alojamiento();
            aloja.setId_alojamiento(rs.getInt("id_alojamiento"));
            aloja.setFechaInicio(rs.getDate("Fecha_inicio").toLocalDate());
            aloja.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
            aloja.setServicio(rs.getString("servicio"));
            aloja.setImporteDiario(rs.getDouble("importe_diario"));
            aloja.setTipoAlojamiento(rs.getString("tipo_lojamiento"));
            aloja.setEstado(true);
            listasdeAlojamiento.add(aloja);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return listasdeAlojamiento;
}   
 
 public Alojamiento buscarAlojamientoPorImporte(double importeDiario) {
    String sql = "SELECT id_alojamiento, Fecha_inicio, fecha_fin, estado, servicio, importe_diario, id_ciudadDestino, tipo_lojamiento FROM alojamiento WHERE importe_diario = ?";
    Alojamiento a = null;

    try {
        PreparedStatement ps = red.prepareStatement(sql);
        ps.setDouble(1, importeDiario);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            a = new Alojamiento();

           
            CiudadData ciudadData = new CiudadData();
            Ciudad ciudadDestino = ciudadData.buscarCiudadporid(rs.getInt("id_ciudadDestino"));

            
            a.setId_alojamiento(rs.getInt("id_alojamiento"));
            
            if (rs.getDate("Fecha_inicio") != null) {
                a.setFechaInicio(rs.getDate("Fecha_inicio").toLocalDate());
            } else {
                a.setFechaInicio(null);
            }

            if (rs.getDate("fecha_fin") != null) {
                a.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
            } else {
                a.setFechaFin(null);
            }

            a.setEstado(rs.getBoolean("estado"));
            a.setServicio(rs.getString("servicio"));
            a.setImporteDiario(rs.getDouble("importe_diario"));
            a.setCiudadDestino(ciudadDestino);
            a.setTipoAlojamiento(rs.getString("tipo_lojamiento"));
            
            //JOptionPane.showMessageDialog(null, "Alojamiento encontrado con el importe especificado.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún alojamiento con el importe especificado.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar alojamiento: " + e.getMessage());
    }
    return a;
}
 public List<Alojamiento> listarAlojamientoPorCiudad(String nombreCiudad) {
    List<Alojamiento> alojamientos = new ArrayList<>();
    String sql = "SELECT a.id_alojamiento, a.Fecha_inicio, a.fecha_fin, a.estado, a.servicio, " +
                 "a.importe_diario, a.tipo_lojamiento, c.nombre " +
                 "FROM alojamiento a " +
                 "JOIN ciudad c ON a.id_ciudadDestino = c.id_ciudad " +
                 "WHERE c.nombre = ?";

    try (PreparedStatement ps = red.prepareStatement(sql)) {
        ps.setString(1, nombreCiudad);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Alojamiento alojamiento = new Alojamiento();
            Ciudad ciudad = new Ciudad();
            
           
            alojamiento.setId_alojamiento(rs.getInt("id_alojamiento"));
            alojamiento.setFechaInicio(rs.getDate("Fecha_inicio").toLocalDate());
            alojamiento.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
            alojamiento.setEstado(rs.getBoolean("estado"));
            alojamiento.setServicio(rs.getString("servicio"));
            alojamiento.setImporteDiario(rs.getDouble("importe_diario"));
            alojamiento.setTipoAlojamiento(rs.getString("tipo_lojamiento"));

          
            ciudad.setNombre(rs.getString("nombre"));
            alojamiento.setCiudadDestino(ciudad);

            alojamientos.add(alojamiento);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al listar alojamientos por ciudad: " + e.getMessage());
    }
    return alojamientos;
}

 public String determinarTemporada(LocalDate fechaInicio) {
        Month mes = fechaInicio.getMonth();
        int dia = fechaInicio.getDayOfMonth();

        // Temporada Alta
        if ((mes == Month.DECEMBER && dia >= 15) || mes == Month.JANUARY || mes == Month.FEBRUARY ||
            (mes == Month.JULY)) {
            return "Alta";
        }
        
        else if (mes == Month.SEPTEMBER || mes == Month.OCTOBER || mes == Month.NOVEMBER ||
                 (mes == Month.MARCH && dia >= 20) || (mes == Month.JUNE && dia <= 21)) {
            return "Media";
        }
        // Temporada Baja
        else {
            return "Baja";
        }
    }

public List<String[]> obtenerDetallesAlojamientoPorCiudad(String nombreCiudad) {
        List<String[]> detallesAlojamientos = new ArrayList<>();
        String sql = "SELECT a.Fecha_inicio, a.fecha_fin, c.nombre " +
                     "FROM alojamiento a " +
                     "JOIN ciudad c ON a.id_ciudadDestino = c.id_ciudad " +
                     "WHERE c.nombre = ?";

        try (PreparedStatement ps = red.prepareStatement(sql)) {
            ps.setString(1, nombreCiudad);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                LocalDate fechaInicio = rs.getDate("Fecha_inicio").toLocalDate();
                String temporada = determinarTemporada(fechaInicio);
                String mes = fechaInicio.getMonth().toString();

                String[] detalle = {rs.getString("nombre"), temporada, mes};
                detallesAlojamientos.add(detalle);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener detalles del alojamiento: " + e.getMessage());
        }
        return detallesAlojamientos;
    }

public List<Alojamiento>AlojamientoPorTemporada(String temporada) {
    List<Alojamiento> alojamientos = new ArrayList<>();
    String sql = "SELECT * FROM alojamiento WHERE estado = 1 AND (determinarTemporada(Fecha_inicio) = ? OR determinarTemporada(Fecha_fin) = ?)";
    try (PreparedStatement ps = red.prepareStatement(sql)) {
        ps.setString(1, temporada);
        ps.setString(2, temporada);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Alojamiento alojamiento = new Alojamiento();
            alojamiento.setId_alojamiento(rs.getInt("id_alojamiento"));
            alojamiento.setFechaInicio(rs.getDate("Fecha_inicio").toLocalDate());
            alojamiento.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
            alojamiento.setEstado(rs.getBoolean("estado"));
            alojamiento.setServicio(rs.getString("servicio"));
            alojamiento.setImporteDiario(rs.getDouble("importe_diario"));
            alojamiento.setCiudadDestino(new Ciudad());
            alojamiento.setTipoAlojamiento(rs.getString("tipo_lojamiento"));
            alojamientos.add(alojamiento);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener alojamientos por temporada: " + e.getMessage());
    }
    return alojamientos;
}

public List<Alojamiento> AlojamientoXTemporada(String temporada) {
    List<Alojamiento> alojamientos = new ArrayList<>();
    String sql = "SELECT a.*, c.nombre AS ciudad_nombre " +
                 "FROM alojamiento a " +
                 "JOIN ciudad c ON a.id_ciudadDestino = c.id_ciudad " +
                 "WHERE a.estado = 1";

    try (PreparedStatement ps = red.prepareStatement(sql)) {
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Alojamiento alojamiento = new Alojamiento();
            alojamiento.setId_alojamiento(rs.getInt("id_alojamiento"));
            alojamiento.setFechaInicio(rs.getDate("Fecha_inicio").toLocalDate());
            alojamiento.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
            alojamiento.setEstado(rs.getBoolean("estado"));
            alojamiento.setServicio(rs.getString("servicio"));
            alojamiento.setImporteDiario(rs.getDouble("importe_diario"));
            alojamiento.setTipoAlojamiento(rs.getString("tipo_lojamiento"));

            // Crear objeto Ciudad y asignarle el nombre
            Ciudad ciudad = new Ciudad();
            ciudad.setNombre(rs.getString("ciudad_nombre"));
            alojamiento.setCiudadDestino(ciudad);

            // Verificar si la temporada de la fecha de inicio coincide con la seleccionada
            String temporadaInicio = determinarTemporada(alojamiento.getFechaInicio());
            if (temporadaInicio.equalsIgnoreCase(temporada)) {
                alojamientos.add(alojamiento);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener alojamientos por temporada: " + e.getMessage());
    }
    return alojamientos;
}
}



