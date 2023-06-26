/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

import Animal.Entidades.Animal;
import Animal.Entidades.Caballo;
import Animal.Entidades.Gato;
import Animal.Entidades.Perro;

/**
 *
 * @author lucho
 */
public class AnimalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        perro1.Alimentarce();
        
        Animal perro2 = new Perro("Teddy","Croquetas", 10, "Chihuahua");
        perro2.Alimentarce();
        
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Sianes");
        gato1.Alimentarce();
        
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarce();
    }
    
}
