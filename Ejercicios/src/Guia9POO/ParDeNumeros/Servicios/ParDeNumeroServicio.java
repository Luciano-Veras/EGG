/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.ParDeNumeros.Servicios;

import Guia9POO.ParDeNumeros.Entidades.ParDeNumeros;

/**
 *
 * @author lucho
 */
public class ParDeNumeroServicio {
    
    public void mostrarValores(ParDeNumeros numeros) {
        System.out.println("El 1er numero es: " + numeros.getNum1() + "\n" 
                + "El 2do numero es: " + numeros.getNum2());
    }
    
    public static double devolverMayor(ParDeNumeros numeros) {
        double mayor = Math.max(numeros.getNum1(), numeros.getNum2());
        return mayor;
    }
    
    public static double devolverMenor(ParDeNumeros numeros) {
        double menor = Math.min(numeros.getNum1(), numeros.getNum2());
        return menor;
    }
    
    
    public void CalcularPotencia(ParDeNumeros numeros) {
        double mayor =ParDeNumeroServicio.devolverMayor(numeros);
        double menor = ParDeNumeroServicio.devolverMenor(numeros);
        double potencia = Math.pow(Math.round(mayor), Math.round(menor));
        System.out.println(potencia);
    }
    
    public void calcularRaiz(ParDeNumeros numeros) {
        
        double menor = ParDeNumeroServicio.devolverMenor(numeros);
        double raiz = Math.sqrt(Math.abs(Math.round(menor)));
        System.out.println(raiz);
    }
    
}
