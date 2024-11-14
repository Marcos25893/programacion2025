package tema3.arrays.EjerciciosClase;

import java.util.Scanner;

public class Ej4 {

    public static String traducir(String palabra){
        String ingles[]={"hello", "house", "pink", "red", "blue", "yellow", "green", "black", "people", "boy"};
        String espanol[]={"hola", "casa", "rosa", "rojo", "azul", "amarillo", "verde", "negro", "gente", "chico"};

        for (int i=0;i<espanol.length;i++){
            if (palabra.equals(espanol[i])){
                return ingles[i];
            }
        }

        return "La palabra no tiene tradución";
    }

    public static void main(String[] args) {

        //4. Vamos a crear un pequeño diccionario inglés - español. Nos creamos un array de 10 String con
        // palabras en inglés, y luego un array de 10 String con la traducción de las palabras en español.
        // En la misma posición de los dos arrays está su palabra y la traducción. Crea un función->  public
        // function String traducir(String palabraEspañol) que devuelva la traducción al inglés. La idea es
        // buscar la posición donde está la palabra y devolver la traducción en que está en el otro array.

        String palabra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la palabra que quieras traducir al ingles");
        palabra= sc.nextLine();

        System.out.println(traducir(palabra));
    }
}
