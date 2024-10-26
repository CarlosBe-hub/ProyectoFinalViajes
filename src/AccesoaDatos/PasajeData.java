/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Ciudad;
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

    public Pasaje guardarPasaje(Pasaje pasaje) {

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
        return pasaje;

    }
    public void eliminarPasaje(int id){
    String sql = "DELETE FROM pasaje WHERE id_pasaje=?";
        try { 
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i == 1) {
                
                 JOptionPane.showMessageDialog(null, "El Pasaje ha sido Eliminado");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la Tabla Pasaje");
        }
    }
    
    public Pasaje buscarPasaje(int id){
        Pasaje p = null;
    String sql = "SELECT tipo_Transporte, importe, id_ciudadOrigen, estado FROM pasaje WHERE id_pasaje= ?";
        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              p = new Pasaje();
              CiudadData cd = new CiudadData();
              Ciudad c = cd.buscarCiudadporid(rs.getInt("id_ciudadOrigen"));
              p.setId_pasaje(id);
              
              p.setCiudadOrigen(c);
              p.setImporte(rs.getDouble("importe"));
              p.setTipoTransporte(rs.getString("tipo_Transporte"));
              p.setEstado(rs.getBoolean("estado"));
              
            }
            
        } catch (SQLException e) {
        }
        return p;
    } 
}
