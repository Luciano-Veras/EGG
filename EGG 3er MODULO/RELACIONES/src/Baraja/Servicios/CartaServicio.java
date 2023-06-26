/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baraja.Servicios;

import Baraja.Entidades.Carta;
import Baraja.Enumeraciones.Palos;
import java.util.ArrayList;

/**
 *
 * @author lucho
 */
public class CartaServicio {
    
    public ArrayList<Carta> crearCartas() {
        ArrayList<Carta> listaCartas = new ArrayList();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < 7 ) {
                    Carta aux = new Carta((j+1), Palos.values()[i]);
                    listaCartas.add(aux);
                } else if (j == 7) {
                    Carta aux = new Carta((10), Palos.values()[i]);
                    listaCartas.add(aux);
                } else if (j == 8) {
                    Carta aux = new Carta((11), Palos.values()[i]);
                    listaCartas.add(aux);
                } else {
                    Carta aux = new Carta((12), Palos.values()[i]);
                    listaCartas.add(aux);
                }
            }
        }
        return listaCartas;
    }
    
}
