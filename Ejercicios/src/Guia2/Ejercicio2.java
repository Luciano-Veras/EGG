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
public class Ejercicio2 {
    //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Nombre;
        System.out.println("Ingrese nombre completo");
        Nombre = leer.nextLine();
        System.out.println("El nombre del alumno es: " + Nombre);
        
    }
    
}
