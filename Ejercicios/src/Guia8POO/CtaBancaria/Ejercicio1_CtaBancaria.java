/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.CtaBancaria;

import Guia8POO.CtaBancaria.Entidades.CuentaBancarias;
import Guia8POO.CtaBancaria.Servicios.CuentaBanacariasServicio;

/**
 *
 * @author lucho
 */
public class Ejercicio1_CtaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CuentaBanacariasServicio ctaS = new CuentaBanacariasServicio();
       CuentaBancarias cta1 = ctaS.crearCuenta();
       ctaS.depositar(cta1);
       ctaS.retirar(cta1);
       ctaS.extraccionRapida(cta1);
        System.out.println("El saldo actual de la cuenta es: ");
        System.out.println(ctaS.consultarSaldo(cta1));
        System.out.println("Datos completos de la cuenta");
        System.out.println(ctaS.consultarDatos(cta1));
    }
    
}
