/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author aguse
 */
public class Turista {
    private int id_turista;
    private int dni;
    private String nombre;
    private int edad;
    private boolean estado;

    public Turista(int id_turista, int dni, String nombre, int edad, boolean estado) {
        this.id_turista = id_turista;
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    public Turista(int dni, String nombre, int edad, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }
    public Turista() {
}

    public int getId_turista() {
        return id_turista;
    }

    public void setId_turista(int id_turista) {
        this.id_turista = id_turista;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Turista{" + "id_turista=" + id_turista + ", dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + '}';
    }
    
}


