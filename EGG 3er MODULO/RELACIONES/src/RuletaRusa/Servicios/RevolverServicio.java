/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusa.Servicios;

import RuletaRusa.Entidades.Revolver;

/**
 *
 * @author lucho
 */
public class RevolverServicio {      
        
    public Revolver llenarRevolver() {
        Revolver aux = new Revolver();
        aux.setPocisionActual((int)(Math.random() * 9 + 1));
        aux.setPocisionAgua((int)(Math.random() * 9 + 1));
        return aux;
    }
    
    public boolean mojar(Revolver r) {
        return r.getPocisionActual().equals(r.getPocisionAgua());
    }
    
    public void siguienteChorro(Revolver r) {
        if (r.getPocisionActual().equals(9)) {
            r.setPocisionActual(1);
        } else {
            r.setPocisionActual(r.getPocisionActual() + 1);
        }
    }
    
    public void mostrarPocision(Revolver aux) {
        System.out.println(aux.toString());
        
    }
}
