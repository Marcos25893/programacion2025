package tema5.EjerciciosPracticarPOO.Ejercicio8;

public class CuentaCorriente extends CuentaBancaria{

    private Tarjeta2 tarjetaCredito;
    private Tarjeta2 tarjetaDebito;

    public CuentaCorriente(Double saldo, Double comisionesAnual,
                           Tarjeta2 tarjetaCredito, Tarjeta2 tarjetaDebito) {
        super(saldo, true, true, comisionesAnual,0.4);
        this.tarjetaCredito=tarjetaCredito;
        this.tarjetaDebito=tarjetaDebito;

    }

    public Tarjeta2 getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(Tarjeta2 tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Tarjeta2 getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(Tarjeta2 tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaCorriente{");
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
