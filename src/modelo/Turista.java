/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author carlo
 */
public class Turista {
private String nombre_completo;
private int dni;
private int edad;

public Turista(){
} 

    public Turista(String nombre_completo, int dni, int edad) {
        this.nombre_completo = nombre_completo;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Turista{" + "nombre_completo=" + nombre_completo + ", dni=" + dni + ", edad=" + edad + '}';
    }

}
