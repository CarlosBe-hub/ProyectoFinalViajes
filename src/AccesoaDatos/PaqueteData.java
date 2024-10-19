/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.Connection;
import modelo.*;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PaqueteData {

    private Connection red = null;

    public PaqueteData() {
        red = conexion.getConexion();
    }

    public void AgregarPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquete (id_ciudadOrigen, id_ciudadDestino, id_alojamiento, id_pasaje) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paquete.getNombrePaquete());
            ps.setInt(2, paquete.getCiudadOrigen().getId_ciudad());
            ps.setInt(3, paquete.getCiudadDestino().getId_ciudad());
            ps.setInt(4, paquete.getAlojamiento().getId_alojamiento());
            ps.setInt(5, paquete.getPasaje().getId_pasaje());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paquete.setId_paquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete Registrado");

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder AgregarPaquete");
        }
    }

    public void ModificarPaqueteBaja(int id) {
        String sql = "UPDATE paquete SET estado = 0 WHERE id_paquete =?";
        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);

            int i = ps.executeUpdate();

            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado el Paquete");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar Paquete");
        }
    }

    public void ModificarPaqueteAlta(int id) {
        String sql = "UPDATE paquete SET estado = 1 WHERE id_paquete =?";
        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);

            int i = ps.executeUpdate();

            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado el Paquete");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar Paquete");
        }

    }

    public void EliminarPaquete(int id) {
        String sql = "DELETE FROM paquete WHERE id_paquete =?";
        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado el Paquete");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar Paquete");

        }
    }

    /*
    public Paquete buscarPaquete(String nombrePaquete) {
        Paquete paqueteEncontrado = null;

        String query = "SELECT p.id_paquete, p.nombre_paquete, "
                 + "co.id_ciudad AS idCiudadOrigen, co.nombre AS nombreCiudadOrigen, "
                 + "cd.id_ciudad AS idCiudadDestino, cd.nombre AS nombreCiudadDestino, "
                 + "p.id_alojamiento, p.id_pasaje, p.estado "
                 + "FROM paquete p "
                 + "JOIN ciudad co ON p.id_ciudadOrigen = co.id_ciudad "
                 + "JOIN ciudad cd ON p.id_ciudadDestino = cd.id_ciudad "
                 + "WHERE p.nombre_paquete = ?";

        try (PreparedStatement ps = red.prepareStatement(query)) {
            ps.setString(1, nombrePaquete);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                paqueteEncontrado = new Paquete();
                paqueteEncontrado.setId_paquete(rs.getInt("id_paquete"));
                paqueteEncontrado.setNombrePaquete(rs.getString("nombre_paquete"));

                Ciudad ciudadOrigen = new Ciudad();
                ciudadOrigen.setId_ciudad(rs.getInt("id_ciudadOrigen"));
                paqueteEncontrado.setCiudadOrigen(ciudadOrigen);

                Ciudad ciudadDestino = new Ciudad();
                ciudadDestino.setId_ciudad(rs.getInt("id_ciudadDestino"));
                paqueteEncontrado.setCiudadDestino(ciudadDestino);

                paqueteEncontrado.setEstado(rs.getBoolean("estado"));
            }

        } catch (SQLException e) {
        }

        return paqueteEncontrado;
    }
     */
 /*
    public Paquete buscarPaquete(String nombrePaquete) {
    Paquete paqueteEncontrado = null;

    String query = "SELECT p.id_paquete, p.nombre_paquete, "
                 + "co.id_ciudad AS idCiudadOrigen, co.nombre AS nombreCiudadOrigen, "
                 + "co.pais AS paisOrigen, co.estado AS estadoOrigen, co.provincia AS provinciaOrigen, "
                 + "cd.id_ciudad AS idCiudadDestino, cd.nombre AS nombreCiudadDestino, "
                 + "cd.pais AS paisDestino, cd.estado AS estadoDestino, cd.provincia AS provinciaDestino, "
                 + "p.id_alojamiento, p.id_pasaje, p.estado "
                 + "FROM paquete p "
                 + "JOIN ciudad co ON p.id_ciudadOrigen = co.id_ciudad "
                 + "JOIN ciudad cd ON p.id_ciudadDestino = cd.id_ciudad "
                 + "WHERE p.nombre_paquete = ?";

    try (PreparedStatement ps = red.prepareStatement(query)) {
        ps.setString(1, nombrePaquete);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            paqueteEncontrado = new Paquete();
            paqueteEncontrado.setId_paquete(rs.getInt("id_paquete"));
            paqueteEncontrado.setNombrePaquete(rs.getString("nombre_paquete"));

            // Crear Ciudad de Origen
            Ciudad ciudadOrigen = new Ciudad(
                rs.getInt("idCiudadOrigen"),
                rs.getString("nombreCiudadOrigen"),
                rs.getString("paisOrigen"),
                rs.getBoolean("estadoOrigen"),
                rs.getString("provinciaOrigen")
            );

            // Crear Ciudad de Destino
            Ciudad ciudadDestino = new Ciudad(
                rs.getInt("idCiudadDestino"),
                rs.getString("nombreCiudadDestino"),
                rs.getString("paisDestino"),
                rs.getBoolean("estadoDestino"),
                rs.getString("provinciaDestino")
            );

            // Asignar las ciudades al paquete
            paqueteEncontrado.setCiudadOrigen(ciudadOrigen);
            paqueteEncontrado.setCiudadDestino(ciudadDestino);

            // Aquí podrías asignar alojamiento y pasaje si fuera necesario
            paqueteEncontrado.setEstado(rs.getBoolean("estado"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return paqueteEncontrado;
}
     *//*
    public Paquete buscarPaquete(String nombrePaquete) {
    Paquete paqueteEncontrado = null;

    String query = "SELECT p.id_paquete, p.nombre_paquete, "
                 + "co.id_ciudad AS idCiudadOrigen, co.nombre AS nombreCiudadOrigen, "
                 + "co.pais AS paisOrigen, co.estado AS estadoOrigen, co.provincia AS provinciaOrigen, "
                 + "cd.id_ciudad AS idCiudadDestino, cd.nombre AS nombreCiudadDestino, "
                 + "cd.pais AS paisDestino, cd.estado AS estadoDestino, cd.provincia AS provinciaDestino, "
                 + "a.id_alojamiento, a.nombre AS nombreAlojamiento, "
                 + "s.id_pasaje, s.tipo AS tipoPasaje, "
                 + "p.estado "
                 + "FROM paquete p "
                 + "JOIN ciudad co ON p.id_ciudadOrigen = co.id_ciudad "
                 + "JOIN ciudad cd ON p.id_ciudadDestino = cd.id_ciudad "
                 + "JOIN alojamiento a ON p.id_alojamiento = a.id_alojamiento "
                 + "JOIN pasaje s ON p.id_pasaje = s.id_pasaje "
                 + "WHERE p.nombre_paquete = ?";

    try (PreparedStatement ps = red.prepareStatement(query)) {
        ps.setString(1, nombrePaquete);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            paqueteEncontrado = new Paquete();
            paqueteEncontrado.setId_paquete(rs.getInt("id_paquete"));
            paqueteEncontrado.setNombrePaquete(rs.getString("nombre_paquete"));

            // Crear las ciudades de origen y destino
            Ciudad ciudadOrigen = new Ciudad(
                rs.getInt("idCiudadOrigen"), 
                rs.getString("nombreCiudadOrigen"), 
                rs.getString("paisOrigen"), 
                rs.getBoolean("estadoOrigen"), 
                rs.getString("provinciaOrigen")
            );

            Ciudad ciudadDestino = new Ciudad(
                rs.getInt("idCiudadDestino"), 
                rs.getString("nombreCiudadDestino"), 
                rs.getString("paisDestino"), 
                rs.getBoolean("estadoDestino"), 
                rs.getString("provinciaDestino")
            );

            paqueteEncontrado.setCiudadOrigen(ciudadOrigen);
            paqueteEncontrado.setCiudadDestino(ciudadDestino);

            // Crear y asignar el alojamiento
            Alojamiento alojamiento = new Alojamiento(
                rs.getInt("id_alojamiento"), 
                rs.getString("nombreAlojamiento")
            );
            paqueteEncontrado.setAlojamiento(alojamiento);

            // Crear y asignar el pasaje
            Pasaje pasaje = new Pasaje(
                rs.getInt("id_pasaje"), 
                rs.getString("tipoPasaje")
            );
            paqueteEncontrado.setPasaje(pasaje);

            paqueteEncontrado.setEstado(rs.getBoolean("estado"));
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return paqueteEncontrado;
}*/
    public Paquete buscarPaquete(int id) {
        String sql = "SELECT * FROM paquete WHERE id_paquete = ?";
        Paquete paquete = null;

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                paquete = new Paquete();
                paquete.setId_paquete(rs.getInt("id_paquete"));
                paquete.setNombrePaquete(rs.getString("nombre_paquete"));
                Ciudad ciudadOrigen = new Ciudad();
                ciudadOrigen.setId_ciudad(rs.getInt("id_ciudadOrigen"));
                paquete.setCiudadOrigen(ciudadOrigen);

                Ciudad ciudadDestino = new Ciudad();
                ciudadDestino.setId_ciudad(rs.getInt("id_ciudadDestino"));
                paquete.setCiudadDestino(ciudadDestino);

                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setId_alojamiento(rs.getInt("id_alojamiento"));
                paquete.setAlojamiento(alojamiento);

                Pasaje pasaje = new Pasaje();
                pasaje.setId_pasaje(rs.getInt("id_pasaje"));
                paquete.setPasaje(pasaje);
                JOptionPane.showMessageDialog(null, "Se encontro el paquete");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar Paquete");
        }

        return paquete;
    }
}
  