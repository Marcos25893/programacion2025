package tema5.EjerciciosPracticarPOO.Ejercicio8;

import java.util.Objects;

public class CuentaBancaria {

    protected String numeroCuenta;
    protected Double saldo;
    protected Boolean tieneTarjetaCredito;
    protected Boolean tieneTarjetaDebito;
    protected Double comisionesAnual;
    protected final Double modifComision;

    public CuentaBancaria(Double saldo, Boolean tieneTarjetaCredito,
                          Boolean tieneTarjetaDebito, Double comisionesAnual, Double modifComision) {
        this.numeroCuenta = crearNumeroCuenta() ;
        this.saldo = saldo;
        this.tieneTarjetaCredito = tieneTarjetaCredito;
        this.tieneTarjetaDebito = tieneTarjetaDebito;
        this.comisionesAnual = comisionesAnual;
        this.modifComision = modifComision;
    }

    public CuentaBancaria(CuentaBancaria otra){
        this.numeroCuenta = otra.numeroCuenta ;
        this.saldo = otra.saldo;
        this.tieneTarjetaCredito = otra.tieneTarjetaCredito;
        this.tieneTarjetaDebito = otra.tieneTarjetaDebito;
        this.comisionesAnual = otra.comisionesAnual;
        this.modifComision = otra.modifComision;
    }

    protected static int numero_aleatorio(int min , int max){

        return(int) (Math.random()*(max-min+1) )+min;
    }

    private String crearNumeroCuenta(){

        StringBuffer sb = new StringBuffer(20);
        for (int i=0;i<20;i++){
            sb.append(numero_aleatorio(0, 9));
        }
        return sb.toString();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getTieneTarjetaCredito() {
        return tieneTarjetaCredito;
    }

    public void setTieneTarjetaCredito(Boolean tieneTarjetaCredito) {
        this.tieneTarjetaCredito = tieneTarjetaCredito;
    }

    public Boolean getTieneTarjetaDebito() {
        return tieneTarjetaDebito;
    }

    public void setTieneTarjetaDebito(Boolean tieneTarjetaDebito) {
        this.tieneTarjetaDebito = tieneTarjetaDebito;
    }

    public Double getComisionesAnual() {
        return comisionesAnual * this.modifComision;
    }

    public void setComisionesAnual(Double comisionesAnual) {
        this.comisionesAnual = comisionesAnual;
    }

    public Double getModifComision() {
        return modifComision;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaBancaria{");
        sb.append("numeroCuenta='").append(numeroCuenta).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append(", tieneTarjetaCredito=").append(tieneTarjetaCredito);
        sb.append(", tieneTarjetaDebito=").append(tieneTarjetaDebito);
        sb.append(", comisionesAnual=").append(comisionesAnual);
        sb.append(", modifComision=").append(modifComision);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(numeroCuenta, that.numeroCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroCuenta);
    }

    public void ingresar(Double cant){
        System.out.println("Se han ingresado los " + cant + " € correctamente");
        this.saldo+=cant;
    }

    public void retirar(Double cant){
        if (this.saldo>cant){
            System.out.println("Se han retirado los " + cant + " €");
            this.saldo-=cant;
        }else
            System.out.println("No se puede sacar una cantidad mayor a tu saldo. Tu saldo actual es " + this.saldo);
    }
}
