/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Turista;

/**
 *
 * @author aguse
 */
public class TuristaData {
    
    private Connection red = null;

    public TuristaData() {
        red = conexion.getConexion();
    }
    
    public void agregarTurista(Turista turista){
        
       String sql = "INSERT INTO Turista ( id_turista, dni,nombre,edad) VALUES (?,?,?,?)";
       
        try {
            PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, turista.getId_turista());
            ps.setInt(2, turista.getDni());
            ps.setString(3, turista.getNombre());
               ps.setInt(4, turista.getEdad());
               
               ps.execute();
               ResultSet rs = ps.getGeneratedKeys();
               
               if(rs.next()){
               turista.setId_turista(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Turista Agregado");
               }
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turista");
        }
    
    }
    
}
