public class ItemALM {
    String nombre;
    double cantidadEntregada;

    public ItemALM() {
    }

    public ItemALM(String nombre, double cantidadEntregada) {
        this.nombre = nombre;
        this.cantidadEntregada = cantidadEntregada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadEntregada() {
        return cantidadEntregada;
    }

    public void setCantidadEntregada(double cantidadEntregada) {
        this.cantidadEntregada = cantidadEntregada;
    }

    @Override
    public String toString() {
        return "ItemALM{" +
                "nombre='" + nombre + '\'' +
                ", cantidadEntregada=" + cantidadEntregada +
                '}';
    }
}
