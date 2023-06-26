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
public class Empleado extends Persona {

    /**
     * Con respecto a los empleados, sean del tipo que sean, hay que saber su
     * año de incorporación a la facultad y qué número de despacho tienen
     * asignado.
     */

    protected int incorporacion;
    protected int nrodespacho;

    public Empleado() {
    }

    public Empleado(int incorporacion, int nrodespacho, String nombre, String apellido, int dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.incorporacion = incorporacion;
        this.nrodespacho = nrodespacho;
    }

    public int getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(int incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getNrodespacho() {
        return nrodespacho;
    }

    public void setNrodespacho(int nrodespacho) {
        this.nrodespacho = nrodespacho;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nAño de incorporacion: " + incorporacion
                + "\nNumero de despacho: " + nrodespacho;

    }

}
