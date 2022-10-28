public class Item {
    String nombre;
    double CantidadSolicitada;
    String unidadMedida;
    double valorUN;
    double valorTOT;

    public Item() {
    }

    public Item(String nombre, double cantidadSolicitada, String unidadMedida, double valorUN, double valorTOT) {
        this.nombre = nombre;
        CantidadSolicitada = cantidadSolicitada;
        this.unidadMedida = unidadMedida;
        this.valorUN = valorUN;
        this.valorTOT = valorTOT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadSolicitada() {
        return CantidadSolicitada;
    }

    public void setCantidadSolicitada(double cantidadSolicitada) {
        CantidadSolicitada = cantidadSolicitada;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getValorUN() {
        return valorUN;
    }

    public void setValorUN(double valorUN) {
        this.valorUN = valorUN;
    }

    public double getValorTOT() {
        return valorTOT;
    }

    public void setValorTOT(double valorTOT) {
        this.valorTOT = valorTOT;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombre='" + nombre + '\'' +
                ", CantidadSolicitada=" + CantidadSolicitada +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", valorUN=" + valorUN +
                ", valorTOT=" + valorTOT +
                '}';
    }
}
