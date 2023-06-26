/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;



/**
 *
 * @author lucho
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Vector = new int[100];
        for (int i = 0; i < Vector.length; i++) {
            Vector[i] = i+1;
        }
        String aux = "";
        for (int elemento: Vector) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);
        String aux1 = "";
        int elemento1;
        for (int i = Vector.length-1; i >= 0 ; i--) {
            elemento1 = Vector[i];
            aux1 += " " + Vector[i];
        }
        System.out.println(aux1);
    }
    
}
