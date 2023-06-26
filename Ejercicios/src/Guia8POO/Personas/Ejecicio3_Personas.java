/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.Personas;

import Guia8POO.Personas.Entidades.Personas;
import Guia8POO.Personas.Servicios.PersonasServicio;

/**
 *
 * @author lucho
 */
public class Ejecicio3_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonasServicio personaS = new PersonasServicio();
        Personas[] persona = new Personas[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Cargar Persona " + i);
            persona[i] = personaS.crearPersona();
            if (personaS.esMayorDeEdad(persona[i]) == true) {
                System.out.println(persona[i].getNombre() + " es mayor de edad");
            } else {
                System.out.println(persona[i].getNombre() + " es menor de edad");
            }
            switch (personaS.calcularIMC(persona[i])) {
                case -1:
                    System.out.println(persona[i].getNombre() + " se encuentra por debajo del peso ideal");
                    break;
                case 0:
                    System.out.println(persona[i].getNombre() + " se encuentra en el peso ideal");
                    break;
                case 1:
                    System.out.println(persona[i].getNombre() + " se encuentra en sobrepeso");
                    break;
            }
        }
        double mayorE = 0, menorE =0, pesoI = 0, debajoP = 0, sobreP =0;
        for (int i = 0; i < 4; i++) {
            if (personaS.esMayorDeEdad(persona[i]) == true) {
                mayorE +=1;
            } else {
                menorE +=1;
            }
            switch (personaS.calcularIMC(persona[i])) {
                case -1:
                    debajoP +=1;
                    break;
                case 0:
                    pesoI +=1;
                    break;
                case 1:
                    sobreP +=1;
                    break;    
            }
        }
        
        System.out.println("El porcentaje con personas mayor de edad es: " + mayorE/4);
        System.out.println("El porcentaje con personas menor de edad es: " + menorE/4);
        System.out.println("El porcentaje con personas por debajo del peso ideal es: " + debajoP/4);
        System.out.println("El porcentaje con personas con peso ideal es: " + pesoI/4);
        System.out.println("El porcentaje con personas con sobrepeso es: " + sobreP/4);
    }
}
