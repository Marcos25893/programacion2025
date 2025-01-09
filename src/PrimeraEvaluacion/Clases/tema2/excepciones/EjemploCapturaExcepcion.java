package PrimeraEvaluacion.Clases.tema2.excepciones;

import java.util.Scanner;

public class EjemploCapturaExcepcion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");

        //Controlar errores
        try{
            int numero= Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException ex){
            System.out.println("No has introducido un numero valido");
        }catch (Exception ex){
            System.out.println("Otro eror");
        }
    }
}
