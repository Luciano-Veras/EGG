/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.ParDeNumeros;

import Guia9POO.ParDeNumeros.Entidades.ParDeNumeros;
import Guia9POO.ParDeNumeros.Servicios.ParDeNumeroServicio;

/**
 *
 * @author lucho
 */
public class Ejercicio2_ParDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeroServicio par = new ParDeNumeroServicio();
        ParDeNumeros par1 = new ParDeNumeros();
        System.out.println("Mostramos los valores");
        par.mostrarValores(par1);
        System.out.println("Calculamos la potencia del mayor elavado al menor");
        par.CalcularPotencia(par1);
        System.out.println("Calculamos la raiz2 del menor");
        par.calcularRaiz(par1);
    }
    
}
