/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Extras;

import Guia7POO.Extras.Entidades.Cuenta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Extra4_Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        List<Cuenta> cuentas = new ArrayList<>();
        System.out.println("Crear cuenta");
        cuentas.add(new Cuenta().crearCuenta());
        cuentas.add(new Cuenta().crearCuenta());
        
        System.out.println("Ingrese nombre del titular a buscar");
        String nombreTitular = leer.nextLine();
        
        Cuenta cuentaBuscada = buscarCuenta(cuentas, nombreTitular);
        if (cuentaBuscada != null) {
            System.out.println("Desea retirar dinero s/n :");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("si")) {
                cuentas.get(0).retirarDinero(cuentas);
            }
        }
        
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.getTitular() + " " + cuenta.getSaldo() );
        }
//        Cuenta cuenta = new Cuenta().crearCuenta();
//        System.out.println("");
//        System.out.println("Desea retirar dinero s/n");
//        String respuesta = leer.next();
//        if (respuesta.equalsIgnoreCase("si")) {
//           cuenta.retirarDinero(cuenta);
//            System.out.println(cuenta.toString());
//        } else {
//            System.out.println("Hasta pronto");
//        }
    }
    
    public static Cuenta buscarCuenta(List<Cuenta> cuentas, String nombreTitular) {
        for(Cuenta cuenta : cuentas ) {
            if (cuenta.getTitular().equalsIgnoreCase(nombreTitular)) {
                return cuenta;
            }
        }
        return null;
    }
}
