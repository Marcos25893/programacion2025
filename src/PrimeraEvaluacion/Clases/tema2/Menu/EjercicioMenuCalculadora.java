package PrimeraEvaluacion.Clases.tema2.Menu;

import java.util.Scanner;

public class EjercicioMenuCalculadora {
    public static void main(String[] args) {

        // Mostrar un menu con las siguientes opciones
        //1. Sumar: pide dos numeros y sumalos
        //2. Restar:pide dos numeros y restalos
        //3. Multiplicar: pide dos numeros y multiplica
        //4. Dividir: pide dos numeros y divide
        //5. Resto division: pide dos numeros y saca el resto
        //6. Elevar: pide dos numeros y eleva el primero al segundo
        //7. Salir


        int numero1, numero2, numero3=-8;
        Scanner sc = new Scanner(System.in);

        while (numero3!=7){

            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Resto de la dividion");
            System.out.println("6.Elevar el primer numero al segundo");
            System.out.println("7.Salir");

            System.out.println("Elige una opcion");
            numero3=Integer.parseInt(sc.nextLine());

            System.out.println("Dime el valor del primer numero");
            numero1= Integer.parseInt(sc.nextLine());
            System.out.println("Dimer el valor del segundo numero");
            numero2= Integer.parseInt(sc.nextLine());


            switch (numero3){
                case 1:
                    System.out.println("La suma de los dos numeros es " + (numero1+numero2));
                    break;
                case 2:
                    System.out.println("La resta de los dos numeros es " + (numero1-numero2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los dos numeros es " + (numero1*numero2));
                    break;
                case 4:
                    System.out.println("La division de los dos numeros es " + (numero1/numero2));
                    break;
                case 5:
                    System.out.println("El resto de la division entre el primer numero y el segundo es " + (numero1%numero2));
                    break;
                case 6:
                    System.out.println("El primer numero elevado al segundo da " + (Math.pow(numero1,numero2)));
                case 7:
                    System.out.println("Adios");

            }

            if (numero3 != 7) {
                System.out.println("Pulsa cualquier tecla para continuar");
                sc.nextLine();
            }

        }

    }
}
