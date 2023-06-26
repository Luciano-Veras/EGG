/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Extra2.Entidades;

/**
 *
 * @author lucho
 */
public class Ahorcado {
    private String[] palabraSecreta;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private String[] vectorEncontrado;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraSecreta, int letrasEncontradas, int jugadasMaximas, String[] vectorEncontrado) {
        this.palabraSecreta = palabraSecreta;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.vectorEncontrado = vectorEncontrado;
    }

    public String[] getVectorEncontrado() {
        return vectorEncontrado;
    }

    public void setVectorEncontrado(String[] vectorEncontrado) {
        this.vectorEncontrado = vectorEncontrado;
    }



    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
    
    
    
    
}
