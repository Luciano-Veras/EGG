/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adoptar;

import Adoptar.Entidades.Perro;
import Adoptar.Entidades.Persona;
import Adoptar.Servicio.PerroServicio;
import Adoptar.Servicio.PersonaServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class AdoptarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio personaS = new PersonaServicio();
        PerroServicio perroS = new PerroServicio();
        
        ArrayList<Perro> perrosEnAdopcion = perroS.perroList();
        
        System.out.println("CUANTAS PERSONAS TIENEN TURNO DE ADOPCION");
        int turnos = leer.nextInt();
        
        for (int i = 0; i < turnos; i++) {
            System.out.println("PERSONA " + (i+1));
            Persona persona = personaS.cargarPersona();
            personaS.mostrarPersona(persona);
            perroS.mostrarPerro(perrosEnAdopcion);
            personaS.adoptarPerro(persona, perrosEnAdopcion);
            personaS.mostrarPersona(persona);
            perroS.mostrarPerro(perrosEnAdopcion);
        }
        
    }
    
}
