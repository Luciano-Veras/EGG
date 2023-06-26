/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.Extras.Raices.Servicios;

import Guia8POO.Extras.Raices.Entidades.Raices;

/**
 *
 * @author lucho
 */
public class RaicesServicio {
    
    public Raices crearRaiz(double a, double b, double c) {
        Raices raiz = new Raices(a, b, c);
        return raiz;
    }
    
    public double getDiscriminante(Raices raiz) {
        double discr = (Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC());
        return discr;
    }
    
    public boolean tieneRaices(Raices raiz, double discr) {
        if (discr > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(Raices raiz, double discr) {
        if (discr == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void obetenerRaices(Raices raiz) {
        RaicesServicio r = new RaicesServicio();
        double discr = r.getDiscriminante(raiz);
        if (r.tieneRaices(raiz, discr) == true) {
        System.out.println("METODO OBETENER RAICES");
        double solucion1 = (-raiz.getB() + Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA());
        double solucion2 = (-raiz.getB() - Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA());
        System.out.println("La primera solucion ( con el operador + ) es: " + solucion1);
        System.out.println("La segunda solucion ( con el operador - ) es: " + solucion2);   
        }
    }
    
    public void obeterRaiz(Raices raiz) {
        RaicesServicio r = new RaicesServicio();
        double discr = r.getDiscriminante(raiz);
        if (discr == 0) {
        System.out.println("METODO OBTENER RAIZ");
        double solucion1 = (-raiz.getB() + Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA());
        double solucion2 = (-raiz.getB() - Math.sqrt(Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC()))) / (2 * raiz.getA());
        System.out.println("La primera solucion ( con el operador + ) es: " + solucion1);
        System.out.println("La segunda solucion ( con el operador - ) es: " + solucion2);   
        }
    }

}
