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
public final class Profesor extends Empleado {

    /**
     * Por lo que se refiere a los profesores, es necesario gestionar a qué
     * departamento pertenecen (lenguajes, matemáticas, arquitectura, ...).
     */
    private String departamento;

    public Profesor() {
    }
    
    public Profesor(String departamento, int incorporacion, int nrodespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(incorporacion, nrodespacho, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPertenece al departamento de: " + departamento;
    }

}
