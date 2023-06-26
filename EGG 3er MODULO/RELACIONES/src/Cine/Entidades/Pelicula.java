/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Entidades;

import java.sql.Time;



/**
 *
 * @author lucho
 */
public class Pelicula {
    private String titulo;
    private Time duracion;
    private int edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Time duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{\n" + "Titulo: " + titulo + "\nDuracion: " + duracion + "\nEdad Minima: " + edadMinima + "\nDirector: " + director + '}';
    }
    
    
    
}
