package tema1;

import java.util.Scanner;

public class Ejercicio10W {
    public static void main(String[] args) {

    // Pedimos por teclado el coste de fabricacion de un producto
    // Queremos pintar pon pantalla el precio que le vamos a poner al producto para el cliente
    // Al coste de fabricacion hay que sumarle la ganancia para el vendedor (30%)
    // Al precio resultante le tengo que sumar el IVA(21%)
    // Por ultimo imprimir por pantalla el precio para el cliente final

        double fabricacion, precio_final, ganancias_vendedor, precio_ganancias;

        Scanner sc = new Scanner(System.in);
        System.out.println("Precio fabricacion ");
        fabricacion = sc.nextDouble();
        ganancias_vendedor=(fabricacion +(fabricacion*0.3)) - fabricacion;
        precio_ganancias=fabricacion +(fabricacion*0.3);

        precio_final= precio_ganancias +(precio_ganancias*0.21);
        System.out.println("Las ganacias del vendedor son "
                + ganancias_vendedor + " Euros." + " El precio con el IVA es " + precio_final + " Euros");

    }

}
