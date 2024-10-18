/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import AccesoaDatos.AlojamientoData;
import AccesoaDatos.CiudadData;
import AccesoaDatos.PaqueteData;
import AccesoaDatos.PasajeData;
import AccesoaDatos.conexion;
import com.sun.jdi.connect.spi.Connection;
import java.time.LocalDate;
import java.time.Month;
import modelo.*;

/**
 *
 * @author carlo
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EL INSERT SE INSERTA DE 1 SOLA VEZ Y GUARDA TODO

        //GUARDAR UNA CIUDAD
        
//        Ciudad ciudadD = new Ciudad("Bariloche", "Argentina", true, "Rio Negro");
//        CiudadData d = new CiudadData();
//        d.agregarCiudad(ciudadD);
//
//        //GUARDA UN ALOJAMIENTO
//        
//        Alojamiento alojamientos = new Alojamiento(LocalDate.of(2024, 10, 18), LocalDate.of(2024, 10, 20), true, "pensicon completa", 25000, ciudadD, "cabaña");
//        AlojamientoData a = new AlojamientoData();
//        a.guardarAlojamiento(alojamientos);
//
//        //GUARDA UN PASAJE
//        
//        Ciudad ciudadO = new Ciudad("San Luis", "Argentina", true, "San Luis");
//        d.agregarCiudad(ciudadO);
//        
//        Pasaje pasajes = new Pasaje("Avion", 50000, ciudadesO, true);
//        PasajeData p = new PasajeData();
//        p.guardarPasaje(pasajes);
//        
//        //GUARDAR PAQUETE
//        Paquete paquetes = new Paquete(ciudadO,ciudadD,alojamientos,pasajes,true);
//        PaqueteData pd = new PaqueteData();
//        pd.AgregarPaquete(paquetes);
        
        //MODIFICAMOS EL ESTADO DEL PAQUETE , SI ESTA ACTIVO O NO!
         PaqueteData pd = new PaqueteData();
         pd.ModificarPaqueteBaja(3); // cambiamos es estado a 0, lo que quiere decir es que esta inactivo
         pd.ModificarPaqueteAlta(3); // cambiamos es estado a 1, lo que quiere decir es que esta activo


//        BORRAR EL PAQUETE TURISTICO
//        PaqueteData pd = new PaqueteData();
//        pd.EliminarPaquete(3);


    }

}
