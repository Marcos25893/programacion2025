package tema5.EjerciciosPracticarPOO.Ejercicio8;

public class CuentaAhorro extends CuentaBancaria {

    private Double tipoInteres;

    public CuentaAhorro(Double saldo, Boolean tieneTarjetaCredito, Boolean tieneTarjetaDebito,
                        Double comisionesAnual, Double tipoInteres) {
        super(saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisionesAnual,0.5);
        this.tipoInteres = tipoInteres;
    }

    public Double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(Double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaAhorro{");
        sb.append("numeroCuenta='").append(numeroCuenta).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append(", tieneTarjetaCredito=").append(tieneTarjetaCredito);
        sb.append(", tieneTarjetaDebito=").append(tieneTarjetaDebito);
        sb.append(", comisionesAnual=").append(getComisionesAnual());
        sb.append(", modifComision=").append(modifComision);
        sb.append(", tipoInteres=").append(tipoInteres);
        sb.append('}');
        return sb.toString();
    }

    public void interes(){
        this.saldo+=this.tipoInteres;
    }

}
