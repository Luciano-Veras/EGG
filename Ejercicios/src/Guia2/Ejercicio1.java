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
public class Ejercicio1 {
    //Escribir un programa que pida dos números enteros por teclado y calcule la
    //suma de los dos. El programa deberá después mostrar el resultado de la suma
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Ingresar 1er numero: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese 2do numero: ");
        num2 = leer.nextInt();
        System.out.println("La suma de los numero es: " + (num1 + num2) );
        
        System.out.println("");//prubea
        
    }
}
