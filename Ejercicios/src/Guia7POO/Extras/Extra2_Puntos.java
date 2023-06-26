/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Extras;

import Guia7POO.Extras.Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra2_Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        Puntos punto = new Puntos();
        System.out.println("Ingresamos las coordenadas de los puntos punto");
        Puntos punto1 = punto.crearPunto(punto);
        System.out.println("X1= " + punto1.x1 + " Y1= " + punto1.y1 + " X2= " + punto1.x1 + " Y2= " + punto1.y1);
        System.out.println("");
        punto1.distancia(punto1);
        
    }

}
