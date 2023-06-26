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
public class Hotel4 extends Hotel {
    
    protected String gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }
    
    protected Integer valorAgregadoRestaurante(){
        if (capacidadRestaurante < 30) {
            return 10;
        } else if (capacidadRestaurante < 51) {
            return 30;
        } else {
            return 50;
        }
    }
    
    protected Integer valorAgregadoGimnasio(){
        if (gimnasio.toUpperCase().equalsIgnoreCase("A")) {
            return 50;
        } else {
            return 30;
        }
    }

    @Override
    public Integer precioFinal() {
        precioHabitacion = super.precioFinal() + valorAgregadoGimnasio() + valorAgregadoRestaurante();
        return precioHabitacion;
    }

    
    

    

    @Override
    public String toString() {
        return super.toString() + "\nGimnasio de clase: " + gimnasio + "\nNombre del Restaurante: " + nombreRestaurante + "\nCapacidad del Restaurante: " + capacidadRestaurante;
    }
    
    
   
    
    
    
}
