/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Extras;

import Guia7POO.Extras.Entidades.Empleado;

/**
 *
 * @author lucho
 */
public class Extra5_Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar un objeto de tipo vendedor para acceder
        Empleado e = new Empleado();
        //creamos el objeto que retorna los metodos declarado
        Empleado e1 = e.altaEmpleado();
        System.out.println(e1.toString());
        e1.aumentoSueldo(e1);
        
    }
    
}
