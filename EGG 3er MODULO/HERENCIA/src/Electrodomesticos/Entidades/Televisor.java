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
public final class Televisor extends Electrodomesticos {
    
    private double pulgadas;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
        System.out.println("TELEVISOR");
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas");
        pulgadas = leer.nextDouble();
        System.out.println("Incluye TDT");
        String respuesta = leer.next();
        TDT = respuesta.equalsIgnoreCase("SI");       
    }
    
    
    @Override
    public void precioFinal(Electrodomesticos aux) {
        super.precioFinal(aux);
        if (pulgadas > 40) {
            aux.setPrecio(aux.getPrecio() * 1.3);
        }
        if (TDT) {
            aux.setPrecio(aux.getPrecio() + 500);
        }
    }
    
    
}
