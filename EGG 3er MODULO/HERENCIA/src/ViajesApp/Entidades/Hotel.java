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
public class Hotel {

    protected Integer cantidadHabitaciones;
    protected Integer numeroCamas;
    protected Integer cantidadPisos;
    protected Integer precioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    protected Integer precioFinal() {
        precioHabitacion = 50 + (numeroCamas * cantidadHabitaciones * cantidadPisos);

        return precioHabitacion;
    }

    @Override
    public String toString() {

        return "Cantidad de Habitaciones: " + cantidadHabitaciones + "\nNumero de Camas: " + numeroCamas + "\nCantidad de Pisos: " + cantidadPisos + "\nPrecio por Habitacion: $" + precioHabitacion;
    }

}
