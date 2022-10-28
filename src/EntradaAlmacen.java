import java.util.Date;
import java.util.List;

public class EntradaAlmacen {
    int nroEntrada;
    Date fechaEntrada;
    int nroFactura;
    Proveedor proveedor;
    double totalBienes;
    double valorTOT;
    List<ItemALM> itemsALM;
    boolean comparacion;

    public EntradaAlmacen() {
    }

    public EntradaAlmacen(int nroEntrada, Date fechaEntrada, int nroFactura, Proveedor proveedor, double totalBienes, double valorTOT, List<ItemALM> itemsALM, boolean comparacion) {
        this.nroEntrada = nroEntrada;
        this.fechaEntrada = fechaEntrada;
        this.nroFactura = nroFactura;
        this.proveedor = proveedor;
        this.totalBienes = totalBienes;
        this.valorTOT = valorTOT;
        this.itemsALM = itemsALM;
        this.comparacion = comparacion;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getTotalBienes() {
        return totalBienes;
    }

    public void setTotalBienes(double totalBienes) {
        this.totalBienes = totalBienes;
    }

    public double getValorTOT() {
        return valorTOT;
    }

    public void setValorTOT(double valorTOT) {
        this.valorTOT = valorTOT;
    }

    public List<ItemALM> getItemsALM() {
        return itemsALM;
    }

    public void setItemsALM(List<ItemALM> itemsALM) {
        this.itemsALM = itemsALM;
    }

    public boolean isComparacion() {
        return comparacion;
    }

    public void setComparacion(boolean comparacion) {
        this.comparacion = comparacion;
    }

    @Override
    public String toString() {
        return "EntradaAlmacen{" +
                "nroEntrada=" + nroEntrada +
                ", fechaEntrada=" + fechaEntrada +
                ", nroFactura=" + nroFactura +
                ", proveedor=" + proveedor +
                ", totalBienes=" + totalBienes +
                ", valorTOT=" + valorTOT +
                ", itemsALM=" + itemsALM +
                ", comparacion=" + comparacion +
                '}';
    }
}
