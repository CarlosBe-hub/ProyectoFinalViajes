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

    public Ciudad buscarCiudad(String ciudad) {

        String sql = " SELECT * FROM ciudad WHERE nombre=?";
        Ciudad c = null;

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setString(1, ciudad);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                c = new Ciudad();
                c.setId_ciudad(rs.getInt("id_ciudad"));
                c.setNombre(ciudad);
                c.setPais(rs.getString("pais"));
                c.setEstado(rs.getBoolean("estado"));
                c.setProvincia(rs.getString("provincia"));

                JOptionPane.showMessageDialog(null, "Se ha encontrado la ciudad");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudad!");
        }
        return c;
    }

    public List<String> listarPaises() {
        String sql = "SELECT DISTINCT pais FROM ciudad";
        List<String> pais = new ArrayList<>();

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String a = rs.getString("pais");
                pais.add(a);
//                JOptionPane.showMessageDialog(null, "lista de paises");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ciudad!");
        }
        return pais;
    }

    public List<Ciudad> listarPaisYProvincia(String pais, String provincia) {
        String sql = "SELECT id_ciudad , nombre FROM ciudad WHERE provincia=? AND pais=?";
        ArrayList<Ciudad> ciudad = new ArrayList<>();

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setString(1, provincia);
            ps.setString(2, pais);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad c = new Ciudad();
                c.setId_ciudad(rs.getInt("id_ciudad"));
                c.setNombre(rs.getString("nombre"));
                c.setEstado(true);
                c.setProvincia(provincia);
                c.setPais(pais);

                ciudad.add(c);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error ListarPaisYProvincia");
        }
        return ciudad;
    }

    public List<Ciudad> listarProvinciaXPais(String pais) {
        String sql = "SELECT id_ciudad, nombre FROM ciudad WHERE provincia =? AND pais =?";
        ArrayList<Ciudad> ciudad = new ArrayList<>();

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setString(1, pais);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String p = rs.getString("provincia");
                Ciudad c = new Ciudad();
                c.setProvincia(p);
                ciudad.add(c);
            }
        } catch (SQLException e) {
        }
        return ciudad;
    }

    public void eliminarCiudad(int id) {
        String sql = "UPDATE ciudad SET estado = 0 WHERE id_ciudad =?";
        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Se ha dado de Baja la Ciudad");

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad");

        }
    }

    public void modificarCiudad(Ciudad ciudad) {
        String sql = "UPDATE ciudad SET nombre = ?, pais = ?, provincia = ? WHERE id_ciudad = ?";
        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setInt(4, ciudad.getId_ciudad());
            int o = ps.executeUpdate();
            if (o == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado la Ciudad");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad");
        }
    
    }
    
    public Ciudad buscarCiudadporid(int id){
    Ciudad c = null;
    String sql = "SELECT nombre, pais, estado, provincia FROM ciudad WHERE id_ciudad = ?";
    
            try {
             PreparedStatement ps = red.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    c = new Ciudad();
                    c.setId_ciudad(id);
                    c.setNombre(rs.getString("nombre"));
                    c.setPais(rs.getString("pais"));
                    c.setEstado(rs.getBoolean("estado"));
                    c.setProvincia(rs.getString("provincia"));
                    
                }
            
        } catch (SQLException e) {
        }
       return c;       
    }
    
    public List<Ciudad> listarProvinciasPorPaisCombo(String pais){
        
        String sql = "SELECT DISTINCT provincia FROM ciudad WHERE pais = ?";
        List<Ciudad> listaProvincias = new ArrayList<>();
        
        try {
             PreparedStatement ps = red.prepareStatement(sql);           
            ps.setString(1, pais);            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                String newProvincia = rs.getString("provincia");
                Ciudad provincia = new Ciudad();
                provincia.setProvincia(newProvincia);
                listaProvincias.add(provincia);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }
        return listaProvincias;
    }
    public List<String> listarProvinciasPorPaisC(String pais){

        String sql = "SELECT DISTINCT provincia FROM ciudad WHERE pais = ?";
        List<String> listaProvincias = new ArrayList<>();

        try {
            PreparedStatement ps = red.prepareStatement(sql);
            ps.setString(1, pais);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                String provincia = rs.getString("provincia");
                listaProvincias.add(provincia);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }
        return listaProvincias;
}
     
    
}
