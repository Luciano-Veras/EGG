/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidades.Pelicula;
import Servicios.PeliculaServicio;
import java.util.ArrayList;

/**
 *
 * @author lucho
 */
public class CineApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio pS = new PeliculaServicio();
        ArrayList<Pelicula> villaCabrera = new ArrayList();
        pS.cartelera(villaCabrera);
        pS.mostrarPeliculas(villaCabrera);
        pS.mayorUnaHora(villaCabrera);
        pS.duracionMayorMenor(villaCabrera);
        pS.duracionMenorMayor(villaCabrera);
        pS.alfabeticamenteTitulo(villaCabrera);
        pS.alfabeticamenteDirector(villaCabrera);
        
    }
    
}
