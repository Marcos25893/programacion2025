package tema3.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio3 {

    public static int numero_aleatorio(int min , int max){

        return(int) (Math.random()*(max-min+1) )+min;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad=0, digito=-1;

        while(cantidad<1) {
            try {
                System.out.println("Cual va a ser el tamaño del array");
                cantidad = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("Valor no valido");
            }
        }

        while (digito<0 || digito>9) {
            try {
                System.out.println("Que ultimo digito quieres que sea los numeros que se muestran");
                digito = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                System.out.println("Valor no valido");
            }
        }

        int numero[]=new int[cantidad];
        int resultado[]=new int[cantidad];
        int contador=0;

        while (contador<cantidad) {
            for (int i = 0; i < numero.length; i++) {
                numero[i] = numero_aleatorio(1, 300);
                if (numero[i] % 10 == digito) {
                    if (contador<cantidad) {
                        resultado[contador] = numero[i];
                        contador++;
                    }else break;
                }
            }
        }

        for (int i=0;i< resultado.length;i++){
            System.out.println(resultado[i]);
        }

    }
}
