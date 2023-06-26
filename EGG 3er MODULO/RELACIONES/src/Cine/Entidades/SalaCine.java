/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Entidades;


/**
 *
 * @author lucho
 */
public class SalaCine {
    private Pelicula peliculas;
    private String[][] sala;
    private Integer precio;

    public SalaCine() {
    }
    
    public SalaCine(Pelicula peliculas, String[][] sala, Integer precio) {
        this.peliculas = peliculas;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula peliculas) {
        this.peliculas = peliculas;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    
}
