/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

import Cine.Entidades.Pelicula;
import Cine.Entidades.Persona;
import Cine.Entidades.SalaCine;
import Cine.Servicios.PeliculaServicio;
import Cine.Servicios.PersonaServicio;
import Cine.Servicios.SalaCineServicio;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class CineApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("CARGAMOS LA PELICULA");
        PeliculaServicio pS = new PeliculaServicio();
        Pelicula estreno = pS.crearPelicula();
        SalaCineServicio cS = new SalaCineServicio();
        SalaCine sala = cS.crearSala(estreno);
        boolean fin  = false;
        PersonaServicio perS = new PersonaServicio();
        System.out.println("BOLETERIA");
        do {
            Persona persona = perS.crearPersonas();
            cS.validamosPersona(persona, sala);
            perS.mostrarPersona(persona);
            System.out.println("¿Hay mas personas?SI/NO");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("NO")) {
                fin = true;
            }
        } while (!fin);
        System.out.println("MOSTRAMOS FUNCION Y ESTADO DE SALA");
        pS.mostrarPelicula(estreno);
        cS.mostrarSala(sala.getSala());
        
        

    }

}
