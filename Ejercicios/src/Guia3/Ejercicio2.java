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
public class Ejercicio2 {
//2.	Crear un programa que pida una frase y si esa frase es igual a “eureka” 
// el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
//Incorrecto. Nota: investigar la función equals() en Java.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     String frase;
        System.out.println("Escribir una frase : ");
        frase = leer.nextLine();
        if ( frase.toLowerCase().equals("eureka")){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}
