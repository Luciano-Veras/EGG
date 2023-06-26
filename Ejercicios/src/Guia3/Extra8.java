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
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cantidad = 0, par = 0, impar = 0;
        do {
            System.out.println("Ingresa nuemeros enteros");
            num = leer.nextInt();
            if (num % 5 == 0) {
                cantidad++;
                break;
            } else if (num % 2 == 0 && num > 0) {
                par++;
                cantidad++;
            } else if (num > 0){
                impar++;
                cantidad++;
            }
        } while (num % 5 != 0);
        System.out.println("La cantidad de numeros ingresados es : " + cantidad);
        System.out.println("La cantidad de numeros par ingresados es : " + par);
        System.out.println("La cantidad de numeros impar ingresados es : " + impar);
    }
    
}
