/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.Connection;
import modelo.*;
import java.sql.*;
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
    
    public void AgregarPaquete(Paquete paquete){
        String sql= "INSERT INTO paquete (id_ciudadOrigen, id_ciudadDestino, id_alojamiento, id_pasaje VALUES(?,?,?,?))";
        try {
            PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getCiudadOrigen().getId_ciudad());
            ps.setInt(2, paquete.getCiudadDestino().getId_ciudad());
            ps.setInt(3, paquete.getAlojamiento().getId_alojamiento());
            ps.setInt(4, paquete.getPasaje().getId_pasaje());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
            paquete.setId_paquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete Registrado");
                
            }
        } catch (SQLException e) {
       JOptionPane.showMessageDialog( null, "Error al acceder AgregarPaquete" );
        }
    }
    public void ModificarPaquete(Paquete paquete){
    String sql= "UPDATE paquete SET id_ciudadOrigen=? , id_ciudadDestino=? , id_alojamiento=? , id_pasaje=?  WHERE id_paquete =?";
        try {
         PreparedStatement ps = red.prepareStatement(sql);
         ps.setInt(1, paquete.getCiudadOrigen().getId_ciudad());
         ps.setInt(2, paquete.getCiudadDestino().getId_ciudad());
         ps.setInt(3, paquete.getAlojamiento().getId_alojamiento());
         ps.setInt(4, paquete.getPasaje().getId_pasaje());
         int i = ps.executeUpdate();
         
        if (i == 1){
        JOptionPane.showMessageDialog(null, "Se ha modificado el Paquete");
        }
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar Paquete");
        }
 
    }
    public void EliminarPaquete (int id){
    String sql= "DELETE * FROM paquete WHERE id_paquete =?";
        try {
        PreparedStatement ps = red.prepareStatement(sql);
        ps.setInt(1, id);
        int i = ps.executeUpdate();
        if( i == 1){
        JOptionPane.showMessageDialog(null, "Se ha eliminado el Paquete");
        }
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar Paquete");
        
        }
    }
}
