/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de la escaler");
        int tamanio = leer.nextInt();
        int cont = 0;
        int suma = 1;
        for (int i = 0; i < tamanio; i++) {
            if (i == 0) {
                System.out.println(suma);
            } else if (cont == i) {
                suma = suma * 10 + (i+1);
                System.out.println(suma);
            }
            cont++;        
        }
        String escalon, escalera = "";
        for (int i = 0; i < tamanio; i++) {
            escalon = String.valueOf(i + 1);
            escalera = escalera + escalon;
            System.out.println(escalera);
        }
    }
    
}
