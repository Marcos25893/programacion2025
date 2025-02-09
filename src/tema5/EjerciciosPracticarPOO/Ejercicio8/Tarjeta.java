package tema5.EjerciciosPracticarPOO.Ejercicio8;

public class Tarjeta extends CuentaCorriente{

    private String numeroTarjetaCredito;
    private String numeroTarjetaDebito;

    public Tarjeta(Double saldo, Double comisionesAnual) {
        super(saldo, comisionesAnual);
        this.numeroTarjetaCredito = generarTarjetaCredito();
        this.numeroTarjetaDebito = generarTarjetaDebito();
    }

    public String generarTarjetaCredito(){
        StringBuffer sb = new StringBuffer();

        for (int i=0;i<5;i++) {
            sb.append(numero_aleatorio(0, 9));
        }

        char cifra;
        for (int j=4;j<numeroCuenta.length()-6;j++){
            cifra=numeroCuenta.charAt(j);
            sb.append(cifra);
        }

        sb.append(numero_aleatorio(0,9));

        return sb.toString();
    }

    public String generarTarjetaDebito(){
        StringBuffer sb = new StringBuffer();

        for (int i=0;i<5;i++) {
            sb.append(numero_aleatorio(0, 9));
        }

        char cifra;
        for (int j=4;j<numeroCuenta.length()-6;j++){
            cifra=numeroCuenta.charAt(j);
            sb.append(cifra);
        }

        sb.append(numero_aleatorio(0,9));

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "numeroTarjetaDebito='" + numeroTarjetaDebito + '\'' +
                ", numeroTarjetaCredito='" + numeroTarjetaCredito + '\'' +
                ", modifComisionesCorriente=" + modifComisionesCorriente +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
