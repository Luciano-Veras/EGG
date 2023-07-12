
package estancias.entidades;

public class clientes {
    
    private int idCliente;
    private String nombre;
    private String calle;
    private int numeroCalle;
    private String codigoPostal;
    private String ciudad;
    private String pais;
    private String email;

    public clientes() {
    }

    public clientes(int idCliente, String nombre, String calle, int numeroCalle, String codigoPostal, String ciudad, String pais, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id Cliente: " + idCliente + ", Nombre: " + nombre + ", Calle: " + calle + ", Numero de Calle: "
                + numeroCalle + ", Codigo Postal: " + codigoPostal + ", Ciudad: " + ciudad + ", Pais: " + pais + 
                ", Email: " + email;
    }
    
    
}
