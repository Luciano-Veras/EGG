/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia9POO.Extra1.Entidades;

/**
 *
 * @author lucho
 */
public class Meses {
    private String[] calendario = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesSecreto = calendario[5];

    public Meses() {
    }

    public String[] getCalendario() {
        return calendario;
    }

    public void setCalendario(String[] calendario) {
        this.calendario = calendario;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
    
}
