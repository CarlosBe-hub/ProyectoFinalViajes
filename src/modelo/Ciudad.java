/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author carlo
 */
public class Ciudad {
  private int id_ciudad;
private String nombre;
private String pais;
private boolean estado;
private String provincia;

public Ciudad(){
}

    public Ciudad(String nombre, String pais, boolean estado, String provincia) {
        this.nombre = nombre;
        this.pais = pais;
        this.estado = estado;
        this.provincia = provincia;
    }

    public Ciudad(int id_ciudad, String nombre, String pais, boolean estado, String provincia) {
        this.id_ciudad = id_ciudad;
        this.nombre = nombre;
        this.pais = pais;
        this.estado = estado;
        this.provincia = provincia;
    }

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id_ciudad=" + id_ciudad + ", nombre=" + nombre + ", pais=" + pais + ", estado=" + estado + ", provincia=" + provincia + '}';
    }
    

}
