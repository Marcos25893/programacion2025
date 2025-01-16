package tema4.EjerciciosClase;

public class TestConsumo {
    public static void main(String[] args) {
        Consumo coche1 = new Consumo(1000,100.0,100.0,1.0);

        System.out.println("El coche tiene un gasto medio cada 100km de " + coche1.consumoEuros());
        System.out.println("Tiene un consumo medio cada 100km de " + coche1.consumoMedio());
        System.out.println("El coche tardara " + coche1.getTiempo() + " horas");
    }
}
