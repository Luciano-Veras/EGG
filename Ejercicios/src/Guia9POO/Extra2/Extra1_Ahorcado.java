/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Extra2;

import Guia9POO.Extra2.Entidades.Ahorcado;
import Guia9POO.Extra2.Servicios.AhorcadoServicio;

/**
 *
 * @author lucho
 */
public class Extra1_Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoServicio ahorcadoS = new AhorcadoServicio();
        Ahorcado newJuego = new Ahorcado();
        ahorcadoS.juego(newJuego);
        
    }
    
}
