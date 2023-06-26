/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio0304.Entidades;

/**
 *
 * @author lucho
 */
public class DivisionNumero {
    
    public int conversionInt(String a, String b){
        
        int anew = Integer.parseInt(a);
        int bnew = Integer.parseInt(b);
        
        return ( anew / bnew ); 
    }
}
