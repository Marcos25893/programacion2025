package tema5.EjerciciosPracticarPOO.Ejercicio8;

import java.util.Objects;

public class CuentaBancaria {

    protected String numeroCuenta;
    protected Double saldo;
    protected Boolean tieneTarjetaCredito;
    protected Boolean tieneTarjetaDebito;
    protected Double comisionesAnual;

    public CuentaBancaria(Double saldo, Boolean tieneTarjetaCredito, Boolean tieneTarjetaDebito, Double comisionesAnual) {
        this.numeroCuenta = crearNumeroCuenta() ;
        this.saldo = saldo;
        this.tieneTarjetaCredito = tieneTarjetaCredito;
        this.tieneTarjetaDebito = tieneTarjetaDebito;
        this.comisionesAnual = comisionesAnual;
    }

    public CuentaBancaria(CuentaBancaria cuenta){
        this.numeroCuenta = cuenta.numeroCuenta ;
        this.saldo = cuenta.saldo;
        this.tieneTarjetaCredito = cuenta.tieneTarjetaCredito;
        this.tieneTarjetaDebito = cuenta.tieneTarjetaDebito;
        this.comisionesAnual = cuenta.comisionesAnual;
    }

    protected static int numero_aleatorio(int min , int max){

        return(int) (Math.random()*(max-min+1) )+min;
    }

    private String crearNumeroCuenta(){
        int numero=0;
        int contador=0;
        String cuenta="";

        StringBuffer sb = new StringBuffer(cuenta);
        while(contador<20) {
            numero = numero_aleatorio(0, 9);
            contador++;
            sb.append(numero);
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
        return comisionesAnual;
    }

    public void setComisionesAnual(Double comisionesAnual) {
        this.comisionesAnual = comisionesAnual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                ", tieneTarjetaCredito=" + tieneTarjetaCredito +
                ", tieneTarjetaDebito=" + tieneTarjetaDebito +
                ", comisionesAnual=" + comisionesAnual +
                '}';
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
