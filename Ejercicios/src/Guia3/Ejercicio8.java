/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int lado;
        System.out.println("Ingrese tamaño del lado");
        lado = leer.nextInt();
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i==0 || i==lado-1 ) {
                    System.out.print("*");
                } else if (j==0 || j==lado-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
