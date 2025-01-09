package PrimeraEvaluacion.Clases.tema1;

public class ejercicioprecio {

    public static void main(String[] args) {
        //Datos de entrada: precioProducto
        //Datos de salida: precioFinal
        //Declaracion de variables------------

        double precioProducto = 69.95;
        double precioFinal = 0;

        precioFinal = precioProducto + (21 * precioProducto / 100);

        System.out.println("El precio del IVA es " + precioFinal);

    }
}
