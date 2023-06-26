/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria.Entidades;

import Geometria.Interfaces.calculosFormas;

/**
 *
 * @author lucho
 */

/**
 * Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro
 */
public final class Circulo implements calculosFormas {
    
    private double radio;
    private double diametro;
    private double PI = 3.14;

    public Circulo() {
    }

    public Circulo(double radios, double diamentro) {
        this.radio = radios;
        this.diametro = diamentro;
    }

    public double getRadios() {
        return radio;
    }

    public void setRadios(double radios) {
        this.radio = radios;
    }

    public double getDiamentro() {
        return diametro;
    }

    public void setDiamentro(double diamentro) {
        this.diametro = diamentro;
    }
    
    

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return  PI * diametro;
    }

    
    
}
