/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *3.	Recorrer un vector de N enteros contabilizando cuántos números son de 
 * 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * 
 * @author lucho
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del verctor");
        int n = leer.nextInt();
        int[] Vector = new int[n];
        for (int i = 0; i < Vector.length; i++) {
            Vector[i] = new Random().nextInt(999);
            //System.out.println("Ingrese numero de la pocision: " + i);
           // Vector[i]  = leer.nextInt();
        }
        for (int i = 0; i < Vector.length; i++) {
             System.out.print("("+Vector[i]+")");
        }
        System.out.println("");
        
        for (int i = 0; i < Vector.length; i++) {
            int cont = 0;
            int numero = Vector[i];
            do {
                numero = numero / 10;
                cont++;
            } while ( numero >= 1);
            System.out.println("El elemento " + (i+1) + " tiene " + cont + " digitos");
        }
    }
    
}
