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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion;
        do {
            System.out.println("Ingrese el primer numero entero positivo");
            num1 = leer.nextInt();
        } while (num1 < 0);
        do {
            System.out.println("Ingrese el segundo numero entero positivo");
            num2 = leer.nextInt();
        } while (num2 < 0);    
        do {
            System.out.println("MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("ELIJA UNA OPCION");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 :
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                 case 2 :
                    System.out.println("La resta es: " + (num1-num2));
                    break;
                 case 3 :
                    System.out.println("La la multiplicacion es: " + (num1*num2));
                    break;
                 case 4 :
                    System.out.println("La division es: " + (num1/num2));
                    break;
                 case 5 :
                    System.out.println("¿Esta seguro que desea salir del programa? (S/N). ");
                    String frase = leer.next();
                    if (frase.equalsIgnoreCase("S")) {
                        opcion = 6;
                    }   
                    break;
            }
        } while (opcion < 6);
        System.out.println("Muchas gracias");
    }

}
//char obra = sc.next().toUpperCase().charAt(0);
           // String opcion = String.valueOf(obra);

//Esa era la manera correcto de hacer lo de la S/N