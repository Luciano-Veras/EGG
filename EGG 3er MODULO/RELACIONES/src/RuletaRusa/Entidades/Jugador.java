/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusa.Entidades;

/**
 *
 * @author lucho
 */
public class Jugador {
    private Integer ID;
    private String jugador;
    private boolean mojado = false;

    public Jugador() {
    }

    public Jugador(Integer ID, String jugador, boolean mojado) {
        this.ID = ID;
        this.jugador = jugador;
        this.mojado = mojado;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID: " + ID + ", jugador: " + jugador + ", mojado: " + mojado + '}';
    }
    
    
}
