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
        


        //PARA GUARDAR UN PAQUETE PRIMERO CREAMOS UNA CIUDAD DE ORIGEN, UNA CIUDAD DESTINO, UN ALOJAMIENTO Y UN PASAJE, LUEGO DE ESO LLAMAMOS AL METODO GUARDAR PAQUETE 
        // Y LE PASAMOS LO CREADO ANTERIORMENTE PARA QUE SE CREE UN PAQUETE DE VIAJE..
           

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
//        Pasaje pasajes = new Pasaje("Avion", 50000, ciudadO, true);
//        PasajeData p = new PasajeData();
//        p.guardarPasaje(pasajes);
//        
//        //GUARDAR PAQUETE
//        Paquete paquetes = new Paquete("Paquete Familiar",ciudadO,ciudadD,alojamientos,pasajes,true);
//        PaqueteData pd = new PaqueteData();
//        pd.AgregarPaquete(paquetes);
        
//        MODIFICAMOS EL ESTADO DEL PAQUETE , SI ESTA ACTIVO O NO!
//         PaqueteData pd = new PaqueteData();
//         pd.ModificarPaqueteBaja(5); // cambiamos el estado del paquete a 0, lo que quiere decir es que esta inactivo
//         pd.ModificarPaqueteAlta(5); // cambiamos el estadodel paquete a 1, lo que quiere decir es que esta activo



        // BUSCAMOS EL PAQUETE POR EL ID 
        PaqueteData paqueteData = new PaqueteData();
        int idBuscar = 5; // Aca cambiamos el id dependiendo del paquete que estamos buscando en este caso el 3 

        Paquete paquete = paqueteData.buscarPaquete(idBuscar);

        if (paquete != null) {
            System.out.println("Paquete encontrado: ");
            System.out.println("Nombre del Paquete: " + paquete.getNombrePaquete());
            System.out.println("ID Paquete: " + paquete.getId_paquete());
            System.out.println("Ciudad Origen: " + paquete.getCiudadOrigen().getId_ciudad());
            System.out.println("Ciudad Destino: " + paquete.getCiudadDestino().getId_ciudad());
            System.out.println("Alojamiento ID: " + paquete.getAlojamiento().getId_alojamiento());
            System.out.println("Pasaje ID: " + paquete.getPasaje().getId_pasaje());
        } else {
            System.out.println("No se encontro ingunaquete con ese ID.");
        }
        
        Turista turista = new Turista(42220800,"Agustin",24,paquete);
        System.out.println("Informacion del turista");
        System.out.println("Dni: "+turista.getDni()+","+" Nombre: "+turista.getNombre()+","+" Edad: "+turista.getEdad()+","+" Numero y Nombre de paquete adquirido: "+turista.getId_paquete());
    
//        BORRAR EL PAQUETE TURISTICO
//        PaqueteData pd = new PaqueteData();
//        pd.EliminarPaquete(3);
}   
}

