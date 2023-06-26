/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusa.Entidades;

/**
 *
 * @author lucho
 */
public class Revolver {
    private Integer pocisionActual;
    private Integer pocisionAgua;

    public Revolver() {
    }

    public Revolver(Integer pocisionActual, Integer pocisionAgua) {
        this.pocisionActual = pocisionActual;
        this.pocisionAgua = pocisionAgua;
    }

    public Integer getPocisionActual() {
        return pocisionActual;
    }

    public void setPocisionActual(Integer pocisionActual) {
        this.pocisionActual = pocisionActual;
    }

    public Integer getPocisionAgua() {
        return pocisionAgua;
    }

    public void setPocisionAgua(Integer pocisionAgua) {
        this.pocisionAgua = pocisionAgua;
    }

    @Override
    public String toString() {
        return "Pocision Actual: " + pocisionActual +  "\nPocision Agua: " + pocisionAgua;
    }
    
    
}
