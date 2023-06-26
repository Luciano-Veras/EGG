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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matriz = new int [3][3];
       int[][] matrizT = new int [3][3];
       crearMatriz(matriz);
       System.out.println("");
       transpuesta(matriz, matrizT); 
       System.out.println("Las matriz es antisimetrica?");
       boolean respuesta = chequeo(matriz, matrizT);
       System.out.println(respuesta);
    }   
    public static void crearMatriz(int[][] matriz){
       Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]= azar.nextInt(9)-4;//leer.nextInt();
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println("");
        }
    }
    public static void transpuesta(int[][] matriz, int[][] matrizT){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j]=matriz[j][i];
                System.out.print(matrizT[i][j]+"|");
            }
            System.out.println("");
        }
    }
    public static boolean chequeo(int[][]matriz, int[][] matrizT){
        boolean comparacion = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] - ( -(matrizT[i][j]) ) != 0 ){
                    comparacion = false;
                    break;
                }
            }    
        }
        return comparacion;
    }
    
}
