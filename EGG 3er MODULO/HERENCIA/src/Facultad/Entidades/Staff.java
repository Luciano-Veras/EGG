/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad.Entidades;

/**
 *
 * @author lucho
 */
public final class Staff extends Empleado {

    /**
     * Sobre el personal de servicio, hay que conocer a qué sección están
     * asignados (biblioteca, decanato, secretaría, ...).
     */
    
    private String seccion;

    public Staff() {
    }

    public Staff(String seccion, int incorporacion, int nrodespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(incorporacion, nrodespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPertenece a la seccion de: " + seccion;
    }
    
    
}
