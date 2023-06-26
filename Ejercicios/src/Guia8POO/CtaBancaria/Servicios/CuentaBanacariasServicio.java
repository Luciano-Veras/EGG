/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8POO.CtaBancaria.Servicios;

import Guia8POO.CtaBancaria.Entidades.CuentaBancarias;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class CuentaBanacariasServicio {

    public CuentaBancarias crearCuenta() {
        Scanner leer = new Scanner(System.in);
        CuentaBancarias cta = new CuentaBancarias();
        System.out.println("Ingrese numero de la cuenta.");
        cta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese Dni del cliente.");
        cta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese saldo actual de la cuenta.");
        cta.setSaldoActual(leer.nextDouble());
        return cta;
    }
    
    public void depositar(CuentaBancarias cta) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea depositar");
        double  deposito  = leer.nextDouble();
        cta.setSaldoActual(cta.getSaldoActual() + deposito);
    }
    
    public void retirar(CuentaBancarias cta) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cuanto dinero desea retirar");
        double retiro = leer.nextDouble();
        if (retiro <= cta.getSaldoActual()) {
            cta.setSaldoActual(cta.getSaldoActual() - retiro);
        } else {
            System.out.println("Saldo insuficiente , se retira el saldo disnible " + cta.getSaldoActual());
            cta.setSaldoActual(cta.getSaldoActual() - cta.getSaldoActual());
        }
    }
    
    public void extraccionRapida(CuentaBancarias cta) {
        Scanner leer = new Scanner(System.in);
        boolean fin;
        System.out.println("Extraccion rapida, puede retirar hasta el 20% del saldo de su cuenta");
        System.out.println("Su saldo actual es: " + cta.getSaldoActual());
        do {
            System.out.println("Ingrese monto a retirar");
            double retiro = leer.nextDouble();
            if (retiro <= cta.getSaldoActual() * 0.2) {
                cta.setSaldoActual(cta.getSaldoActual() - retiro);
                fin = true;
            } else {
                System.out.println("Saldo insuficiente para la operacion, ingrese de nuevo");
                fin = false;
            }
        } while (fin != true);
    }
    
    public double consultarSaldo(CuentaBancarias cta) {
        return cta.getSaldoActual();
    }
    
    public String consultarDatos(CuentaBancarias cta) {
        return cta.toString();
    }
}
