/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Arrays;

import Guia9POO.Arrays.Servicios.ArraysServicio;

/**
 *
 * @author lucho
 */
public class Ejercicio3_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] ArrayA = new double[50];
        double[] ArrayB = new double[20];
        ArraysServicio aS = new ArraysServicio();
        aS.inicializarA(ArrayA);
        aS.mostrar(ArrayA);
        aS.ordenar(ArrayA);
        aS.inicializarB(ArrayA, ArrayB);
        aS.mostrar(ArrayA);
        aS.mostrar(ArrayB);
        
    }
    
}
