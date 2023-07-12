
package estancias.service;

import estancias.entidades.estancias;
import estancias.persistencia.estanciasDAO;
import java.util.ArrayList;
import java.util.HashMap;

public class estanciasService {
    
    private estanciasDAO dao;

    public estanciasService() {
        this.dao = new estanciasDAO();
    }
    
    public HashMap<Integer, Integer> estanciasclientecasas() throws Exception {
        try {
            HashMap<Integer, Integer> ids = dao.estanciasclientecasa();
            return ids;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public ArrayList<estancias> listarestancias() throws Exception {
        try {
            ArrayList<estancias> auxel = dao.listarEstancias();
            if (auxel.isEmpty()) {
                throw new Exception("No hay estancias efectuadas");
            }
            return auxel;
        } catch (Exception e) {
            throw e;
        }
    }
}
