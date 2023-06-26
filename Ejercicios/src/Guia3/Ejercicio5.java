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
public class Ejercicio5 {
//5.	Escriba un programa en el cual se ingrese un valor límite positivo, y a 
//continuación solicite números al usuario hasta que la suma de los números 
//introducidos supere el límite inicial.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 , limite, suma;
        System.out.print("Ingrese el numero limite: ");
        limite = leer.nextInt();
        suma = 0;
        while ( limite > suma ){
            System.out.println("Ingrese un numero");
            num1 = leer.nextInt();
            suma+=num1;
            System.out.println(suma);
            if (suma>limite){
                System.out.println("La suma de los numero ingresados es mayor al limite");
                System.out.println(suma+">"+limite);
            }
        }
    }
    
}
