/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Alojamiento;

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
                JOptionPane.showMessageDialog(null, "Alojamiento Registrada");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alojamiento");
        }

    }
}
