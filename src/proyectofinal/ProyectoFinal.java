/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import AccesoaDatos.CiudadData;
import AccesoaDatos.conexion;
import com.sun.jdi.connect.spi.Connection;
import modelo.Ciudad;
import modelo.Paquete;

/**
 *
 * @author carlo
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Ciudad ciudades = new Ciudad("Bariloche","Argentina",true,"Rio Negro");
        CiudadData d = new CiudadData();
        d.agregarCiudad(ciudades);
 
    }
    
}
