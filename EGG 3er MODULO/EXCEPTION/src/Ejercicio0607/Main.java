/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio0607;

/**
 *
 * @author lucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Sentencias instanciaA = new Sentencias();
        try {
            System.out.println("Ejecución sin excepción MioException:");
            instanciaA.metodoA(10, 5);

            System.out.println("Ejecución con excepción MioException:");

            instanciaA.metodoA(10, 0);
        } catch (MioException e) {
            // Captura de la excepción MioException si se produce
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
    
}
