/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.Entidades;

/**
 *
 * @author lucho
 */
public abstract class Edificios {
    
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificios() {
    }

    public Edificios(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    public abstract double calcularSuperficio();
    
    public abstract double calcularVolumen();
}
