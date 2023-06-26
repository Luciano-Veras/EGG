/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Servicios;

import Cine.Entidades.Pelicula;
import java.sql.Time;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PeliculaServicio {

    public Pelicula crearPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Pelicula aux = new Pelicula();
        System.out.print("Ingrese nombre de la pelicula: ");
        aux.setTitulo(leer.next());
        System.out.print("Director de la pelicula: ");
        aux.setDirector(leer.next());
        System.out.println("Ingrese duracion de la pelicula:");
        System.out.print("Horas: ");
        int horas = leer.nextInt();
        System.out.print("Minutos: ");
        int minutos = leer.nextInt();
        System.out.print("Segundos: ");
        int segundos = leer.nextInt();
        aux.setDuracion(new Time(horas, minutos, segundos));
        System.out.print("Peliculas apta para mayores de: ");
        aux.setEdadMinima(leer.nextInt());
        return aux;
    }
    
    public void mostrarPelicula(Pelicula aux) {
        System.out.println(aux.toString());
    }
}
