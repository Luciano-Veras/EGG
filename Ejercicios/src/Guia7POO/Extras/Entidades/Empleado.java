/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Extras.Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Empleado {
    private String nombre;
    
    private Date fechaNacimiento;
    
    private int sueldoBasico;

    public Empleado() {
    }


    public Empleado(String nombre, Date fechaNacimiento, int sueldoBasico) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getSueldoBasico() {
        return sueldoBasico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSueldoBasico(int sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", sueldoBasico=" + sueldoBasico + '}';
    }

    
    
    public Empleado altaEmpleado() {
        // creamos un metodo que retorne un objeto tipo empleado, el metodo se llama altaEmpleado
        Empleado e1 = new Empleado();
        //instanciamos un objeto de tipo empleado
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Empleado");
        e1.setNombre(leer.nextLine());
        System.out.println("Ingrese el sueldo basico del empleado");
        e1.setSueldoBasico(leer.nextInt());
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.println("Dia");
        int dia = leer.nextInt();
        System.out.println("Mes");
        int mes = leer.nextInt();
        System.out.println("Año");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        e1.setFechaNacimiento(fecha);
        return e1;
    }
    public void aumentoSueldo(Empleado e1) {
        Date hoy = new Date();
        int edad = hoy.getYear() - e1.getFechaNacimiento().getYear();
        if (edad > 30) {
            System.out.println("Le corresponde un 10% de aumento, el mismo es: ");
            double aumento = e1.getSueldoBasico() * 0.1;
            System.out.println("$ " + aumento);
        } else {
            System.out.println("Le corresponde un 5% de aumento, el mismo es: ");
            double aumento = e1.getSueldoBasico() * 0.05;
            System.out.println("$ " + aumento);
        }
    }
}
