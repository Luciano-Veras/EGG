/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio2 {
//Diseñe una función que pida el nombre y la edad de N personas e imprima los 
//datos de las personas ingresadas por teclado e indique si son mayores o menores 
//de edad. Después de cada persona, el programa debe preguntarle al usuario si 
//quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fin , nombre ,chequeo;
        int edad;
        do {
            System.out.println("Ingresar el nombre de la persona");
            nombre = leer.next();
            System.out.println("Ingresar la edad de la persona");
            edad = leer.nextInt();
            System.out.println("Los datos ingresados son: " + nombre + ", " + edad);
            chequeo = validacion( edad );
            System.out.println("La persona: " + chequeo );
            System.out.println("Desea seguir ingresando datos S/N");
            fin = leer.next();  
        } while (fin.equalsIgnoreCase("S"));

    }

    public static String  validacion(int edad) {
        //subproceso 
        if (edad < 18) {
            String respuesta = "Es menor de edad";
            return respuesta;
                    } else {
            String respuesta = "Es mayor de edad";
            return respuesta;
        }
    }
}
