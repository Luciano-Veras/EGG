/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adoptar.Entidades;

import Adoptar.Enumeraciones.Tamanio;

/**
 *
 * @author lucho
 */
public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private Tamanio tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, Tamanio tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(int pocision) {
        Tamanio[] elemento = Tamanio.values();
        if (pocision >= 0 && pocision < elemento.length) {
            this.tamanio = elemento[pocision];
        }
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", tamanio: " + tamanio + '}';
    }
    
    
}
