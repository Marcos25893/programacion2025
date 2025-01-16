package tema4.EjerciciosClase;

public class Finanzas {

    private double dolarEuro;

    public Finanzas() {
        this.dolarEuro = 1.36;
    }

    public Finanzas(double dolarEuro) {
        this.dolarEuro = dolarEuro;
    }

    public double getDolarEuro() {
        return dolarEuro;
    }

    public void setDolarEuro(double dolarEuro) {
        this.dolarEuro = dolarEuro;
    }

    public double dolaresToEuros(double dolares){
        double euros;
        euros=dolares/this.dolarEuro;

        return euros;
    }

    public double eurosToDolares(double euros){
        double dolares;
        dolares=euros*this.dolarEuro;

        return dolares;
    }
}
