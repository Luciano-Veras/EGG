/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.PersonasDate.Entidades;

import java.util.Date;

/**
 *
 * @author lucho
 */
public class Personas {
    private String nombre;
    private Date fechaNacimiento;

    public Personas() {
    }

    public Personas(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
        @Override
    public String toString() {
        return "Personas{" + "nombre = " + nombre + ", fechaNacimiento = " + fechaNacimiento + '}';
    }

}
