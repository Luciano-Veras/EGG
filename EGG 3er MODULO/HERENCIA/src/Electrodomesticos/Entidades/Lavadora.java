/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos.Entidades;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public final class Lavadora extends Electrodomesticos {
    
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        System.out.println("LAVADORA");
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese la capacidad de carga");
        carga = leer.nextDouble();
    }
    
    @Override
    public void precioFinal(Electrodomesticos aux) {
        super.precioFinal(aux);
        if (carga > 30) {
            aux.setPrecio(aux.getPrecio() + 500);
        }
    }
    
    
  

    
    
}
