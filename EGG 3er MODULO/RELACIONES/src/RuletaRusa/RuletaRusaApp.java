/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusa;

import RuletaRusa.Entidades.Juego;
import RuletaRusa.Entidades.Jugador;
import RuletaRusa.Entidades.Revolver;
import RuletaRusa.Servicios.JuegoServicio;
import RuletaRusa.Servicios.JugadorServicio;
import RuletaRusa.Servicios.RevolverServicio;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author lucho
 */
/**
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente. Métodos: 
 * • llenarRevolver(): le pone
 * los valores de posición actual y de posición del agua. Los valores deben ser
 * aleatorios. 
 * • mojar(): devuelve true si la posición del agua coincide con la
 * posición actual 
 * • siguienteChorro(): cambia a la siguiente posición del
 * tambor 
 * • toString(): muestra información del revolver (posición actual y
 * donde está el agua) 
 * Clase Jugador: esta clase posee los siguientes atributos:
 * id (representa el número del jugador), nombre (Empezara con Jugador más su
 * ID, “Jugador 1” por ejemplo) y mojado (indica si está mojado o no el
 * jugador). El número de jugadores será decidido por el usuario, pero debe ser
 * entre 1 y 6. Si no está en este rango, por defecto será 6. Métodos:
 * •disparo(Revolver r): el método, recibe el revolver de agua y llama a los
 * métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta,
 * aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El
 * atributo mojado pasa a false y el método devuelve true, sino false. 
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
 * Jugadores) y Revolver Métodos: 
 * • llenarJuego(ArrayListjugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos
 * en los atributos del juego. 10 
 *• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el revolver
 * tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa
 * al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
 * mojar. Al final del juego, se debe mostrar que jugador se mojó. Pensar la
 * lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class RuletaRusaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JugadorServicio jS = new JugadorServicio();
        RevolverServicio rS = new RevolverServicio();
        JuegoServicio juS = new JuegoServicio();
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenidos al juego Ruleta de Agua");
        System.out.println("");
        
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese cantidad de jugadores");
        int cant = leer.nextInt();
        if (cant > 6) {
            cant = 6;
        }
        for (int i = 0; i < cant; i++) {
            Jugador x = jS.cargarJugadores(cant, i);
            jugadores.add(x);
        }
        
        Revolver revolver = rS.llenarRevolver();
        rS.mostrarPocision(revolver);
        
        Juego juego = juS.llenarJuego(jugadores, revolver);
        juS.ronda(juego);
      
    }

}
