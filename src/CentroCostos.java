public class CentroCostos {
    String nombre;
    Empleado dependiente;

    public CentroCostos() {
    }

    public CentroCostos(String nombre, Empleado dependiente) {
        this.nombre = nombre;
        this.dependiente = dependiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getDependiente() {
        return dependiente;
    }

    public void setDependiente(Empleado dependiente) {
        this.dependiente = dependiente;
    }

    @Override
    public String toString() {
        return "CentroCostos{" +
                "nombre='" + nombre + '\'' +
                ", dependiente=" + dependiente +
                '}';
    }
}
