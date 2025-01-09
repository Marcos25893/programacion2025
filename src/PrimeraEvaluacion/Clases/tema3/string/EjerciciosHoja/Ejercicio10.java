package PrimeraEvaluacion.Clases.tema3.string.EjerciciosHoja;

public class Ejercicio10 {
    public static void main(String[] args) {

        //Compara estos dos Strings sin tener en cuenta mayúsculas “Esta tarde no voy”, “esta tarde no VOY”.

        String texto="Esta tarde no voy";
        String comparar="esta tarde no VOY";

        texto=texto.toLowerCase();
        comparar=comparar.toLowerCase();

        if (texto.equals(comparar)){
            System.out.println("Los dos textos son iguales");
        }else System.out.println("No son iguales");

    }
}
