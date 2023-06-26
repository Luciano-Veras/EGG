/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasPOO.Entidades;

/**
 *
 * @author lucho
 */
public class Fracciones {
    private double denominador1;
    private double numerador1;
    private double denominador2;
    private double numerador2;

    public Fracciones() {
    }

    public Fracciones(double denominador1, double numerador1, double denominador2, double numerador2) {
        this.denominador1 = denominador1;
        this.numerador1 = numerador1;
        this.denominador2 = denominador2;
        this.numerador2 = numerador2;
    }

    public double getDenominador1() {
        return denominador1;
    }

    public void setDenominador1(double denominador1) {
        this.denominador1 = denominador1;
    }

    public double getNumerador1() {
        return numerador1;
    }

    public void setNumerador1(double numerador1) {
        this.numerador1 = numerador1;
    }

    public double getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(double denominador2) {
        this.denominador2 = denominador2;
    }

    public double getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(double numerador2) {
        this.numerador2 = numerador2;
    }

    @Override
    public String toString() {
        return "Fracciones{" + "denominador1=" + denominador1 + ", numerador1=" + numerador1 + ", denominador2=" + denominador2 + ", numerador2=" + numerador2 + '}';
    }

    
    
}
