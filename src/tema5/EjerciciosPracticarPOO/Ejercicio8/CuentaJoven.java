package tema5.EjerciciosPracticarPOO.Ejercicio8;

public class CuentaJoven extends CuentaBancaria{

    private final Double modifComisionesJoven=0.25;

    public CuentaJoven(Double saldo, Boolean tieneTarjetaCredito, Boolean tieneTarjetaDebito, Double comisionesAnual) {
        super(saldo, tieneTarjetaCredito, tieneTarjetaDebito, comisionesAnual);
    }

    public Double getModifComisionesJoven() {
        return modifComisionesJoven;
    }

    @Override
    public String toString() {
        return "CuentaJoven{" +
                "modifComisionesJoven=" + modifComisionesJoven +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", tieneTarjetaCredito=" + tieneTarjetaCredito +
                ", tieneTarjetaDebito=" + tieneTarjetaDebito +
                ", comisionesAnual=" + comisionesAnual +
                '}';
    }

    public void comisionJoven(){
        this.comisionesAnual*=this.modifComisionesJoven;
    }
}
