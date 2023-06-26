/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio0304;

import Ejercicio0304.Entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        DivisionNumero dn = new DivisionNumero();
        
        try {
            System.out.println("Numero 1");
            String num1 = leer.next();
            System.out.println("Numero 2");
            String num2 = leer.next();
            
            System.out.println(dn.conversionInt(num1, num2));
            
            //Capturamos erro de ingreso de datos
            //System.out.println("Inregsar numero entero");
            //int numero = leer.nextInt();
            
        } catch (InputMismatchException e) {
            System.out.println("Error : ingreso tipo de dato incorrecto.\n" + e);
        } catch (NumberFormatException e) {
            System.out.println("Error : Formato incorrecto.\n" + e);
        } catch (ArithmeticException e) {
            System.out.println("Error Aritmetico.\n" + e);
        }
    }
    
}
