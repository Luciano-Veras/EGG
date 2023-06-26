/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.Extras.Raices;

import Guia8POO.Extras.Raices.Entidades.Raices;
import Guia8POO.Extras.Raices.Servicios.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra1_Raices {

    /**
     * @param args the command line arguments
     */
    //ejemplo raiz con dos soluciones 1 2 -8
    //ejemplo raiz con una solucion 36 -60 25
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Raices[] raiz = new Raices[2];
            System.out.println("Ingrese los numeros para calcular la funcion");
            Scanner leer = new Scanner(System.in);
            RaicesServicio raizS = new RaicesServicio();
            raiz[i] = raizS.crearRaiz(leer.nextDouble(), leer.nextDouble(), leer.nextDouble());
            double discriminante = raizS.getDiscriminante(raiz[i]);
            System.out.println(discriminante);
            System.out.println("Tiene raices, es decir dos soluciones?");
            System.out.println(raizS.tieneRaices(raiz[i], discriminante));
            System.out.println("Tiene raiz, es decir una soluciones?");
            System.out.println(raizS.tieneRaiz(raiz[i], discriminante));
            System.out.println("Obtendremos el/los resultados");
            raizS.obetenerRaices(raiz[i]);
            raizS.obeterRaiz(raiz[i]);
            System.out.println(raiz[i].toString());
        }
        
        
        
    }
    
}
