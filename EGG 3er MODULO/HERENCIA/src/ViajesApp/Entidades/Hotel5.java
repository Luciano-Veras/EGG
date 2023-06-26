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
public final class Hotel5 extends Hotel4 {
    
    protected Integer cantidadSalones;
    protected Integer cantidadSuites;
    protected Integer cantidadLimosinas;

    public Hotel5() {
    }

    public Hotel5(Integer cantidadSalones, Integer cantidadSuites, Integer cantidadLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroCamas, cantidadPisos);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Integer getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(Integer cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }
    
    private Integer valorAgregadoLimosina(){
        return cantidadLimosinas * 15;
    }

    @Override
    public Integer precioFinal() {
        precioHabitacion = super.precioFinal() + valorAgregadoLimosina();
        return precioHabitacion;
    }

    



    @Override
    public String toString() {
        return super.toString() + "\nCantidad Salones de Conferencia: " + cantidadSalones + "\nCantidad de Suites: " + cantidadSuites + "\nCantidad de Limosinas: " + cantidadLimosinas;
    }

   
    
    
}
