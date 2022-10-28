public class Proveedor {
    String nombre;
    String categoria;
    int nroTelefono;

    public Proveedor() {
    }

    public Proveedor(String nombre, String categoria, int nroTelefono) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.nroTelefono = nroTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(int nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nroTelefono=" + nroTelefono +
                '}';
    }
}
