/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.math.BigDecimal;

/**
 *
 * @author aguse
 */
public class Pasaje {
    private int id_pasaje;
    private String tipoTransporte;
    private BigDecimal importe;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private boolean estado;

    public Pasaje(int id_pasaje, String tipoTransporte, BigDecimal importe, Ciudad ciudadOrigen, Ciudad ciudadDestino, boolean estado) {
        this.id_pasaje = id_pasaje;
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.estado = estado;
    }

    public Pasaje(String tipoTransporte, BigDecimal importe, Ciudad ciudadOrigen, Ciudad ciudadDestino, boolean estado) {
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
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

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "id_pasaje=" + id_pasaje + ", tipoTransporte=" + tipoTransporte + ", importe=" + importe + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", estado=" + estado + '}';
    }

    
}
