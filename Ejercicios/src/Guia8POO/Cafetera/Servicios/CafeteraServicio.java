/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.Cafetera.Servicios;

import Guia8POO.Cafetera.Entidades.Cafetera;

/**
 *
 * @author lucho
 */
public class CafeteraServicio {
    public Cafetera llenarCafetera() {
        Cafetera cafe2007 = new Cafetera(10, 10);
        return cafe2007;
    }
    
    public void servirTaza(Cafetera cafe2007, int tamanio) {
        if (tamanio < cafe2007.getCapacidadMaxima()) {
            System.out.println("La cafetere pudo llenar su taza");
            cafe2007.setCapacidadActual(cafe2007.getCapacidadActual() - tamanio);
        } else {
            System.out.println("La cafetera no puede llenar su taza, se servira " + cafe2007.getCapacidadActual());
            cafe2007.setCapacidadActual(cafe2007.getCapacidadActual() - cafe2007.getCapacidadActual());
        }
    }
    
    public void vaciarCafetera(Cafetera cafe2007) {
        cafe2007.setCapacidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafe2007, int agregar) {
        if ((cafe2007.getCapacidadActual() + agregar) > cafe2007.getCapacidadMaxima()) {
            System.out.println("No se puede agregar la cantidad deseada");
            int maxAgregar = cafe2007.getCapacidadMaxima() - cafe2007.getCapacidadActual();
            cafe2007.setCapacidadActual(cafe2007.getCapacidadActual() + maxAgregar);
            System.out.println("Se puedo agregar " + maxAgregar + " capsulas");
        } else {
            cafe2007.setCapacidadActual(cafe2007.getCapacidadActual() + agregar);
        }
    }
    
    public String estadoCafetera(Cafetera cafe2007) {
        return cafe2007.toString();
    }
    
}
