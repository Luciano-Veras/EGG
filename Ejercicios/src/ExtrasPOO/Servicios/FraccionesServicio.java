/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtrasPOO.Servicios;

import ExtrasPOO.Entidades.Fracciones;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class FraccionesServicio {

    public Fracciones crearFracciones() {
        Scanner leer = new Scanner(System.in);
        Fracciones FS = new Fracciones();
        System.out.println(" 1ra FRACCION");
        System.out.println("Ingrese numerador");
        FS.setNumerador1(leer.nextDouble());
        System.out.println("Ingrese el denominador");
        FS.setDenominador1(leer.nextDouble());
        System.out.println(" 2da FRACCION");
        System.out.println("Ingrese el numerador");
        FS.setNumerador2(leer.nextDouble());
        System.out.println("Ingrese denominador");
        FS.setDenominador2(leer.nextDouble());
        return FS;
    }
    
    public void sumarFracciones(Fracciones FS) {
        double suma;
        if (FS.getDenominador1() == FS.getDenominador2()) {
            suma = (FS.getNumerador1() + FS.getNumerador2()) / FS.getDenominador1();
        } else {
            double minComun = FS.getDenominador1() * FS.getDenominador2();
            suma = (((minComun / FS.getDenominador1()) * FS.getNumerador1()) + ((minComun / FS.getDenominador2()) * FS.getNumerador2())) / minComun;
        }
        System.out.println(suma);
    }
    
    public void restarFracciones(Fracciones FS) {
        double resta;
        if (FS.getDenominador1() == FS.getDenominador2()) {
            resta = (FS.getNumerador1() - FS.getNumerador2()) / FS.getDenominador1();
        } else {
            double minComun = FS.getDenominador1() * FS.getDenominador2();
            resta = (((minComun / FS.getDenominador1()) * FS.getNumerador1()) - ((minComun / FS.getDenominador2()) * FS.getNumerador2())) / minComun;
        }
        System.out.println(resta);
    }
    
    public void multiplicarFracciones(Fracciones FS) {
        double multi;
        multi = (FS.getNumerador1() * FS.getNumerador2()) / (FS.getDenominador1() * FS.getDenominador2());
        System.out.println(multi);
    }
    
    public void dividirFracciones(Fracciones FS) {
        double div;
        div = (FS.getNumerador1() * FS.getDenominador2()) / (FS.getDenominador1() * FS.getNumerador2() );
        System.out.println(div);
    }
}
