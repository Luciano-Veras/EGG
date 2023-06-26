/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baraja.Servicios;

import Baraja.Entidades.Baraja;
import Baraja.Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author lucho
 */
public class BarajaServicio {

    public Baraja crearBaraja() {
        CartaServicio auxC = new CartaServicio();
        Baraja auxB = new Baraja();
        auxB.setBaraja(auxC.crearCartas());
        return auxB;
    }

    public void mostrarBarja(Baraja aux) {
        System.out.println("La baraja actual");
        Iterator<Carta> it = aux.getBaraja().iterator();
        if (aux.getBaraja().isEmpty()) {
            System.out.println("No hay nada que mostrar Mostro lo dice por todos lados");
        } else {
            while (it.hasNext()) {
                Carta auxC = it.next();
                System.out.println(auxC.toString());
            }
        }

    }

    public void barajar(Baraja aux) {
        Collections.shuffle(aux.getBaraja());
    }

    public void siguienteCarta(Baraja aux) {
        System.out.println("Carta siguiente");
        if (aux.getBaraja().isEmpty()) {
            System.out.println("No quedan mas cartas para dar");

        } else {
            Iterator<Carta> it = aux.getBaraja().iterator();
            while (it.hasNext()) {
                System.out.println(it.next().toString());
            }
        }
        

    }

    public void cartasDisponibles(Baraja aux) {
        System.out.println("La cantidad de cartas disponibles: ");
        if (aux.getBaraja().isEmpty()) {
            System.out.println("No quedan cartas en el mazo");
        } else {
            System.out.println(aux.getBaraja().size());
        }

    }

    public void darCartas(Baraja aux, int cantidad, ArrayList<Carta> cartasJugador) {
        Iterator<Carta> it = aux.getBaraja().iterator();
        if (aux.getBaraja().isEmpty()) {
            System.out.println("se acabaron las cartas");
        } else if (cantidad <= aux.getBaraja().size()) {
            for (int i = 0; i < cantidad; i++) {
                cartasJugador.add(it.next());
                it.remove();
            }
        } else {
            System.out.println("La cantidad solicitada es mayor a la cantidad disponible");
        }
    }

}
