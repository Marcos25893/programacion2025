package tema5.EjerciciosPracticarPOO.Ejercicio8;

public class CuentaJoven extends CuentaBancaria{

    public CuentaJoven(Double saldo, Boolean tieneTarjetaCredito, Boolean tieneTarjetaDebito, Double comisionesAnual) {
        super(saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisionesAnual,0.25);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaJoven{");
        sb.append("numeroCuenta='").append(numeroCuenta).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append(", tieneTarjetaCredito=").append(tieneTarjetaCredito);
        sb.append(", tieneTarjetaDebito=").append(tieneTarjetaDebito);
        sb.append(", comisionesAnual=").append(getComisionesAnual());
        sb.append(", modifComision=").append(modifComision);
        sb.append('}');
        return sb.toString();
    }
}
