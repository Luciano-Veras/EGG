/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.Extras.NIF.Servicios;

import Guia8POO.Extras.NIF.Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class NIFServicio {
    
    public NIF crearNif() {
        NIF nif = new NIF();
        NIFServicio n = new NIFServicio();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de Dni");
        nif.setDni(leer.nextLong());
        nif.setLetra(n.calcularLetra(nif));
        return nif;
    }
    
    private String calcularLetra(NIF nif) {
        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
        String[] vector = new String[23];
        for (int i = 0; i < 22; i++) {
            
            vector[i] = letra.substring(i, i+1);
        }
        long pos = nif.getDni() % 23;
        System.out.println("POCISION: " + pos);
        return vector[Math.toIntExact(pos)];
    }
    
    public void mostrar(NIF nif) {
        System.out.println("Mostraremos el Dni con se letra identificatoria");
        String dni = String.format("%08d", nif.getDni());
        System.out.println("[" + dni + "-" + nif.getLetra().toUpperCase() + "]");
    }
}
