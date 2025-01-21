package tema4.PracticaClase;

public class TarjetaRegalo {

    private String numero;
    private double saldo;

    private static int NumeroCuenta;

    public TarjetaRegalo(double saldo) {
        TarjetaRegalo.NumeroCuenta++;
        this.saldo = saldo;
        this.numero = TarjetaRegalo.GenerarNumero();
    }

    private static String GenerarNumero(){
        return "Tarjeta" + TarjetaRegalo.NumeroCuenta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TarjetaRegalo{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public TarjetaRegalo() {
        TarjetaRegalo.NumeroCuenta++;
        this.numero = TarjetaRegalo.GenerarNumero();
        this.saldo=0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void gasta(double dineroGastado){
        this.saldo -= dineroGastado;
    }

    public void fusionarTarjeta(TarjetaRegalo tarjeta){
        this.saldo += tarjeta.getSaldo();
        tarjeta.setSaldo(0.0);
    }
}
