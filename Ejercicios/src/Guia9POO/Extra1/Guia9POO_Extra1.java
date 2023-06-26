/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Extra1;

import Guia9POO.Extra1.Entidades.Meses;
import Guia9POO.Extra1.Servicios.MesesServicio;

/**
 *
 * @author lucho
 */
public class Guia9POO_Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Meses calendario = new Meses();
        MesesServicio calendarioS = new MesesServicio();
        calendarioS.adivinarMes(calendario);
    }
    
}
