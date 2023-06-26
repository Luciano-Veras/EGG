/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baraja.Servicios;

import Baraja.Entidades.Carta;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lucho
 */
public class PersonaServicio {

    public void mostrarCartasJugador(ArrayList<Carta> cartaJugador) {
        if (cartaJugador.isEmpty()) {
            System.out.println("El jugador no tiene cartas");
        } else {
            System.out.println("Cartas entregadas al jugador");
            Iterator<Carta> it = cartaJugador.iterator();
            while (it.hasNext()) {
                Carta auxC = it.next();
                System.out.println(auxC.toString());
            }
        }

    }
}
