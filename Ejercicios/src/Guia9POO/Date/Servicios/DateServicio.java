/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Date.Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class DateServicio {
    Scanner leer = new Scanner(System.in);
    public Date fechaNacimiento() {
        System.out.println("FECHA DE NACIEMIENTO");
        System.out.println("Ingrese año");
        int anio = leer.nextInt();
        System.out.println("Ingrese mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese dia");
        int dia = leer.nextInt();
        Date fechaNacimiento = new Date(anio-1900, mes-1, dia);
        return fechaNacimiento;
    }
    
    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }
    
    public int diferecia(Date fechaNacimiento, Date fechaActual) {
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        return edad;
    }
    
}
