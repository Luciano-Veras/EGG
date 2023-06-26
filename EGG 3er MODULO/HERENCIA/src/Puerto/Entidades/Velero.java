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
public final class Velero extends Barco  {
    
    private int numeroMastiles;

    public Velero() {
    }

    public Velero(int numeroMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    public Velero crearVelero(){
        Scanner leer = new Scanner(System.in);
        super.crearBarco();
        System.out.println("INGRESE NUMEROS DE MASTIL");
        numeroMastiles = leer.nextInt();
        return new Velero(numeroMastiles, super.getMatricula(), super.getEslora(), super.getAnioFabricacion());
    }

    @Override
    public String toString() {
        return  "Numero de Mastiles:" + numeroMastiles + "\n" + super.toString();
    }

    @Override
    public double precioContrato(ContratoAlquiler aux) {  
        return super.precioContrato(aux) + numeroMastiles; 
    }
    
    
    
}
