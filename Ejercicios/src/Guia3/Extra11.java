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
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        int  cont = 0, division;
        do {
            division = numero/10; 
            cont++;
            numero = division;
        } while ( division>0 );
        System.out.println("El numero ingresado tiene " + cont + " digitos.");
    }
    
}
