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
public class Ejercico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        boolean retorno = chequeo(numero);
        String mensaje = "El numero " + numero + " es primo ? : " + retorno;
        System.out.println(mensaje);
     
    }
    public static boolean chequeo(int numero){
        if (numero <= 0) {
            return false;
        }
        for (int i = 2; i < numero ; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    } 
}
