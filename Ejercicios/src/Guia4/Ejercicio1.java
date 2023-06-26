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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num1, num2, opcion, respuesta;
        System.out.println("Ingrese 1er numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese 2do numero");
        num2 = leer.nextInt();
        System.out.println("Eleja una opcion del 1 al 4");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        opcion = leer.nextInt();
        respuesta = operaciones (opcion, num1, num2);
        System.out.println("El resultado es: " + respuesta);
      //sacamos los int para invocar la funcion
      
    }
    public static int operaciones ( int opcion, int num1, int num2) {
        switch (opcion) {
            case 1:
                int sumar = num1 + num2;
                return sumar;
               // break lo sacamos por que con el return lo demas no se ejecuta
            case 2:
                int resta = num1 - num2;
                return resta;
            case 3:
                int multiplicar = num1 * num2;
                return multiplicar;
            case 4:
                int dividir = num1 / num2;
                return dividir;
            default:
                System.out.println("Opcion incorrecta");
                return 0;
        }
       
    }
}
