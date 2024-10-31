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
            ps.setBigDecimal(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getCiudadDestino().getId_ciudad());
            ps.setString(7, alojamiento.getTipoAlojamiento());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alojamiento.setId_alojamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alojamiento Registrado");
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
            ps.setBigDecimal(5, alojamiento.getImporteDiario());
            ps.setString(6, alojamiento.getTipoAlojamiento());
            ps.setInt(7, alojamiento.getId_alojamiento());

            int i = ps.executeUpdate();

            if (i == 1) {
                JOptionPane.showMessageDialog(null, "El alojamiento se modifico con exito");
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
                JOptionPane.showMessageDialog(null, "El alojamiento dado de baja");
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
            JOptionPane.showMessageDialog(null, "El alojamiento dedo de alta");
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
                JOptionPane.showMessageDialog(null, "El alojamiento se ha eliminado");
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
                a.setImporteDiario(rs.getBigDecimal("importe_diario"));
                a.setCiudadDestino(ciudad);
                a.setTipoAlojamiento(rs.getString("tipo_lojamiento"));

                JOptionPane.showMessageDialog(null, "Alojamiento encontrado");
            }
        } catch (SQLException e) {

        }
        return a;
    }

    public List<Alojamiento> listarAlojamiento(int ciudad, LocalDate fecha_inicio) {

    String sql = "SELECT id_alojamiento, Fecha_inicio, fecha_fin, servicio, importe_diario, tipo_lojamiento FROM alojamiento WHERE Fecha_inicio >= ? AND id_ciudadDestino = ? AND estado = 1";
    List<Alojamiento> listasdeAlojamiento = new ArrayList<>();

    try (PreparedStatement ps = red.prepareStatement(sql)) {
        
        ps.setDate(1, Date.valueOf(fecha_inicio));
        ps.setInt(2, ciudad);

        
        ResultSet rs = ps.executeQuery();
        CiudadData cd = new CiudadData();

        
        while (rs.next()) {
            Alojamiento aloja = new Alojamiento();
            Ciudad c = cd.buscarCiudadporid(ciudad);

            aloja.setId_alojamiento(rs.getInt("id_alojamiento"));
            aloja.setFechaInicio(rs.getDate("Fecha_inicio").toLocalDate());
            aloja.setFechaFin(rs.getDate("fecha_fin").toLocalDate());
            aloja.setEstado(true);  // Esto siempre es true según el filtro de la consulta
            aloja.setServicio(rs.getString("servicio"));
            aloja.setImporteDiario(rs.getBigDecimal("importe_diario"));
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
        ps.setBigDecimal(5, alojamiento.getImporteDiario());
        ps.setString(6, alojamiento.getTipoAlojamiento());
        ps.setInt(7, id);

        int resultado = ps.executeUpdate();

        if (resultado == 1) {
            JOptionPane.showMessageDialog(null, "Alojamiento modificado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un alojamiento con el ID especificado.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el alojamiento: ");
    }
}
 public List<Alojamiento> listarAlojamientoPorFechas(LocalDate fecha_inicio) {
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
            aloja.setImporteDiario(rs.getBigDecimal("importe_diario"));
            aloja.setTipoAlojamiento(rs.getString("tipo_lojamiento"));
            aloja.setEstado(true);
            listasdeAlojamiento.add(aloja);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return listasdeAlojamiento;
}   
}

