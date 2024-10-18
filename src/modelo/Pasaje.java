/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aguse
 */
public class Pasaje {
    private int id_pasaje;
    private String tipoTransporte;
    private double importe;
    private Ciudad ciudadOrigen;
    private boolean estado;

    public Pasaje(int id_pasaje, String tipoTransporte, double importe, Ciudad ciudadOrigen, boolean estado) {
        this.id_pasaje = id_pasaje;
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.ciudadOrigen = ciudadOrigen;
        this.estado = estado;
    }

    public Pasaje(String tipoTransporte, double importe, Ciudad ciudadOrigen, boolean estado) {
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.ciudadOrigen = ciudadOrigen;
        this.estado = estado;
    }

    public Pasaje() {
    }

    public int getId_pasaje() {
        return id_pasaje;
    }

    public void setId_pasaje(int id_pasaje) {
        this.id_pasaje = id_pasaje;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "id_pasaje=" + id_pasaje + ", tipoTransporte=" + tipoTransporte + ", importe=" + importe + ", ciudadOrigen=" + ciudadOrigen + ", estado=" + estado + '}';
    }
    
    
}
