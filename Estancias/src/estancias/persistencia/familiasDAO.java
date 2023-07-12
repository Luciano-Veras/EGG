package estancias.persistencia;

import estancias.entidades.familias;
import java.util.ArrayList;

public final class familiasDAO extends DAO {

    public ArrayList<familias> buscarFamiliHijos3edad10() throws Exception {
        try {
            String sql = "SELECT * FROM familias WHERE num_hijos >= 3 AND edad_maxima <10;";
            consultarBase(sql);

            ArrayList<familias> auxfl = new ArrayList();
            familias auxf = null;

            while (resultado.next()) {
                auxf = new familias();
                auxf.setIdFamilia(resultado.getInt(1));
                auxf.setNombre(resultado.getString(2));
                auxf.setEdadMinima(resultado.getInt(3));
                auxf.setEdadMaxima(resultado.getInt(4));
                auxf.setNumeroHijos(resultado.getInt(5));
                auxf.setEmail(resultado.getString(6));
                auxf.setIdCasaFamilia(resultado.getInt(7));
                auxfl.add(auxf);
            }

            desconectarBase();
            return auxfl;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<familias> emailHotmail() throws Exception {

        try {
            String sql = "SELECT * FROM familias WHERE email LIKE '%hotmail%';";
            consultarBase(sql);
            
            ArrayList<familias> auxfl = new ArrayList();
            familias auxf = null;
            
            while (resultado.next()) {
                auxf = new familias();
                auxf.setIdFamilia(resultado.getInt(1));
                auxf.setNombre(resultado.getString(2));
                auxf.setEdadMinima(resultado.getInt(3));
                auxf.setEdadMaxima(resultado.getInt(4));
                auxf.setNumeroHijos(resultado.getInt(5));
                auxf.setEmail(resultado.getString(6));
                auxf.setIdCasaFamilia(resultado.getInt(7));
                auxfl.add(auxf);
            }
            
            desconectarBase();
            return auxfl;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
