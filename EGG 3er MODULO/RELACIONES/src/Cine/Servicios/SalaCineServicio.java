/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine.Servicios;

import Cine.Entidades.Pelicula;
import Cine.Entidades.Persona;
import Cine.Entidades.SalaCine;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class SalaCineServicio {

    public SalaCine crearSala(Pelicula auxP) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        SalaCine auxS = new SalaCine();
        auxS.setPeliculas(auxP);
        String[] filas = {"8", "7", "6", "5", "4", "3", "2", "1"};
        String[] lugar = {"A", "B", "C", "D", "E", "F"};
        String[][] sala = new String[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = filas[i] + lugar[j] + " ";
            }
        }
        auxS.setSala(sala);
        System.out.print("Ingrese el precio de la funcion: $");
        auxS.setPrecio(leer.nextInt());
        return auxS;
    }

    public void validamosPersona(Persona auxP, SalaCine auxSc) {
        if (auxP.getEdad() < auxSc.getPeliculas().getEdadMinima()) {
            System.out.println("No supera la edad minima");
        } else if (auxP.getDineroDisponible() < auxSc.getPrecio()) {
            System.out.println("Tienen la edad para ver la pelicula pero no dispone del dinero");
        } else {
            ubicarPersona(auxP, auxSc);
        }
    }

    public void ubicarPersona(Persona auxP, SalaCine auxSc) {
        Random num = new Random();
        String[] filas = {"8", "7", "6", "5", "4", "3", "2", "1"};
        String[] lugar = {"A", "B", "C", "D", "E", "F"};

        String[][] newSala = auxSc.getSala();
        boolean fin = false;
        do {
            int filasR = num.nextInt(7) + 1;
            int lugarR = num.nextInt(5) + 1;
//            int filasR = 4;
//            int lugarR = 2;
            if (!auxSc.getSala()[filasR][lugarR].substring(2, 3).equalsIgnoreCase("X")) {
                newSala[filasR][lugarR] = filas[filasR] + lugar[lugarR] + "X";
                auxP.setUbicacion(filas[filasR] + lugar[lugarR]);
                auxSc.setSala(newSala);
                System.out.println("Lugar asignado correctamente");
                fin = true;
            } else {
                System.out.println("Lugar ocupado, le buscamos otro");
            }
        } while (!fin);
    }

    public void mostrarSala(String[][] aux) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(aux[i][j] + "|");
            }
            System.out.println("");
        }
    }

}
