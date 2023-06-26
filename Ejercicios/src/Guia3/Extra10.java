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
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
     double num1 = Math.random()*10;
     double num2 = Math.random()*10;
     int num3 = (int)num1;
     int num4 = (int)num2;
     double mult = (num3*num4);
        System.out.println(mult);
     double eleccion;
        do {
            System.out.println("Adivine la multiplicacion");
            eleccion = leer.nextDouble();
        } while (mult != eleccion);
    }
    
}
