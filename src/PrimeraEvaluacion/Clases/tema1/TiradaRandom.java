package PrimeraEvaluacion.Clases.tema1;

public class TiradaRandom {
    public static void main(String[] args) {
        int dado;

        dado = (int) (Math.random() * (6 + 1 - 1 ) + 1); // * (max + min - 1) + min
        System.out.println(dado);
    }
}
