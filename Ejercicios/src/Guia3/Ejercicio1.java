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
public class Ejercicio1 {
//1.	Crear un programa que dado un número determine si es par o impar
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = leer.nextInt();
        if ( numero % 2 == 0 ){
            System.out.println("El numero ingresado es par.");
        }else {
            System.out.println("El numero ingresado es impar.");
        }
    }
    
}
