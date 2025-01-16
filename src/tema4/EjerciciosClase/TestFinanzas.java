package tema4.EjerciciosClase;

public class TestFinanzas {
    public static void main(String[] args) {
        Finanzas cliente1 = new Finanzas();
        Finanzas cliente2 = new Finanzas(10);

        double cambio;
        cambio =cliente1.dolaresToEuros(1750);
        System.out.println(cliente1.dolaresToEuros(1750));
        System.out.println(cliente1.eurosToDolares(cambio));


        cambio =cliente2.dolaresToEuros(1750);
        System.out.println(cliente2.dolaresToEuros(1750));
        System.out.println(cliente2.eurosToDolares(cambio));


    }
}
