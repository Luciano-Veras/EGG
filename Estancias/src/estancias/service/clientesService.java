
package estancias.service;

import estancias.entidades.clientes;
import estancias.persistencia.clientesDAO;

public class clientesService {
    
    private clientesDAO dao;

    public clientesService() {
        this.dao = new clientesDAO();
    }
    
    public void buscarClientesPorID(int codigo) throws Exception {
        try {
            clientes auxc = dao.buscarClientePorId(codigo);
            if (auxc == null) {
                throw new Exception("No hay clientes que hayan realizado una reserva");
            }
            
            imprimirCliente(auxc);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void traerClientesPorID(int codigo) throws Exception {
        try {
            clientes auxc = dao.buscarClientePorId(codigo);
            if (auxc == null) {
                throw new Exception("No hay clientes que hayan realizado una reserva");
            }
            
            System.out.println("Datos del cliente: " + auxc.getNombre() + ", " + auxc.getPais() + ", " + auxc.getCiudad());
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirCliente(clientes auxc) throws Exception {
        try {
            if (auxc == null) {
                throw new Exception("No hay datos para mostrar");
            }
            System.out.println(auxc.toString());
        } catch (Exception e) {
        }
        
    }
    
    
}
