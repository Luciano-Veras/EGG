
package estancias.persistencia;

public final class comentariosDAO extends DAO {
    
    public int idCasa() throws Exception {
        try {
            String sql = "SELECT DISTINCT id_casa FROM comentarios WHERE comentario LIKE '%limpia%';";
            consultarBase(sql);
            int id = 0;
            while (resultado.next()) {
            id = resultado.getInt(1);    
            }
            desconectarBase();
            return id;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
