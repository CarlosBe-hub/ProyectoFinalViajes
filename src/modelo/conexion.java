/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author carlo
 */
public class conexion {
   private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB="proyecto_final";
    private static final String USUARIO = "root";
    private static final String PASSWORD = ""; 
    
    private static Connection connection;

    
    private conexion() { }
    
    
    public static Connection getConexion(){
    
        if( connection == null){
        
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                
                connection = (Connection) DriverManager.getConnection(URL+DB,USUARIO, PASSWORD);
            }
            catch(ClassNotFoundException e){
                JOptionPane.showMessageDialog(null, "Error");
                
            
            }
            catch(SQLException ex){ 
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        return connection;
    
    }
}
   
