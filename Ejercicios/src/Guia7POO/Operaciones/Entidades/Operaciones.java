/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Operaciones.Entidades;

/**
 *
 * @author lucho
 */
public class Operaciones {
    private double numero1;
    private double numero2;

    public Operaciones(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operaciones() {
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    
    public Operaciones crearOperacion(double numero1, double numero2) {
        return new Operaciones(numero1, numero2);
    }
    
    public double sumar(Operaciones operacion) {
        return numero1 + numero2;
    }
    
    public double restar(Operaciones operacion) {
        return numero1 - numero2;
    }
    
    public double multiplicar(Operaciones operacion) {
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return  numero1 * numero2;
        }
    }
    
    public double dividir(Operaciones operacion) {
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return  numero1 / numero2;
        }
    }
}
