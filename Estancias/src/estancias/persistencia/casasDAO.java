package estancias.persistencia;

import estancias.entidades.casas;
import java.util.ArrayList;
import java.util.HashMap;

public final class casasDAO extends DAO {

    public ArrayList<casas> dispAgostoReinoUnido() throws Exception {
        try {
            String sql = "SELECT * FROM casas WHERE fecha_desde >= '2020-08-01' AND fecha_hasta <= '2020-08-31' AND "
                    + "pais = 'Reino Unido';";
            consultarBase(sql);

            ArrayList<casas> auxcl = new ArrayList();
            casas auxc = null;

            while (resultado.next()) {
                auxc = new casas();
                auxc.setIdCasa(resultado.getInt(1));
                auxc.setCalle(resultado.getString(2));
                auxc.setNumeroCalle(resultado.getInt(3));
                auxc.setCodigoPostal(resultado.getString(4));
                auxc.setCiudad(resultado.getString(5));
                auxc.setPais(resultado.getString(6));
                auxc.setFechaDesde(resultado.getDate(7));
                auxc.setFechaHasta(resultado.getDate(8));
                auxc.setTiempoMinimo(resultado.getInt(9));
                auxc.setTiempoMaximo(resultado.getInt(10));
                auxc.setPrecioHabitacion(resultado.getDouble(11));
                auxc.setTipoVivienda(resultado.getString(12));
                auxcl.add(auxc);
            }

            desconectarBase();
            return auxcl;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<casas> dispEleccion() throws Exception {
        try {
            String sql = "SELECT * FROM casas where fecha_desde >= '2020-07-01' AND tiempo_maximo >= 20;";
            consultarBase(sql);

            ArrayList<casas> auxcl = new ArrayList();
            casas auxc = null;

            while (resultado.next()) {
                auxc = new casas();
                auxc.setIdCasa(resultado.getInt(1));
                auxc.setCalle(resultado.getString(2));
                auxc.setNumeroCalle(resultado.getInt(3));
                auxc.setCodigoPostal(resultado.getString(4));
                auxc.setCiudad(resultado.getString(5));
                auxc.setPais(resultado.getString(6));
                auxc.setFechaDesde(resultado.getDate(7));
                auxc.setFechaHasta(resultado.getDate(8));
                auxc.setTiempoMinimo(resultado.getInt(9));
                auxc.setTiempoMaximo(resultado.getInt(10));
                auxc.setPrecioHabitacion(resultado.getDouble(11));
                auxc.setTipoVivienda(resultado.getString(12));
                auxcl.add(auxc);
            }

            desconectarBase();
            return auxcl;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public casas buscarCasasPorId(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM casas WHERE id_casa = " + codigo + ";";
            consultarBase(sql);

            casas auxc = null;
            if (resultado.next()) {
                auxc = new casas();
                auxc.setIdCasa(resultado.getInt(1));
                auxc.setCalle(resultado.getString(2));
                auxc.setNumeroCalle(resultado.getInt(3));
                auxc.setCodigoPostal(resultado.getString(4));
                auxc.setCiudad(resultado.getString(5));
                auxc.setPais(resultado.getString(6));
                auxc.setFechaDesde(resultado.getDate(7));
                auxc.setFechaHasta(resultado.getDate(8));
                auxc.setTiempoMinimo(resultado.getInt(9));
                auxc.setTiempoMaximo(resultado.getInt(10));
                auxc.setPrecioHabitacion(resultado.getDouble(11));
                auxc.setTipoVivienda(resultado.getString(12));
            }

            desconectarBase();
            return auxc;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public HashMap<Integer, Double> buscarCasasPorPais() throws Exception {
        try {
            String sql = "SELECT id_casa, precio_habitacion FROM casas WHERE pais = 'Reino Unido';";
            consultarBase(sql);

            HashMap<Integer, Double> datos = new HashMap();
            while (resultado.next()) {
                int id_casa = resultado.getInt(1);
                double precio = resultado.getDouble(2);
                datos.put(id_casa, precio);
            }

            if (datos.isEmpty()) {
                throw new Exception("No trae valores de base de datos");
            }

            desconectarBase();
            return datos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public String[][] casasPorPais() throws Exception {
        try {
            String sql = "SELECT  pais, count(*) FROM casas GROUP BY pais;";
            consultarBase(sql);

            String[][] matrizDatos = new String[3][2];
            int i = 0;
            while (resultado.next()) {
                matrizDatos[i][0] = resultado.getString(1);
                matrizDatos[i][1] = resultado.getString(2);
                i++;
            }

            desconectarBase();
            return matrizDatos;
        } catch (Exception e) {
            throw e;
        }
    }
}
