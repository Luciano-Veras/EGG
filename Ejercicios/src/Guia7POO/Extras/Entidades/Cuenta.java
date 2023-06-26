/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7POO.Extras.Entidades;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author lucho
 */
public class Cuenta {
    private String titular;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta de: " + titular + ", saldo: " + saldo;
    }
    
    
    
    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);
        Cuenta newCuenta = new Cuenta();
        System.out.println("Ingrese nombre del Titular");
        newCuenta.setTitular(leer.nextLine());
        System.out.println("Ingrese Saldo a depositar");
        newCuenta.setSaldo(leer.nextInt());
        return newCuenta;
    }
    
    public void retirarDinero(List<Cuenta> cuentas) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar");
        int retiro = leer.nextInt();
        if (cuentas.get(0).getSaldo()< retiro) {
            System.out.println("No tiene saldo suficiente");
        } else {
            cuentas.set(cuentas.get(0).getSaldo() - retiro, this);
        }
    }
    
}
