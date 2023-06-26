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
public class Camping extends Extrahotel {
    
    private int capacidadCarpas;
    private int cantidadBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadCarpas, int cantidadBanios, boolean restaurante, boolean privado, int metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        String respuesta;
        if (restaurante) {
            respuesta = "SI";
        } else {
            respuesta = "NO";
        }
        return super.toString() + "\nCapacidad de carpas: " + capacidadCarpas+
                "\nCantidad de baños: " + cantidadBanios+
                "\nTiene restaurante: " + respuesta;
    }

    
    
}
