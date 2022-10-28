public class RubroPresupuestal {
    String nombre;
    double presupuesto;

    public RubroPresupuestal() {
    }

    public RubroPresupuestal(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "RubroPresupuestal{" +
                "nombre='" + nombre + '\'' +
                ", presupuesto=" + presupuesto +
                '}';
    }
}
