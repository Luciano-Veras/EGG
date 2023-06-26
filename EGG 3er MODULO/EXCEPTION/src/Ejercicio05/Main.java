/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("ADIVINE UN NUMERO DE 1 A 500");

        Random num = new Random();
        int number = num.nextInt(500) + 1;

        System.out.println("El numero aleatorio es: " + number);

        int cont = 0;
        int adivinado = 0;
        do {
            try {
                System.out.print("Ingrese un numero entero: ");
                adivinado = leer.nextInt();
                cont++;
                System.out.println("");
                if (adivinado > number) {
                    System.out.println("El numero a adivinar es menor.");
                } else if(adivinado < number) {
                    System.out.println("El numero a adivinar es mayor.");
                }
            } catch (InputMismatchException e) {
                cont++;
                System.out.println("Error: ingrese numero valido " + e);
                leer = new Scanner(System.in);
                System.out.println("");
            }

        } while (number != adivinado);
        System.out.println("Felicitaciones adivino, el numero de intentos fue: " + cont);
    }

}
