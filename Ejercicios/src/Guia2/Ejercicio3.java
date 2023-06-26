/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio3 {
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println("La frase en mayuscula: " + frase.toUpperCase() );
        System.out.println("La frase en minuscula: " + frase.toLowerCase() );
    }
    
}
