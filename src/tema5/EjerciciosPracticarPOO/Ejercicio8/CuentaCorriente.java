package tema5.EjerciciosPracticarPOO.Ejercicio8;

public class CuentaCorriente extends CuentaBancaria{

    protected final Double modifComisionesCorriente=0.4;

    public CuentaCorriente(Double saldo, Double comisionesAnual) {
        super(saldo, true, true, comisionesAnual);

    }

    public Double getModifComisionesCorriente() {
        return modifComisionesCorriente;
    }

    public void comisionCuentaCorriente(){
        this.comisionesAnual*=this.modifComisionesCorriente;
    }
}
