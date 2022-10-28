import java.util.Date;
import java.util.List;

public class SalidaAlmacen {
    int nroSalida;
    Empleado encargado;
    Date fechaSalida;
    Date fechaEntrega;
    List<ItemALM> itemsALM;

    public SalidaAlmacen() {
    }

    public SalidaAlmacen(int nroSalida, Empleado encargado, Date fechaSalida, Date fechaEntrega, List<ItemALM> itemsALM) {
        this.nroSalida = nroSalida;
        this.encargado = encargado;
        this.fechaSalida = fechaSalida;
        this.fechaEntrega = fechaEntrega;
        this.itemsALM = itemsALM;
    }

    public int getNroSalida() {
        return nroSalida;
    }

    public void setNroSalida(int nroSalida) {
        this.nroSalida = nroSalida;
    }

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public List<ItemALM> getItemsALM() {
        return itemsALM;
    }

    public void setItemsALM(List<ItemALM> itemsALM) {
        this.itemsALM = itemsALM;
    }

    @Override
    public String toString() {
        return "SalidaAlmacen{" +
                "nroSalida=" + nroSalida +
                ", encargado=" + encargado +
                ", fechaSalida=" + fechaSalida +
                ", fechaEntrega=" + fechaEntrega +
                ", itemsALM=" + itemsALM +
                '}';
    }
}
