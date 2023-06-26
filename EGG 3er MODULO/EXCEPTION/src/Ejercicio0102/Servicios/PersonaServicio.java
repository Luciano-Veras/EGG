/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio0102.Servicios;

import Ejercicio0102.Entidades.Persona;

/**
 *
 * @author lucho
 */
public class PersonaServicio {
    
    public boolean esMayorDeEdad(Persona aux){
       return aux.getEdad() > 18 ; 
    }
}
