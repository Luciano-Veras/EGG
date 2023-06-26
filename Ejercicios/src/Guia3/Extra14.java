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
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de Familias");
        int familia = leer.nextInt();
        int suma = 0, cont = 0;
        for (int i = 0; i < familia; i++) {
            System.out.println("Ingrese cantidad de hijos de la familia " + (i+1));
            int hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese edad del hijo " + (j+1));
                int edad = leer.nextInt();
                suma += edad;
                cont++;
            }
        }
        double sumad = suma ,contd = cont;
        double media = sumad/contd;
        System.out.println("La media de edad de los hijos de todas las familia es: " + media);
    }
    
}
