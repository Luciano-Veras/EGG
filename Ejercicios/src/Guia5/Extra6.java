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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random azar = new Random();
        String[][] array = new String[20][20];
        System.out.println("Ingrese 5 palabras que contenga de 3 a 5 caracteres");
        System.out.println("1ra Palabra");
        String palabra1 = chequeoPalabras();
        System.out.println("2da Palabra");
        String palabra2 = chequeoPalabras();
        System.out.println("3ra Palabra");
        String palabra3 = chequeoPalabras();
        System.out.println("4ta Palabra");
        String palabra4 = chequeoPalabras();
        System.out.println("5ta Palabra");
        String palabra5 = chequeoPalabras();
        System.out.println("Sopa de letra");
        System.out.println("");
        
       
        int newi = azar.nextInt(20);
        int checknewi = newi;
        for (int i = newi; i < (newi + 1); i++) {
            for (int j = 0; j < palabra1.length(); j++) {
                array[i][j] = palabra1.substring(j, j + 1);
            }
        }
        mostrarMatriz(array);
        do {
          newi = azar.nextInt(20);          
        } while (newi == checknewi);
        checknewi = newi;
        for (int i = newi; i < (newi + 1); i++) {
            for (int j = 0; j < palabra2.length(); j++) {
                array[i][j] = palabra2.substring(j, j + 1);
            }
        }
        mostrarMatriz(array);
    }
    public static String chequeoPalabras() {
        Scanner leer = new Scanner(System.in);
        boolean fin = false;
        String palabra = leer.nextLine(); 
        do {
            if (palabra.length() > 2 && palabra.length() < 6) {
                fin = true;
            } else {
                System.out.println("Palabra incorrecta, vuelva a intentar");
                palabra = leer.nextLine();
            }
        } while (fin != true);
        return palabra;
    }
    public static void inicializacionMatriz(String[][] array) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                array[i][j] = "X";
            }
        }
    }
    public static void mostrarMatriz(String[][] array) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(array[i][j] + "|");
            }
            System.out.println("");
        }
    }
   

}
