/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Time;


/**
 *
 * @author lucho
 */
public class Pelicula {
    private String nombre;
    private String director;
    private Time duracion;

    public Pelicula() {
    }

    public Pelicula(String nombre, String director, Time horas) {
        this.nombre = nombre;
        this.director = director;
        this.duracion = horas;
    }

        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre: " + nombre + ", director: " + director + ", duracion: " + duracion + '}';
    }

    
    
    
}
