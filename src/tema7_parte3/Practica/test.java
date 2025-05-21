package tema7_parte3.Practica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.of(2025,12,6).plus(10, ChronoUnit.YEARS);

        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        Long suma = numeros.stream()
                .count();

        System.out.println(suma);
        /*

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        while (numero!=2) {
            System.out.println("Dime un numero");
            numero = Integer.parseInt(sc.nextLine());
            switch (numero) {
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("?");
                    break;
            }
        }

        System.out.println(numero);

        System.out.println(fecha);

        System.out.println(fecha.format(forma));
*/
    }
}
