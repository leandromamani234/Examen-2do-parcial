public class ItemSoli extends Item{
    int codigoUNIV;

    public ItemSoli() {
    }

    public ItemSoli(String nombre, double cantidadSolicitada, String unidadMedida, double valorUN, double valorTOT, int codigoUNIV) {
        super(nombre, cantidadSolicitada, unidadMedida, valorUN, valorTOT);
        this.codigoUNIV = codigoUNIV;
    }

    public int getCodigoUNIV() {
        return codigoUNIV;
    }

    public void setCodigoUNIV(int codigoUNIV) {
        this.codigoUNIV = codigoUNIV;
    }

    @Override
    public String toString() {
        return "ItemSoli{" +
                "codigoUNIV=" + codigoUNIV +
                '}';
    }
}
