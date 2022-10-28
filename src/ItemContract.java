public class ItemContract extends Item{
    double cantidadDespachada;

    public ItemContract() {
    }

    public ItemContract(String nombre, double cantidadSolicitada, String unidadMedida, double valorUN, double valorTOT, double cantidadDespachada) {
        super(nombre, cantidadSolicitada, unidadMedida, valorUN, valorTOT);
        this.cantidadDespachada = cantidadDespachada;
    }

    public double getCantidadDespachada() {
        return cantidadDespachada;
    }

    public void setCantidadDespachada(double cantidadDespachada) {
        this.cantidadDespachada = cantidadDespachada;
    }

    @Override
    public String toString() {
        return "ItemContract{" +
                "cantidadDespachada=" + cantidadDespachada +
                '}';
    }
}
