/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusa.Servicios;

import RuletaRusa.Entidades.Jugador;
import RuletaRusa.Entidades.Revolver;


/**
 *
 * @author lucho
 */
public class JugadorServicio {
    
    public Jugador cargarJugadores(int cant, int i) {
            Jugador aux = new Jugador();
            aux.setID((i + 1));
            aux.setJugador("Jugador");
        return aux;
    }
    
    public boolean disparo(Revolver aux, Jugador auxJ) {
        RevolverServicio rS = new RevolverServicio();
        if (rS.mojar(aux)) {
            auxJ.setMojado(true);
            return true;
        } else {
            rS.siguienteChorro(aux);
            return false;
        }      
    }
}
 