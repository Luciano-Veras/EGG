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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar dos numero enteros mayor a 1");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int cont = 1, residuo = 0, resta;
        do {
            resta = num1 - num2;
            System.out.println(num1 +" - "+num2+" = "+resta+" "+cont+" resta realizada" );
            num1=resta;
            cont++;
        } while (resta>=num2);
        System.out.println("El residuo es :"+resta+" y el cociente es "+(cont-1));
    }
    
}
