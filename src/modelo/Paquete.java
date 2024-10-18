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
  private Ciudad ciudadOrigen;
  private Ciudad ciudadDestino;
  private Alojamiento alojamiento;
  private Pasaje pasaje;

    public Paquete(int id_paquete, Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje) {
        this.id_paquete = id_paquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
    }

    public Paquete(Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
    }

    public Paquete() {
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
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

    @Override
    public String toString() {
        return "Paquete{" + "id_paquete=" + id_paquete + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", alojamiento=" + alojamiento + ", pasaje=" + pasaje + '}';
    }
  
  
  
}