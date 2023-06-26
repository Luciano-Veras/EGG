/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.Extras.NIF;

import Guia8POO.Extras.NIF.Entidades.NIF;
import Guia8POO.Extras.NIF.Servicios.NIFServicio;

/**
 *
 * @author lucho
 */
public class Extra2_NIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("EJEMPLO CON 5 DNI DISTINTOS");
        System.out.println("");
        NIFServicio nifS = new NIFServicio();
        NIF[] nif = new NIF[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("DNI" + " " + (i+1));
            nif[i] = nifS.crearNif();
            nifS.mostrar(nif[i]);
            System.out.println("");
        }
    }

}
