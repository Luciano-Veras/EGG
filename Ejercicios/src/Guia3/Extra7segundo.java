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
public class Extra7segundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        int cantidad = leer.nextInt();
        int minimo = 0 , maximo = 0, cambio;
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingreser el " + (i + 1) + "numero:");
            int num = leer.nextInt();
            if (i == 0) {
                minimo = num;
                maximo = num;
            } else {
                do {
                    if (maximo<num) {
                        maximo=num;
                        cambio = 1;
                    }else if (minimo>num) {
                        minimo=num;
                        cambio = 1;
                    }else {
                        cambio=1;
                    }
                } while (cambio==0);
                
            }
            suma += num;
        }
        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
        System.out.println("El promedio es: " + (suma/cantidad));
    }

}
