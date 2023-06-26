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
public class Lancha extends Barco {
    
    private int potencia;

    public Lancha() {
    }

    public Lancha(int potencia, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public Lancha crearLancha(){
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("INGRESE POTENCIA");
        potencia = leer.nextInt();
        return new Lancha(potencia, super.getMatricula(), super.getEslora(), super.getAnioFabricacion());
    }

    @Override
    public String toString() {
        return "Potencia:" + potencia + "\n" + super.toString();
    }

    @Override
    public double precioContrato(ContratoAlquiler aux) {
        return super.precioContrato(aux) + potencia;
    }
    
    
}
