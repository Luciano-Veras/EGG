/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusa.Servicios;

import RuletaRusa.Entidades.Juego;
import RuletaRusa.Entidades.Jugador;
import RuletaRusa.Entidades.Revolver;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lucho
 */
public class JuegoServicio {

    public Juego llenarJuego(ArrayList<Jugador> auxA, Revolver r) {
        Juego aux = new Juego();
        aux.setJugadores(auxA);
        aux.setRevolver(r);
        return aux;
    }

    public void ronda(Juego aux) {
        JugadorServicio auxJS = new JugadorServicio();
        Iterator<Jugador> it = aux.getJugadores().iterator();
        boolean mojado = false;
        int cont = 1;
        while (!mojado) {
            Jugador auxJ = it.next();
            System.out.println(auxJ.getJugador() + " " + auxJ.getID() + " Disparo " + cont);
            if (auxJS.disparo(aux.getRevolver(), auxJ)) {
                System.out.println("Juego terminado, un jugador se mojo");
                System.out.println(auxJ.getJugador() + " " + auxJ.getID() + " esta mojado");
                
            } else {
                System.out.println("Jugador salvado, siguiente turno");
                cont++;
            }
            while (!it.hasNext()) {
                it = aux.getJugadores().iterator();
            }
            if (auxJ.isMojado()) {
                System.out.println(auxJ.toString());
                break;
            }
            
        }
       

    }
}
