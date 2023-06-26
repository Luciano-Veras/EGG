/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio0607;

/**
 *
 * @author lucho
 */
public class Sentencias {

    public void metodoA(int a, int b) throws MioException {
        System.out.println("Sunma : " + (a + b));
        System.out.println("Resta : " + (a - b));

        try {
            System.out.println("Multiplicacion : " + (a * b));
            if (b == 0) {
                throw new MioException("Error en division : No es posible dividir por 0.");
            }
            System.out.println("Division : " + (a / b));

        } catch (MioException e) {
            throw e;
        }
        // Linea 29 usar sin finally
//        System.out.println("Numeros : " + "A : " + a + " B : " + b);
        finally {
            System.out.println("Numeros : " + "A : " + a + " B : " + b);
        }
        
    }
}
