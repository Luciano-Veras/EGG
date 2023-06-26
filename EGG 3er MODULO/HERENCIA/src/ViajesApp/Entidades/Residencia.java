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
public final class Residencia extends Extrahotel {
    
    private int cantidadHabitaciones;
    private boolean descuento;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantidadHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, int metrosCuadrados) {
        super(privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        String dto;
        String campo;
        if (descuento) {
            dto = "SI";
        } else {
            dto = "NO";
        }
        if (campoDeportivo) {
            campo = "SI";
        } else {
            campo = "NO";
        }
        return super.toString() + 
                "\nCantidad de Habitaciones: " + cantidadHabitaciones + 
                "\nTiene descuento de gremio: " + dto +
                "\nTiene campo deportivo: " + campo;
    }
    
    
    
}
