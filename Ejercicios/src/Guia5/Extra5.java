/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import java.util.Random;

/**
 *
 * @author lucho
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        llenadoArray(array);
        mostrarArray(array);
        System.out.println("Ahora se mostrara la suma de los elementos");
        sumaArray(array);
        System.out.println("");
        System.out.println("La suma de los elementos es igual a: " + sumaArray(array));
        
    }
    public static void llenadoArray(int[][] array) {
                Random llenar = new Random();

        for(int[] fila : array) {
            for (int i = 0; i < 6; i++) {
                fila[i] = llenar.nextInt(10);
            }
        }
    }
    public static void mostrarArray(int[][] array) {
        for (int[] fila : array) {
            for (int columna : fila) {
                System.out.print(columna +"|");
            }
            System.out.println("");
        }
    }
    public static int sumaArray(int[][] array) {
        int suma = 0;
        for (int[] fila : array) {
            for (int columna : fila) {
             suma += columna;   
            }   
        }
        return suma;
    }
}

