package PrimeraEvaluacion.Clases.tema2.excepciones;

import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {
        //Vamos a pedir un precio por teclado y vamos a mostrar el precio con IVA 21%
        //Controlar que el precio sea un double y no escriba otra cosa
        //Controlar si es un numero negativo vamos a lanzar una excepcion (no importa)

        Scanner sc = new Scanner(System.in);

        double precio;

        try{
            System.out.println("Introduce precio del producto");
            precio=Double.parseDouble(sc.nextLine());
            if (precio<0){
                throw new Exception("El precio no puede ser menor que 0");
            }
            System.out.println("El precio con IVA es " + precio * 1.21);
        }catch (Exception ex){
            System.out.println("No has introducido un decimal para el precio");
            System.out.println(ex.getMessage()); //Pilla el mensaje del throw new Exception
        }
    }
}
