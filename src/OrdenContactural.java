import java.util.Date;
import java.util.List;

public class OrdenContactural {
    int nroOrdenCont;
    int nit;
    List<Proveedor> proveedores;
    Date fechaOrden;
    Date fechaEntrega;
    double montoTotal;
    List<ItemContract> items;
    boolean directionTick;

    public OrdenContactural() {
    }

    public OrdenContactural(int nroOrdenCont, int nit, List<Proveedor> proveedores, Date fechaOrden, Date fechaEntrega, double montoTotal, List<ItemContract> items, boolean directionTick) {
        this.nroOrdenCont = nroOrdenCont;
        this.nit = nit;
        this.proveedores = proveedores;
        this.fechaOrden = fechaOrden;
        this.fechaEntrega = fechaEntrega;
        this.montoTotal = montoTotal;
        this.items = items;
        this.directionTick = directionTick;
    }

    public int getNroOrdenCont() {
        return nroOrdenCont;
    }

    public void setNroOrdenCont(int nroOrdenCont) {
        this.nroOrdenCont = nroOrdenCont;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public List<ItemContract> getItems() {
        return items;
    }

    public void setItems(List<ItemContract> items) {
        this.items = items;
    }

    public boolean getDirectionTick() {
        return directionTick;
    }

    public void setDirectionTick(boolean directionTick) {
        this.directionTick = directionTick;
    }

    @Override
    public String toString() {
        return "OrdenContactural{" +
                "nroOrdenCont=" + nroOrdenCont +
                ", nit=" + nit +
                ", proveedores=" + proveedores +
                ", fechaOrden=" + fechaOrden +
                ", fechaEntrega=" + fechaEntrega +
                ", montoTotal=" + montoTotal +
                ", items=" + items +
                ", directionTick=" + directionTick +
                '}';
    }
}
