
package estancias.service;

import estancias.entidades.familias;
import estancias.persistencia.familiasDAO;
import java.util.ArrayList;

public class familiasService {
    
    private familiasDAO dao;

    public familiasService() {
        this.dao = new familiasDAO();
    }
    
    public void familiaHijos3Edad10() throws Exception {
        try {
            
            ArrayList<familias> auxfl = dao.buscarFamiliHijos3edad10();
            if (auxfl.isEmpty()) {
                throw new Exception("No hay familias con los parametros indicados");
            }
            
            imprimir(auxfl);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void emailHotmail() throws Exception {
        
        try {
            ArrayList<familias> auxfl = dao.emailHotmail();
            if (auxfl.isEmpty()) {
                throw new Exception("No hay familias con los parametros indicados");
            }
            
            imprimir(auxfl);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void imprimir(ArrayList aux) throws Exception {
        try {
            if (aux.isEmpty()) {
                throw new Exception("No hay datos para mostrar");
            }

            for (Object elementos : aux) {
                System.out.println(elementos.toString());
            }

        } catch (Exception e) {
            throw e;
        }

    }
}

