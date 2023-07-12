
package estancias.entidades;

import java.util.Date;

public class casas {
    
    private int idCasa;
    private String calle;
    private int numeroCalle;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private Date fechaDesde;
    private Date fechaHasta;
    private int tiempoMinimo;
    private int tiempoMaximo;
    private double precioHabitacion;
    private String tipoVivienda;

    public casas() {
    }

    public casas(int idCasa, String calle, int numeroCalle, String codigoPostal, String ciudad, String pais, Date fechaDesde, Date fechaHasta, int tiempoMinimo, int tiempoMaximo, double precioHabitacion, String tipoVivienda) {
        this.idCasa = idCasa;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.tiempoMinimo = tiempoMinimo;
        this.tiempoMaximo = tiempoMaximo;
        this.precioHabitacion = precioHabitacion;
        this.tipoVivienda = tipoVivienda;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getTiempoMinimo() {
        return tiempoMinimo;
    }

    public void setTiempoMinimo(int tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Id Casa: " + idCasa + ", Calle: " + calle + ", Numero de Calle=: " + numeroCalle + ", Codigo Postal: "
                + codigoPostal + ", Ciudad: " + ciudad + ", Pais: " + pais + ", Fecha Desde:" + fechaDesde + ", "
                + "Fecha Hasta: " + fechaHasta + ", Tiempo Minimo: " + tiempoMinimo + ", Tiempo Maximo: " 
                + tiempoMaximo + ", Precio de Habitacion: " + precioHabitacion + ", Tipo de Vivienda: " + tipoVivienda;
    }
    
    
    
}
