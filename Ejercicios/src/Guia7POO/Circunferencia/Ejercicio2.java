/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Circunferencia;

import Guia7POO.Circunferencia.Entidades.Circunferencia;

/**
 *
 * @author lucho
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia elemento = new Circunferencia(15);
        
        elemento.setRadio(elemento.crearCricunferencia());
        
        System.out.println("El area de elemento es: " + elemento.area(elemento));
        System.out.println("El perimetro de elemento es: " + elemento.area(elemento));

        
    }
    
}
