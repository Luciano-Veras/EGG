
package estancias.service;

import estancias.persistencia.comentariosDAO;

public class comentariosService {
    
    private comentariosDAO dao;

    public comentariosService() {
        this.dao = new comentariosDAO();
    }
    
    public int idCasa() throws Exception {
        try {
            int id = dao.idCasa();
            return id;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
