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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de alturas a ingresar");
        int n = leer.nextInt();
        int e = 0, a = 0 ;
        double conte =0 , conta = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresar la altura " + (i+1) + " : ");
            double altura = leer.nextDouble();
            conta += altura;
            a++;
            if (altura<1.6) {
                conte += altura;
                e++;
            }
        }
        System.out.println("El promedio de alturas menor a 1.6 es: " + (conte/e));
        System.out.println("El promedio de alturas general a 1.6 es: " + (conta/a));
    }
    
}
