/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Arrays.Servicios;

import java.util.Arrays;
import java.util.Collections;



/**
 *
 * @author lucho
 */
public class ArraysServicio {
    
    
    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.round(Math.random()*100 + 1);
        }
    }
    
    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }
    
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
        Collections.reverse(Arrays.asList(arreglo));
    }
    
    public void inicializarB(double[] arreglo, double[] arreglo1) {
        for (int i = 0; i < 10; i++) {
            Arrays.fill(arreglo1, i, i+1 , arreglo[i]);
        }
        Arrays.fill(arreglo1, 10, 20, 0.5);
    }
    
    
}
