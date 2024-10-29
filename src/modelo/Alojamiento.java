/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author aguse
 */
public class Alojamiento {
    private int id_alojamiento;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean estado;
    private String servicio;
    private BigDecimal importeDiario;
    private Ciudad ciudadDestino;
    private String tipoAlojamiento;

    public Alojamiento(int id_alojamiento, LocalDate fechaInicio, LocalDate fechaFin, boolean estado, String servicio, BigDecimal importeDiario, Ciudad ciudadDestino, String tipoAlojamiento) {
        this.id_alojamiento = id_alojamiento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDestino = ciudadDestino;
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public Alojamiento(LocalDate fechaInicio, LocalDate fechaFin, boolean estado, String servicio, BigDecimal importeDiario, Ciudad ciudadDestino, String tipoAlojamiento) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDestino = ciudadDestino;
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public Alojamiento() {
    }

    public int getId_alojamiento() {
        return id_alojamiento;
    }

    public void setId_alojamiento(int id_alojamiento) {
        this.id_alojamiento = id_alojamiento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public BigDecimal getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(BigDecimal importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "id_alojamiento=" + id_alojamiento + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", estado=" + estado + ", servicio=" + servicio + ", importeDiario=" + importeDiario + ", ciudadDestino=" + ciudadDestino + ", tipoAlojamiento=" + tipoAlojamiento + '}';
    }


}
