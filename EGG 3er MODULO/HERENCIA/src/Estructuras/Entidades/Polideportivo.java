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
public final class Polideportivo extends Edificios  {
    
    private String nombre;
    private boolean techada;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techada, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techada = techada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechada() {
        return techada;
    }

    public void setTechada(boolean techada) {
        this.techada = techada;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    
    
    @Override
    public double calcularSuperficio() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }
    
}
