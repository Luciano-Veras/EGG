package estancias.service;

import estancias.entidades.casas;
import estancias.persistencia.casasDAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class casasService {

    private casasDAO dao;

    public casasService() {
        this.dao = new casasDAO();
    }

    public void dispAgostoReinoUnido() throws Exception {
        try {
            ArrayList<casas> auxcl = dao.dispAgostoReinoUnido();
            if (auxcl.isEmpty()) {
                throw new Exception("No hay casas disponibles en la fecha indicada");
            }

            imprimir(auxcl);

        } catch (Exception e) {
            throw e;
        }
    }

    public void dispEleccion() throws Exception {
        try {

            ArrayList<casas> auxcl = dao.dispEleccion();
            if (auxcl.isEmpty()) {
                throw new Exception("No hay casas disponibles en las fechas indicadas");
            }

            imprimir(auxcl);
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarCasasPorId(int codigo) throws Exception {
        try {
            casas auxc = dao.buscarCasasPorId(codigo);
            if (auxc == null) {
                throw new Exception("No hay casas con el Id buscado");
            }

            imprimirCasas(auxc);

        } catch (Exception e) {
            throw e;
        }
    }

    public void aumentoDePrecio() throws Exception {
        try {
            HashMap<Integer, Double> datos = new HashMap();
            datos = dao.buscarCasasPorPais();
            if (datos.isEmpty()) {
                throw new Exception("No trae valores desde DAO");
            }

            Iterator<Map.Entry<Integer, Double>> it = datos.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, Double> entry = it.next();
                System.out.println("Id casa: " + entry.getKey());
                System.out.println("Precio nuevo: " + entry.getValue() * 1.05);
                System.out.println("-------------");
            }    
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void casasPorPais() throws Exception {
        try {
            String[][] matriz = dao.casasPorPais();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    if (j == 0) {
                        System.out.println("Pais: " + matriz[i][j]);
                    } else {
                        System.out.println("Cantidad de casas: " + matriz[i][j]);
                    }
                }
            }
            
        } catch (Exception e) {
            throw e;
        }
    
    }
    
    public void imprimirCasas(casas auxc) throws Exception {
        try {
            if (auxc == null) {
                throw new Exception("No hay datos para mostrar");
            }
            System.out.println(auxc.toString());
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
