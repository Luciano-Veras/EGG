/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baraja.Entidades;

import java.util.ArrayList;

/**
 *
 * @author lucho
 */
public class Persona {
    
    private ArrayList<Carta> cartas;

    public Persona() {
    }

    public Persona(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    
    
    
}
