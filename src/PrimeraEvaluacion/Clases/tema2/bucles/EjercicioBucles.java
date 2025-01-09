package PrimeraEvaluacion.Clases.tema2.bucles;

import java.util.Scanner;

public class EjercicioBucles {
    public static void main(String[] args) {

        //Hay que pedir numeros hasta que introduzcamos el cero.
        //el resultado es la suma y la media de los numeros introducidos
        //Acumulador(la suma) y contador(el total de numeros introduccidos)

        //6,7,10,11,1--> Suma = 35, Media = 35/5

        int contador=0;
        int num1=-1;
        double suma=0;

        Scanner sc = new Scanner(System.in);

        while (num1!=0){
            System.out.println("Dime un numero");
            num1 = sc.nextInt();

            //El cero no se puede contar para la media
            if (num1!=0){
                contador++;
                suma += num1;
            }
        }

        System.out.println("El resultado de la suma es " + suma + " Y la media es " + (suma/contador));

    }
}
