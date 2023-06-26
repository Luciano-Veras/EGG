/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Pelicula cargarPelicula() {
        System.out.println("Ingrese el nombre de la pelicula");
        String nombre = leer.next();
        System.out.println("Ingrese el nombre del director");
        String director = leer.next();
        System.out.println("Ingrese cuanto dura la pelicula HH:MM:SS");
        System.out.println("Horas");
        int horas = leer.nextInt();
        System.out.println("Minutos");
        int minutos = leer.nextInt();
        System.out.println("Segundos");
        int segundos = leer.nextInt();
        Time duracion = new Time(horas, minutos, segundos);
        return new Pelicula(nombre, director, duracion);
    }
    
    public ArrayList<Pelicula> cartelera(ArrayList<Pelicula> auxL) {
        System.out.println("----CARGANDO PELICULAS A LA CARTELERA----");
        String respuesta;
        do {
            Pelicula auxP = cargarPelicula();
            auxL.add(auxP);
            System.out.println("Desea cargar otra pelicula (SI/NO)");
            respuesta = leer.next();
            while (!respuesta.equalsIgnoreCase("SI") && !respuesta.equalsIgnoreCase("NO")) {
                System.out.println("Respuesta incorrecta, intente de nuevo");
                respuesta = leer.next();
            }
        } while (respuesta.equalsIgnoreCase("SI"));
        return auxL;
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> auxL) {
        System.out.println("----CARTELERA DEL CINE VILLA CABRERA----");
        for (Pelicula auxP : auxL) {
            System.out.println(auxP);
        }
    }
    
    public void mayorUnaHora(ArrayList<Pelicula> auxL) {
        System.out.println("----PELICULAS QUE DURAN MAS DE UNA HORA---");
        System.out.println("----CARTELERA DEL CINE VILLA CABRERA----");
        Iterator<Pelicula> it = auxL.iterator();
        Time auxT = new Time(1,0,0);
        while (it.hasNext()) {
            Pelicula auxP = it.next();
            if (auxP.getDuracion().compareTo(auxT) > 0) {
                System.out.println(auxP);
            } 
        }
    }
    
    public void duracionMayorMenor(ArrayList<Pelicula> auxL) {
        System.out.println("----PELICULAS ORDENADAS POR DURACION DE MAYOR A MENOR----");
        Collections.sort(auxL, Comparadores.duracionMayorMenor);
        mostrarPeliculas(auxL);
    }

    public void duracionMenorMayor(ArrayList<Pelicula> auxL) {
        System.out.println("---PELICULAS ORDENADAS POR DURACION DE MENOR A MAYOR----");
        Collections.sort(auxL, Comparadores.duracionMenorMayor);
        mostrarPeliculas(auxL);
    }

    public void alfabeticamenteTitulo(ArrayList<Pelicula> auxL) {
        System.out.println("----PELICULAS ALFABETICAMENTE POR TITULO----");
        Collections.sort(auxL, Comparadores.alfabeticamenteNombre);
        mostrarPeliculas(auxL);
    }

    public void alfabeticamenteDirector(ArrayList<Pelicula> auxL) {
        System.out.println("---PELICULAS ALFABETICAMENTE POR DIRECTOR----");
        Collections.sort(auxL, Comparadores.alfabeticamenteDirector);
        mostrarPeliculas(auxL);
    }


    
}
