package PrimeraEvaluacion.Clases.tema1;

import java.util.Scanner;

public class PrecioProducto {
    public static void main(String[] args) {
        double precio;
        int cantidad;
        double precioFinal;
        int iva;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el precio del producto ");
        precio = sc.nextDouble();
        System.out.println("Cantidad de ese producto ");
        cantidad = sc.nextInt();
        System.out.println("Dime el IVA ");
        iva = sc.nextInt();

        precioFinal = cantidad * (precio + (precio * iva / 100));

        System.out.println("El precio total del la compra es " + precioFinal);

    }
}
