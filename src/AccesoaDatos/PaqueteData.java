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
  