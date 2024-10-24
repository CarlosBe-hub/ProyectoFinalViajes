/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoaDatos;

import java.sql.Connection;
import modelo.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String sql = "INSERT INTO paquete (nombre_paquete,id_ciudadOrigen, id_ciudadDestino, id_alojamiento, id_pasaje) VALUES(?,?,?,?,?)";
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
    
    public List<Paquete>listaPaquetesXciudad(int id){
        
        String sql = "SELECT *"
                + "FROM paquete p "
                + "INNER JOIN ciudad co ON  p.id_ciudadOrigen=co.id_ciudad "
                + "INNER JOIN alojamiento a ON p.id_alojamiento = a.id_alojamiento "
                + "INNER JOIN pasaje pa ON p.id_pasaje = pa.id_pasaje "
                + "INNER JOIN ciudad cd ON p.id_ciudadDestino= cd.id_ciudad "
                + "WHERE p.id_ciudadDestino = ? ";
        
        List<Paquete> paquete1 = new ArrayList<>();
        
        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Paquete p = new Paquete();
                Alojamiento alojamientos = new Alojamiento();
                AlojamientoData ad = new AlojamientoData();
                PasajeData pd = new PasajeData();
                Pasaje pasajes = new Pasaje();
                Ciudad ciudadO = new Ciudad();
                Ciudad ciudadD = new Ciudad();
                
                ciudadO.setId_ciudad(rs.getInt("id_ciudadOrigen"));
                ciudadO.setNombre(rs.getString("co.nombre"));
                ciudadO.setPais(rs.getString("co.pais"));
                ciudadO.setProvincia(rs.getString("co.provincia"));
                ciudadO.setEstado(rs.getBoolean("co.estado"));
                
                ciudadD.setId_ciudad(rs.getInt("id_ciudadDestino"));
                ciudadD.setNombre(rs.getString("cd.nombre"));
                ciudadD.setPais(rs.getString("cd.pais"));
                ciudadD.setProvincia(rs.getString("cd.provincia"));
                ciudadD.setEstado(rs.getBoolean("cd.estado"));
                
                alojamientos = ad.buscarAlojamiento(rs.getInt("id_alojamiento"));
                
                p.setAlojamiento(alojamientos);
                p.setCiudadOrigen(ciudadO);
                p.setCiudadDestino(ciudadD);
                
                pasajes = pd.buscarPasaje(rs.getInt("id_pasaje"));
                p.setPasaje(pasajes);
                
                p.setId_paquete(rs.getInt("id_paquete"));
                
                paquete1.add(p);
                
                JOptionPane.showMessageDialog(null, "lista encontrada");
            }
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudo acceder a la tabla paquete");
        }
        return paquete1;
    }
    
     public List<Paquete> listarPaquetePorFechaSalida(LocalDate fechaActual) {
        String sql = "SELECT * "
                + "FROM paquete p "
                + "INNER JOIN ciudad co ON p.id_ciudadOrigen = co.id_ciudad "
                + "INNER JOIN alojamiento a ON p.id_alojamiento = a.id_alojamiento "
                + "INNER JOIN pasaje pa ON p.id_pasaje = pa.id_pasaje "
                + "INNER JOIN ciudad cd ON p.id_ciudadDestino = cd.id_ciudad "
                + "WHERE a.fecha_fin < ? ";
                

        ArrayList<Paquete> paquete1 = new ArrayList<>();
        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaActual));
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                Paquete p = new Paquete();
                Alojamiento alojamientos = new Alojamiento();
                AlojamientoData ad = new AlojamientoData();
                PasajeData pd = new PasajeData();
                Pasaje pasajes = new Pasaje();
                Ciudad ciudadO = new Ciudad();
                Ciudad ciudadD = new Ciudad();
                
                ciudadO.setId_ciudad(rs.getInt("id_ciudadOrigen"));
                ciudadO.setNombre(rs.getString("co.nombre"));
                ciudadO.setPais(rs.getString("co.pais"));
                ciudadO.setProvincia(rs.getString("co.provincia"));
                ciudadO.setEstado(rs.getBoolean("co.estado"));
                
                ciudadD.setId_ciudad(rs.getInt("id_ciudadDestino"));
                ciudadD.setNombre(rs.getString("cd.nombre"));
                ciudadD.setPais(rs.getString("cd.pais"));
                ciudadD.setProvincia(rs.getString("cd.provincia"));
                ciudadD.setEstado(rs.getBoolean("cd.estado"));
                
                alojamientos = ad.buscarAlojamiento(rs.getInt("id_alojamiento"));
                
                p.setAlojamiento(alojamientos);
                p.setCiudadOrigen(ciudadO);
                p.setCiudadDestino(ciudadD);
                
                pasajes = pd.buscarPasaje(rs.getInt("id_pasaje"));
                p.setPasaje(pasajes);
                
                p.setId_paquete(rs.getInt("id_paquete"));
                
                paquete1.add(p);
                
                JOptionPane.showMessageDialog(null, "lista encontrada");
            }
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudo acceder a la tabla paquete");
        }
        return paquete1;
    }
    
}
  