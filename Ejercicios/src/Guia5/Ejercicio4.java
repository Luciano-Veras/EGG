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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int [4][4];
        int[][] matrizT = new int [4][4];
        System.out.println("La matriz original");
        llenadoMatriz(matriz);
        System.out.println("");
        System.out.println("La matriz invertida");
        llenadoMatrizT(matriz, matrizT);
    }
    public static void llenadoMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = new Random().nextInt(16);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static void llenadoMatrizT(int[][] matriz, int[][] matrizT) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[i][j] = matriz[j][i];
                System.out.print("["+matrizT[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
