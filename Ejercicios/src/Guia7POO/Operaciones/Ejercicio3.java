/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Operaciones;

import Guia7POO.Operaciones.Entidades.Operaciones;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        Operaciones operacion = new Operaciones();
        
        System.out.println("Ingrese numeros");
        operacion = operacion.crearOperacion(leer.nextDouble(), leer.nextDouble());
        
        System.out.println("");
        
        System.out.println("La suma de los numero es: " + operacion.sumar(operacion));
        
        System.out.println("");
        
        System.out.println("Ingrese numeros");
        Operaciones operacion1 = operacion.crearOperacion(leer.nextDouble(), leer.nextDouble());
        
        System.out.println("");
        
        System.out.println("La resta de los numero es: " + operacion1.restar(operacion1));
        
        System.out.println("");
        
        System.out.println("Ingrese numeros");
        Operaciones operacion2 = operacion.crearOperacion(leer.nextDouble(), leer.nextDouble());
        
        System.out.println("");
        
        System.out.println("La multiplicacion de los numeros es: " + operacion2.multiplicar(operacion2));
        
        System.out.println("");
        
        System.out.println("Ingrese los numeros");
        Operaciones operacion3 = operacion.crearOperacion(leer.nextDouble(), leer.nextDouble());
        
        System.out.println("");
        
        System.out.println("La division de los numeros es: " + operacion3.dividir(operacion3));
    }
    
}
