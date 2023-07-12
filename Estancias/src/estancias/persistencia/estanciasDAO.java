package estancias.persistencia;

import estancias.entidades.estancias;
import java.util.ArrayList;
import java.util.HashMap;

public final class estanciasDAO extends DAO {

    public HashMap<Integer, Integer> estanciasclientecasa() throws Exception {
        try {
            String sql = "SELECT id_cliente, id_casa FROM estancias;";
            consultarBase(sql);

            HashMap<Integer, Integer> ids = new HashMap();

            while (resultado.next()) {
                int idCliente = resultado.getInt(1);
                int idCasa = resultado.getInt(2);
                ids.put(idCliente, idCasa);
            }
            if (ids.isEmpty()) {
                throw new Exception("No hay reservas realizadas");
            }
            desconectarBase();
            return ids;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<estancias> listarEstancias() throws Exception {
        try {
            String sql = "SELECT * FROM estancias;";
            consultarBase(sql);

            estancias auxe = null;
            ArrayList<estancias> auxel = new ArrayList();
            while (resultado.next()) {
                auxe = new estancias();
                auxe.setIdEstancia(resultado.getInt(1));
                auxe.setIdCliente(resultado.getInt(2));
                auxe.setIdCasa(resultado.getInt(3));
                auxe.setNombreHuesped(resultado.getString(4));
                auxe.setFechaDesde(resultado.getDate(5));
                auxe.setFechaHasta(resultado.getDate(6));
                auxel.add(auxe);
            }

            desconectarBase();
            return auxel;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
