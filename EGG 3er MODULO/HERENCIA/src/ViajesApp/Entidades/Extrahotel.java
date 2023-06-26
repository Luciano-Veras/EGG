/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViajesApp.Entidades;

/**
 *
 * @author lucho
 */
public class Extrahotel {
    
    protected boolean privado;
    protected int metrosCuadrados;

    public Extrahotel() {
    }

    public Extrahotel(boolean privado, int metrosCuadrados) {
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        String respuesta;
        if (privado) {
             respuesta = "SI";
        } else {
            respuesta = "NO";
        }
        return "Es una Residencia privada: " + respuesta + "\nMetros Cuadrados: " + metrosCuadrados;
    }
    
    
    
}
