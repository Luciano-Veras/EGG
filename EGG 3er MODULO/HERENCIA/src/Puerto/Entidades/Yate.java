/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puerto.Entidades;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public final class Yate extends Lancha {
    
    private int numeroCamarotes;

    public Yate() {
    }

    public Yate(int numeroCamarotes, int potencia, String matricula, int eslora, int anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public Lancha crearYate(){
        Scanner leer = new Scanner(System.in);
        super.crearLancha();
        System.out.println("INGRESE NUMEROS DE CAMAROTES");
        numeroCamarotes = leer.nextInt();
        return new Yate(numeroCamarotes ,super.getPotencia(), super.getMatricula(), super.getEslora(), super.getAnioFabricacion());
    }  

    @Override
    public String toString() {
        return "Numero de Camarotes:" + numeroCamarotes + "\n" + super.toString();
    }

    @Override
    public double precioContrato(ContratoAlquiler aux) {
        return super.precioContrato(aux) + numeroCamarotes;
    }

       
    
    
}
