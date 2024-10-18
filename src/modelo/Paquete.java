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
  private int id_ciudadOrigen;
  private int id_ciudadDestino;
  private int id_alojamiento;
  private int id_pasaje;
  
  public Paquete(){           
  }

    public Paquete(int id_paquete, int id_ciudadOrigen, int id_ciudadDestino, int id_alojamiento, int id_pasaje) {
        this.id_paquete = id_paquete;
        this.id_ciudadOrigen = id_ciudadOrigen;
        this.id_ciudadDestino = id_ciudadDestino;
        this.id_alojamiento = id_alojamiento;
        this.id_pasaje = id_pasaje;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public int getId_ciudadOrigen() {
        return id_ciudadOrigen;
    }

    public void setId_ciudadOrigen(int id_ciudadOrigen) {
        this.id_ciudadOrigen = id_ciudadOrigen;
    }

    public int getId_ciudadDestino() {
        return id_ciudadDestino;
    }

    public void setId_ciudadDestino(int id_ciudadDestino) {
        this.id_ciudadDestino = id_ciudadDestino;
    }

    public int getId_alojamiento() {
        return id_alojamiento;
    }

    public void setId_alojamiento(int id_alojamiento) {
        this.id_alojamiento = id_alojamiento;
    }

    public int getId_pasaje() {
        return id_pasaje;
    }

    public void setId_pasaje(int id_pasaje) {
        this.id_pasaje = id_pasaje;
    }

    @Override
    public String toString() {
        return "Paquete{" + "id_paquete=" + id_paquete + ", id_ciudadOrigen=" + id_ciudadOrigen + ", id_ciudadDestino=" + id_ciudadDestino + ", id_alojamiento=" + id_alojamiento + ", id_pasaje=" + id_pasaje + '}';
    }
    
  
}
