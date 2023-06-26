/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puerto.Entidades;


import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author lucho
 */
public class Barco {

    protected String matricula;
    protected int eslora;
    protected int anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Barco crearBarco() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("DATOS DEL BARCO");
        System.out.println("INGRESAR MATRICULA");
        matricula = leer.next();
        System.out.println("INGRESE MTS DE ESLORA");
        eslora = leer.nextInt();
        System.out.println("INGRESE AÑO DE FABRICACION");
        anioFabricacion = leer.nextInt();
        return new Barco(matricula, eslora, anioFabricacion);
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\nEslora: " + eslora + "\nAño de Fabricacion: " + anioFabricacion;
    }

    public double precioContrato(ContratoAlquiler aux) {
     long diffms = aux.getFechaDevolucion().getTime() - aux.getFechaAlquiler().getTime();
     long diasContrato = TimeUnit.MILLISECONDS.toDays(diffms);
     int valorModulo = eslora * 10;
     double precio = diasContrato * valorModulo;
     return precio;         
    }

}
