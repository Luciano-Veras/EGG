/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baraja.Entidades;

import Baraja.Enumeraciones.Palos;

/**
 *
 * @author lucho
 */
public class Carta {

    private int numero;
    private Palos palo;

    public Carta() {
    }

    public Carta(int numero, Palos palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta nro " + numero + " " + palo;
    }
}
