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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        llenadoMatriz(matriz);
        System.out.println("Matriz ingresada");
        System.out.println("");
        mostrarMatriz(matriz);
        chequeoFilas(matriz);
        chequeoColumnas(matriz);
        chequeoDiagonales(matriz);
        System.out.println("");
        System.out.println("Valores Magicos");
        System.out.println(chequeoFilas(matriz) + " " + chequeoColumnas(matriz) + " " + chequeoDiagonales(matriz) );
        System.out.println("");
        if (chequeoFilas(matriz) == chequeoColumnas(matriz)) {
            if (chequeoColumnas(matriz) == chequeoDiagonales(matriz)) {
                System.out.println("La matriz es un cuadrado magico");
            } else {
                System.out.println("La matriz NO es un cuadrado magico");
            }
            
        }
    }

    public static void llenadoMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero del 1 al 9");
        for (int i = 0; i < 3; i++) {
            int numero;
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingresar [" + i + "][" + j + "]");
                    numero = leer.nextInt();
                } while (numero < 0 || numero > 9);
                matriz[i][j] = numero;
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public static int chequeoFilas(int[][] matriz) {
        int numeroMagicoF = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                numeroMagicoF += matriz[i][j];
            }
        }
        for (int i = 1; i < 3; i++) {
            int checkFilas =0;
            for (int j = 0; j < 3; j++) {
                checkFilas += matriz[i][j];
            }
            if (numeroMagicoF != checkFilas) {
                return  0;
            }
        }
        return numeroMagicoF;
    }
    public static int chequeoColumnas(int[][] matriz) {
        int numeroMagicoC = 0;
        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < 3; i++) {
                numeroMagicoC += matriz[i][j];
            }
        }
        for (int j = 1; j < 3; j++) {
            int checkColumnas = 0;
            for (int i = 0; i < 3; i++) {
                checkColumnas += matriz[i][j];
            }
            if (numeroMagicoC != checkColumnas) {
                return 0;
            }
        }
        return numeroMagicoC;
    }
    public static int chequeoDiagonales(int[][] matriz){
        int numeroMagicoD = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    numeroMagicoD += matriz[i][j];
                }
            }
        }
        int checkDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) {
                     checkDiagonal += matriz[i][j];
                }
            }
        }
        if (numeroMagicoD == checkDiagonal) {
            return numeroMagicoD;
        } else {
            return 0;
        }
    }
}
