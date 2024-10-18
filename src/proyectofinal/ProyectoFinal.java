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
        //EL INSERT SE INSERTA DE 1 SOLA VEZ Y GUARDAR TODO
/*
        //GUARDAR UNA CIUDAD
        
        Ciudad ciudadesD = new Ciudad("Bariloche", "Argentina", true, "Rio Negro");
        CiudadData d = new CiudadData();
        d.agregarCiudad(ciudadesD);

        //GUARDA UN ALOJAMIENTO
        
        Alojamiento alojamientos = new Alojamiento(LocalDate.of(2024, 10, 18), LocalDate.of(2024, 10, 20), true, "pensicon completa", 25000, ciudadesD, "cabaña");
        AlojamientoData a = new AlojamientoData();
        a.guardarAlojamiento(alojamientos);

        //GUARDA UN PASAJE
        
        Ciudad ciudadesO = new Ciudad("San Luis", "Argentina", true, "San Luis");
        d.agregarCiudad(ciudadesO);
        
        Pasaje pasajes = new Pasaje("Avion", 50000, ciudadesO, true);
        PasajeData p = new PasajeData();
        p.guardarPasaje(pasajes);
        
        //GUARDAR PAQUETE
        Paquete paquetes = new Paquete(ciudadesO,ciudadesD,alojamientos,pasajes);
        PaqueteData pd = new PaqueteData();
        pd.AgregarPaquete(paquetes);
*/


/*
        //BORRAR EL PAQUETE TURISTICO
        PaqueteData pd = new PaqueteData();
        pd.EliminarPaquete(1);
*/

/*

        Ciudad ciudadesD = new Ciudad("Rio de Janeiro", "Brazil", true, "Rio de Janeiro");

        Alojamiento alojamientos = new Alojamiento(LocalDate.of(2024, 11, 18), LocalDate.of(2024, 11, 20), true, "pensicon completa", 24000, ciudadesD, "hotel");

        Ciudad ciudadesO = new Ciudad("La Punta", "Argentina", true, "La Punta");
        
        Pasaje pasajes = new Pasaje("Colectivo", 60000, ciudadesO, true);

        Paquete paquetes = new Paquete(ciudadesO,ciudadesD,alojamientos,pasajes);
        PaqueteData pd = new PaqueteData();
        pd.ModificarPaquete(paquetes);
*/
    }

}
