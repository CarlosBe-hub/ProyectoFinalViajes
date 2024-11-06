/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    
    public void agregarTurista(Turista turista) {
    String sql = "INSERT INTO Turista (id_turista, dni, nombre, edad, estado) VALUES (?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, turista.getId_turista());
        ps.setInt(2, turista.getDni());
        ps.setString(3, turista.getNombre());
        ps.setInt(4, turista.getEdad());
        ps.setBoolean(5, turista.isEstado());  

        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()) {
            turista.setId_turista(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Turista Agregado");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla turista: " + e.getMessage());
    }
}

    public List<Turista> listarTuristas() {
        List<Turista> turistas = new ArrayList<>();
        String sql = "SELECT * FROM Turista";

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Turista turista = new Turista();
                turista.setId_turista(rs.getInt("id_turista"));
                turista.setDni(rs.getInt("dni"));
                turista.setNombre(rs.getString("nombre"));
                turista.setEdad(rs.getInt("edad"));
                turistas.add(turista);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar los turistas");
        }

        return turistas;
    }

   public void eliminarTuristaPorDni(int dni) {
    String sql = "DELETE FROM turista WHERE dni = ?";
    try (Connection conn = conexion.getConexion();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        
        ps.setInt(1, dni);
        
        int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            System.out.println("El Turista se ha eliminado exitosamente.");
        } else {
            System.out.println("No se encontro un turista con el DNI especificado.");
        }
        
    } catch (SQLException e) {
        System.out.println("Error al eliminar el turista: " + e.getMessage());
    }
    
}
    public void actualizarEstadoTurista(int dni, int nuevoEstado) {
        String sql = "UPDATE turista SET estado = ? WHERE dni = ?";
        try (Connection conn = conexion.getConexion(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, nuevoEstado);
            ps.setInt(2, dni);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Estado del turista actualizado exitosamente.");
            } else {
                System.out.println("No se encontro un turista con el DNI especificado.");
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar el estado del turista: " + e.getMessage());
        }
    }
}

