package PrimeraEvaluacion.Clases.tema1;

import java.time.Month;

public class Ejercicio17G {
    public static void main(String[] args) {

        int apartadoG = (int) (Math.random() * (12 - 1 + 1)-1);

        System.out.println(Month.of(apartadoG));
    }
}
