package tema5.EjerciciosPracticarPOO.Ejercicio8;

public class CuentaAhorro extends CuentaBancaria {

    private Double tipoInteres;
    private final Double modifComisionesAhorro=0.5;

    public CuentaAhorro(Double saldo, Boolean tieneTarjetaCredito, Boolean tieneTarjetaDebito, Double comisionesAnual, Double tipoInteres) {
        super(saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisionesAnual);
        this.tipoInteres = tipoInteres;
    }

    public Double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(Double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public Double getModifComisionesAhorro() {
        return modifComisionesAhorro;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "tipoInteres=" + tipoInteres +
                ", modifComisionesAhorro=" + modifComisionesAhorro +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", tieneTarjetaCredito=" + tieneTarjetaCredito +
                ", tieneTarjetaDebito=" + tieneTarjetaDebito +
                ", comisionesAnual=" + comisionesAnual +
                '}';
    }

    public void interes(){
        this.saldo+=this.tipoInteres;
    }

    public void comisionAhorro(){
        this.comisionesAnual*=this.modifComisionesAhorro;
    }
}
