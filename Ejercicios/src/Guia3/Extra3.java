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
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")|| letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u")) {
            System.out.println("La letra es una Vocal");    
        } else {
            System.out.println("La letra no es una Vocal");
        }
 
            
        
        
    }
    
}
