/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Pelicula;
import Entidades.Perro;
import java.util.Comparator;

/**
 *
 * @author lucho
 */
public class Comparadores {

    public static Comparator<Perro> ordenarPorRazaAsc = new Comparator<Perro>() {
        @Override
        public int compare(Perro t, Perro t1) {
            return t.getRaza().compareTo(t1.getRaza());
        }
    };

    public static Comparator<Pelicula> duracionMayorMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };

    public static Comparator<Pelicula> duracionMenorMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };

    public static Comparator<Pelicula> alfabeticamenteNombre = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };

    public static Comparator<Pelicula> alfabeticamenteDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

  

}
