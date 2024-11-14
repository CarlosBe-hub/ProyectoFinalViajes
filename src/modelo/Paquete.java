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
  private double importePaquete;
  private Turista id_turista1;
  private Turista id_turista2;
  private Turista id_turista3;
  private Turista id_turista4;

    public Paquete(int id_paquete, String nombrePaquete, Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje, boolean estado, double importePaquete, Turista id_turista1, Turista id_turista2, Turista id_turista3, Turista id_turista4) {
        this.id_paquete = id_paquete;
        this.nombrePaquete = nombrePaquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
        this.importePaquete = importePaquete;
        this.id_turista1 = id_turista1;
        this.id_turista2 = id_turista2;
        this.id_turista3 = id_turista3;
        this.id_turista4 = id_turista4;
    }

    public Paquete(int id_paquete, String nombrePaquete, Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje, boolean estado, double importePaquete, Turista id_turista1, Turista id_turista2, Turista id_turista3) {
        this.id_paquete = id_paquete;
        this.nombrePaquete = nombrePaquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
        this.importePaquete = importePaquete;
        this.id_turista1 = id_turista1;
        this.id_turista2 = id_turista2;
        this.id_turista3 = id_turista3;
    }

    public Paquete(int id_paquete, String nombrePaquete, Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje, boolean estado, double importePaquete, Turista id_turista1, Turista id_turista2) {
        this.id_paquete = id_paquete;
        this.nombrePaquete = nombrePaquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
        this.importePaquete = importePaquete;
        this.id_turista1 = id_turista1;
        this.id_turista2 = id_turista2;
    }

    public Paquete(int id_paquete, String nombrePaquete, Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje, boolean estado, double importePaquete, Turista id_turista1) {
        this.id_paquete = id_paquete;
        this.nombrePaquete = nombrePaquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
        this.importePaquete = importePaquete;
        this.id_turista1 = id_turista1;
    }

    public Paquete(String nombrePaquete, Ciudad ciudadOrigen, Ciudad ciudadDestino, Alojamiento alojamiento, Pasaje pasaje, boolean estado, double importePaquete, Turista id_turista1) {
        this.nombrePaquete = nombrePaquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
        this.importePaquete = importePaquete;
        this.id_turista1 = id_turista1;
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

    public double getImportePaquete() {
        return importePaquete;
    }

    public void setImportePaquete(double importePaquete) {
        this.importePaquete = importePaquete;
    }

    public Turista getId_turista1() {
        return id_turista1;
    }

    public void setId_turista1(Turista id_turista1) {
        this.id_turista1 = id_turista1;
    }

    public Turista getId_turista2() {
        return id_turista2;
    }

    public void setId_turista2(Turista id_turista2) {
        this.id_turista2 = id_turista2;
    }

    public Turista getId_turista3() {
        return id_turista3;
    }

    public void setId_turista3(Turista id_turista3) {
        this.id_turista3 = id_turista3;
    }

    public Turista getId_turista4() {
        return id_turista4;
    }

    public void setId_turista4(Turista id_turista4) {
        this.id_turista4 = id_turista4;
    }

    @Override
    public String toString() {
        return "Paquete{" + "id_paquete=" + id_paquete + ", nombrePaquete=" + nombrePaquete + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", alojamiento=" + alojamiento + ", pasaje=" + pasaje + ", estado=" + estado + ", importePaquete=" + importePaquete + ", id_turista1=" + id_turista1 + ", id_turista2=" + id_turista2 + ", id_turista3=" + id_turista3 + ", id_turista4=" + id_turista4 + '}';
    }
  
}