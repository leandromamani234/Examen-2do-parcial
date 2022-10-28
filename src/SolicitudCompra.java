import java.util.Date;
import java.util.List;

public class SolicitudCompra {
    boolean managerTick;
    boolean directionTick;
    int nroSolicitud;
    Date fechaSolicitud;
    Empleado dependiente;
    List<ItemSoli> itemsSolicitados;
    CentroCostos centroCostos;
    RubroPresupuestal rubroPresupuestal;

    public SolicitudCompra() {
    }

    public SolicitudCompra(boolean managerTick, boolean directionTick, int nroSolicitud, Date fechaSolicitud, Empleado dependiente, List<ItemSoli> itemsSolicitados, CentroCostos centroCostos, RubroPresupuestal rubroPresupuestal) {
        this.managerTick = managerTick;
        this.directionTick = directionTick;
        this.nroSolicitud = nroSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.dependiente = dependiente;
        this.itemsSolicitados = itemsSolicitados;
        this.centroCostos = centroCostos;
        this.rubroPresupuestal = rubroPresupuestal;
    }

    public boolean getManagerTick() {
        return managerTick;
    }

    public void setManagerTick(boolean managerTick) {
        this.managerTick = managerTick;
    }

    public boolean getDirectionTick() {
        return directionTick;
    }

    public void setDirectionTick(boolean directionTick) {
        this.directionTick = directionTick;
    }

    public int getNroSolicitud() {
        return nroSolicitud;
    }

    public void setNroSolicitud(int nroSolicitud) {
        this.nroSolicitud = nroSolicitud;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Empleado getDependiente() {
        return dependiente;
    }

    public void setDependiente(Empleado dependiente) {
        this.dependiente = dependiente;
    }

    public List<ItemSoli> getItemsSolicitados() {
        return itemsSolicitados;
    }

    public void setItemsSolicitados(List<ItemSoli> itemsSolicitados) {
        this.itemsSolicitados = itemsSolicitados;
    }

    public CentroCostos getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(CentroCostos centroCostos) {
        this.centroCostos = centroCostos;
    }

    public RubroPresupuestal getRubroPresupuestal() {
        return rubroPresupuestal;
    }

    public void setRubroPresupuestal(RubroPresupuestal rubroPresupuestal) {
        this.rubroPresupuestal = rubroPresupuestal;
    }

    @Override
    public String toString() {
        return "SolicitudCompra{" +
                "managerTick=" + managerTick +
                ", directionTick=" + directionTick +
                ", nroSolicitud=" + nroSolicitud +
                ", fechaSolicitud=" + fechaSolicitud +
                ", dependiente=" + dependiente +
                ", itemsSolicitados=" + itemsSolicitados +
                ", centroCostos=" + centroCostos +
                ", rubroPresupuestal=" + rubroPresupuestal +
                '}';
    }
}
