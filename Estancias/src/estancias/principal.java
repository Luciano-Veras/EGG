
package estancias;


import estancias.entidades.estancias;
import estancias.service.casasService;
import estancias.service.clientesService;
import estancias.service.comentariosService;
import estancias.service.estanciasService;
import estancias.service.familiasService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class principal {

    public static void main(String[] args) throws Exception {
        
        familiasService Fs = new familiasService();
        casasService Cs = new casasService();
        estanciasService eS = new estanciasService();
        clientesService ciS = new clientesService();
        comentariosService comS = new comentariosService();
        
        
        System.out.println("-----------PUNTO A -------------");
        Fs.familiaHijos3Edad10();
        System.out.println("");
        
        System.out.println("-----------PUNTO B -------------");
        Cs.dispAgostoReinoUnido();
        System.out.println("");
        
        System.out.println("-----------PUNTO C -------------");
        Fs.emailHotmail();
        System.out.println("");
        
        System.out.println("-----------PUNTO D -------------");
        Cs.dispEleccion();
        System.out.println("");
        
        System.out.println("-----------PUNTO E -------------");
        HashMap<Integer, Integer> ids = eS.estanciasclientecasas();
        Iterator<Map.Entry<Integer, Integer>> it = ids.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            System.out.println("Cliente");
            ciS.buscarClientesPorID(entry.getKey());
            System.out.println("Casa");
            Cs.buscarCasasPorId(entry.getValue());
            System.out.println("------------------");
        }
        System.out.println("");
        
        System.out.println("-----------PUNTO F -------------");
        ArrayList<estancias> auxel= eS.listarestancias();
        Iterator<estancias> ite = auxel.iterator();
        while (ite.hasNext()) {
            estancias auxe = ite.next();
            System.out.println("Estancia");
            System.out.println(auxe.toString());
            ciS.traerClientesPorID(auxe.getIdCliente());
            Cs.buscarCasasPorId(auxe.getIdCasa());
            System.out.println("----------------------");
        }
        
        System.out.println("-----------PUNTO E -------------");
        Cs.aumentoDePrecio();

          System.out.println("----------PUNTO F-----------");
          Cs.casasPorPais();

          System.out.println("-----------PUNTO G-----------");
          int id = comS.idCasa();
          Cs.buscarCasasPorId(id);
        
    }
    
}
