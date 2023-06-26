/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese tamañao de la matriz: ");
        int numero  = leer.nextInt();
        System.out.println("");
        int[] vector = new int[numero];
        int suma = 0;
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese el elemento de la pocision " + i + " :");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de todos los elementos es: " + suma);
    }
    
}
