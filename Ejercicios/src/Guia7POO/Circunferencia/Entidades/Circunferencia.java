/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Circunferencia.Entidades;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double crearCricunferencia() {
        Scanner leer =  new Scanner(System.in);
        System.out.println("Ingrese Radio");
        double newRadio = leer.nextDouble();
        return newRadio;
    }
    
    public double area(Circunferencia elemento) {
        return Math.pow(radio, 2) * Math.PI;
    }
    
    public double perimetro(Circunferencia elemento) {
        return 2 * Math.PI * radio;
    }
}
