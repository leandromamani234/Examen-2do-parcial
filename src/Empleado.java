import java.util.List;

public class Empleado {
    CentroCostos centroCostos;
    List<CentroCostos> dependecias;
    String nombre;
    String primerApellido;
    int cedulaID;

    public Empleado() {
    }

    public Empleado(CentroCostos centroCostos, List<CentroCostos> dependecias, String nombre, String primerApellido, int cedulaID) {
        this.centroCostos = centroCostos;
        this.dependecias = dependecias;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.cedulaID = cedulaID;
    }

    public CentroCostos getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(CentroCostos centroCostos) {
        this.centroCostos = centroCostos;
    }

    public List<CentroCostos> getDependecias() {
        return dependecias;
    }

    public void setDependecias(List<CentroCostos> dependecias) {
        this.dependecias = dependecias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getCedulaID() {
        return cedulaID;
    }

    public void setCedulaID(int cedulaID) {
        this.cedulaID = cedulaID;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "centroCostos=" + centroCostos +
                ", dependecias=" + dependecias +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", cedulaID=" + cedulaID +
                '}';
    }
}
