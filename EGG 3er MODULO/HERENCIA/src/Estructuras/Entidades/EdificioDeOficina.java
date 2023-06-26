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
public final class EdificioDeOficina extends Edificios {
    
    private int numeroficinas;
    private int cantPersonas;
    private int numeroPisos;

    public EdificioDeOficina() {
    }
    
    public EdificioDeOficina(int numeroficinas, int cantPersonas, int numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroficinas = numeroficinas;
        this.cantPersonas = cantPersonas;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroficinas() {
        return numeroficinas;
    }

    public void setNumeroficinas(int numeroficinas) {
        this.numeroficinas = numeroficinas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
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
    
    public void cantPersonas(){
        System.out.println("La cantidad de personas por piso es: " + (cantPersonas * numeroficinas) );
        System.out.println("La candidad de personas en el edificio es: " + (cantPersonas * numeroficinas * numeroPisos));
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
