/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.PersonasDate.Servicios;

import Guia9POO.PersonasDate.Entidades.Personas;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class PersonasServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Personas crearPersona() {
        Personas usuario = new Personas();
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        usuario.setNombre(nombre);
        System.out.println("Ingrese fecha de nacimiento (dd/mm/yyyy)");
        System.out.print("Dia ");
        int dia = leer.nextInt();
        System.out.print("Mes ");
        int mes = leer.nextInt();
        System.out.print("Año ");
        int anio = leer.nextInt();
        Date fechaUsuario = new Date(anio-1900, mes-1, dia );
        usuario.setFechaNacimiento(fechaUsuario);
        return usuario;
    }
    
    public static int calcularEdad(Personas usuario) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - usuario.getFechaNacimiento().getYear();
        int mes = fechaActual.getMonth()- usuario.getFechaNacimiento().getMonth();
        int dia = fechaActual.getDay() - usuario.getFechaNacimiento().getDay();
        if (mes < 0) {
            edad -= 1;
        } else if (mes == 0) {
            if (dia < 0) {
                edad -= 1;
            }
        }
        return edad;
    }
    
    public boolean menorQue(Personas usuario, int edad) {
        return PersonasServicio.calcularEdad(usuario) < edad;
    }
    
    public void mostrarPersona(Personas usuario) {
        System.out.println(usuario.toString());
    }
    
            
}
