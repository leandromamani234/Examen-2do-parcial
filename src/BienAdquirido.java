import java.util.Date;

public class BienAdquirido {
    int codigoEmpresa;
    Empleado responsable;
    Date fechaEntrega;
    String dirección;

    public BienAdquirido() {
    }

    public BienAdquirido(int codigoEmpresa, Empleado responsable, Date fechaEntrega, String dirección) {
        this.codigoEmpresa = codigoEmpresa;
        this.responsable = responsable;
        this.fechaEntrega = fechaEntrega;
        this.dirección = dirección;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    @Override
    public String toString() {
        return "BienAdquirido{" +
                "codigoEmpresa=" + codigoEmpresa +
                ", responsable=" + responsable +
                ", fechaEntrega=" + fechaEntrega +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}
