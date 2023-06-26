/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Extras;

import Guia7POO.Extras.Entidades.Juego;

/**
 *
 * @author lucho
 */
public class Extra3_Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego play = new Juego();  
        play.iniciar_Juego();
        System.out.println("El numero de veces que gano el jugador 1: " + play.getContJugador1());
        System.out.println("");
        System.out.println("El numero de veces que gano el jugador 2: " + play.getContJugador2());
        System.out.println("");
        if (play.getContJugador2() > 0) {
            System.out.println("El numero de intentos que necesito para ganar la partida fue: " + play.getContIntentos());
        }
    }
    

}
