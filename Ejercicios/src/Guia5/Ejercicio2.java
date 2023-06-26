/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Scanner;

/*2.	Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido*/
/**
 *
 * @author lucho
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del verctor");
        int n = leer.nextInt();
        int[] Vector = new int[n];
        for (int i = 0; i < Vector.length; i++) {
            Vector[i] = (int)(Math.random()*10);
            System.out.print("("+Vector[i]+")");
        }
        System.out.println("");
        System.out.println("Ingrese el numero que desea buscar");
        int numero = leer.nextInt();
        for (int i = 0; i < Vector.length; i++) {
            if (Vector[i] == numero) {
                System.out.println("El numero se ingresa en la pocision: " + i);
            }
        }
            
        
    }
    
}
