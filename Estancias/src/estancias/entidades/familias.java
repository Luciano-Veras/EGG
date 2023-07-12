
package estancias.entidades;

public class familias {
    
    private int idFamilia;
    private String nombre;
    private int edadMinima;
    private int edadMaxima;
    private int numeroHijos;
    private String email;
    private int idCasaFamilia;

    public familias() {
    }

    public familias(int idFamilia, String nombre, int edadMinima, int edadMaxima, int numeroHijos, String email, int idCasaFamilia) {
        this.idFamilia = idFamilia;
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
        this.numeroHijos = numeroHijos;
        this.email = email;
        this.idCasaFamilia = idCasaFamilia;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdCasaFamilia() {
        return idCasaFamilia;
    }

    public void setIdCasaFamilia(int idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }

    @Override
    public String toString() {
        return "Id Familia: " + idFamilia + ", Nombre: " + nombre + ", Edad Minima: " + edadMinima + ", Edad Maxima: "
                + edadMaxima + ", Numero Hijos: " + numeroHijos + ", Email: " + email + ", Id Casa Familia: "
                + idCasaFamilia;
    }
    
    
}
