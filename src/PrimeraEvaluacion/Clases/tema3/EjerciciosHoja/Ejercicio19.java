package PrimeraEvaluacion.Clases.tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio19 {

    public static void anadir(int matriz[], int numero, int contador){
            matriz[contador]=numero;
            for (int i= 0;i< contador+1;i++){
                System.out.println(matriz[i]);
            }
    }

    public static void eliminar(int matriz[], int contador){
        System.out.println("Has eliminado el numero " + matriz[contador]);
        matriz[contador]=0;
        for (int i= 0;i< contador+1;i++){
            System.out.println(matriz[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int eleccion;
        int pila[]=new int[20];
        int contador=0;

        do {
            if (contador==20){
                System.out.println("Has llenado la pila");
                System.out.println("1.Salir");
                System.out.println("2.Eliminar numero");
                eleccion=Integer.parseInt(sc.nextLine());
                if (eleccion==1){
                    break;
                }
            }else {
                System.out.println("1.Añadir numero");
                System.out.println("2.Eliminar numero");
                System.out.println("3.Ver pila");
                System.out.println("Elige una opcion");
                eleccion = Integer.parseInt(sc.nextLine());
            }
            if (eleccion==1) {
                System.out.println("Que numero quieres añadir a la pila");
                numero = Integer.parseInt(sc.nextLine());
                anadir(pila, numero, contador);
                contador++;
            } else if (eleccion==2) {
                contador--;
                eliminar(pila,contador);
            }else System.out.println("Valor incorrecto tienes que elegir entre el 1 o 2");
        }while (contador!=21);

    }
}
