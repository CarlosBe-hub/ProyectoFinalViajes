/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Ciudad;

/**
 *
 * @author dylan
 */
public class CiudadData {

    private Connection red = null;

    public CiudadData() {
        red = conexion.getConexion();

    }

    public void agregarCiudad(Ciudad ciudad) {

        String sql = "INSERT INTO ciudad(nombre, pais, estado, provincia) VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setBoolean(3, ciudad.isEstado());
            ps.setString(4, ciudad.getProvincia());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ciudad.setId_ciudad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ciudad Registrada");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en acceder a la tabla ciudad");
        }
    }

}
