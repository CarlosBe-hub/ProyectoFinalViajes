/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Pasaje;

/**
 *
 * @author dylan
 */
public class PasajeData {

    private Connection red = null;

    public PasajeData() {
        red = conexion.getConexion();

    }

    public void guardarPasaje(Pasaje pasaje) {

        String sql = "INSERT INTO Pasaje(tipo_Transporte, importe, id_ciudadOrigen, estado) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasaje.getTipoTransporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getCiudadOrigen().getId_ciudad());
            ps.setBoolean(4, pasaje.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasaje.setId_pasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasaje Registrada");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje");
        }

    }
}
