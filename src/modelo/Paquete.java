/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author carlo
 */
public class Paquete {
  private int id_paquete;
  private String nombrePaquete;
  private Ciudad ciudadOrigen;
  private Ciudad ciudadDestino;
  private Alojamiento alojamiento;
  private Pasaje pasaje;
  private boolean estado;

    public Paquete(int id_paquete, String nombrePaquete, Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje, boolean estado) {
        this.id_paquete = id_paquete;
        this.nombrePaquete = nombrePaquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
    }
    

    public Paquete(String nombrePaquete, Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje, boolean estado) {
        this.nombrePaquete = nombrePaquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
    }

    public Paquete(Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje, boolean estado) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
    }
    

    public Paquete() {
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  id_paquete + ", " + nombrePaquete;
    }

    
  
}