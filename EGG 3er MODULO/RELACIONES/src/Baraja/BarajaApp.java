/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baraja;

import Baraja.Entidades.Baraja;
import Baraja.Entidades.Carta;
import Baraja.Entidades.Persona;
import Baraja.Servicios.BarajaServicio;
import Baraja.Servicios.PersonaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class BarajaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        BarajaServicio bS = new BarajaServicio();
        Baraja mazo = bS.crearBaraja();

        Persona jugador = new Persona();
        PersonaServicio pS = new PersonaServicio();
        ArrayList<Carta> cartasJugador = new ArrayList();

        bS.mostrarBarja(mazo);
        System.out.println("---------------");
        System.out.println("Mezclamos");
        bS.barajar(mazo);
        bS.mostrarBarja(mazo);
        System.out.println("-----------------");
        bS.cartasDisponibles(mazo);
        System.out.println("----------------");
        String respuesta;
        do {

            System.out.println("Cuantas cartas quiere");
            bS.darCartas(mazo, leer.nextInt(), cartasJugador);
            pS.mostrarCartasJugador(cartasJugador);
            System.out.println("---------");
            bS.mostrarBarja(mazo);
            System.out.println("---------------");
            bS.siguienteCarta(mazo);
            System.out.println("-----------------");
            bS.cartasDisponibles(mazo);
            System.out.println("----------------");
            if (mazo.getBaraja().isEmpty()) {
                System.out.println("JUEGO FINALIZADO");
                break;
            } else {
                System.out.println("Desea mas cartas SI/NO");
                respuesta = leer.next();
            }

        } while (respuesta.equalsIgnoreCase("SI"));

    }

}
