/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de los vectores a analizar: ");
        int tamanio = leer.nextInt();
        int[] vector = new int [tamanio];
        int[] vector1 = new int [tamanio];
        Random llenado = new Random();
        for (int i = 0; i < tamanio; i++) {
            //vector[i] = llenado.nextInt(10)+0;
            vector[i] = leer.nextInt();
            System.out.print(vector[i] + "|");
        }
        System.out.println("");
        for (int i = 0; i < tamanio; i++) {
            //vector1[i] = llenado.nextInt(10)+0;
            vector1[i] = leer.nextInt();
            System.out.print(vector1[i] + "|");
        }
        System.out.println("");
        int cont = 0;
        for (int i = 0; i < tamanio; i++) {
            if (vector[i] != vector1[i]) {
                System.out.println("Los vectores no son iguales");
                break;
            } else {
                cont++;
            }
            if (cont == tamanio) {
                System.out.println("Los vectores son iguales");
            }
        }
    }
    
}
