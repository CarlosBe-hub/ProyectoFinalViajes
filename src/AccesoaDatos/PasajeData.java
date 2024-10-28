/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
            while(rs.next()) {
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
   
    public List<Pasaje> buscarPasajePorTipoTransporte(String tipoTransporte) {
    List<Pasaje> pasajes = new ArrayList<>();    
    
    
    String sql = "SELECT p.id_pasaje, p.tipo_Transporte, p.importe, p.id_ciudadOrigen, p.id_ciudadDestino ,p.estado " +
                 "FROM pasaje p " +
                 "WHERE p.tipo_Transporte = ?";

    try {
        PreparedStatement ps = red.prepareStatement(sql);
        ps.setString(1, tipoTransporte);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Pasaje p = new Pasaje();
            CiudadData cd = new CiudadData();
            Ciudad cOrigen = cd.buscarCiudadporid(rs.getInt("id_ciudadOrigen"));
            Ciudad cDestino = cd.buscarCiudadporid(rs.getInt("id_ciudadDestino"));
            
            p.setId_pasaje(rs.getInt("id_pasaje"));
            p.setCiudadOrigen(cOrigen);
            p.setCiudadDestino(cDestino);
            p.setImporte(rs.getDouble("importe"));
            p.setTipoTransporte(rs.getString("tipo_Transporte"));
            p.setEstado(rs.getBoolean("estado"));
            
            pasajes.add(p);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar Pasaje por tipo de transporte.");
    }

    return pasajes;
}

    
    public void cambiarEstadoPasaje(int id, boolean estado) {
    String sql = "UPDATE pasaje SET estado = ? WHERE id_pasaje = ?";
    try {
        PreparedStatement ps = red.prepareStatement(sql);
        ps.setBoolean(1, estado);
        ps.setInt(2, id);
        int i = ps.executeUpdate();
        if (i == 1) {
            String mensaje = estado ? "El Pasaje se activo exitosamente!" : "El Pasaje se desactivo correctamente";
            JOptionPane.showMessageDialog(null, mensaje);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cambiar el estado del pasaje.");
    }
}
}
