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
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = new int [5][5];
        llenadoArray(array);
        System.out.println("\n* Matriz");
        imprimirArray(array);
    }
    
    public static void llenadoArray(int[][] array){
        for (int[] fila : array) {
            for (int i = 0; i < fila.length; i++) {
                fila[i] = new Random().nextInt(10);
            }
        }
    }
    
    public static void imprimirArray(int[][] array){
        String aux;
        for (int[] fila : array) {
            aux = "";
            for (int elemento : fila) {
             aux += "|" + elemento;   
            }
            System.out.println(aux);
        }
    }

}
