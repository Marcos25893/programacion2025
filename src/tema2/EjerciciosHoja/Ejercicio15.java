package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero=1;
        int mayor=0, menor=0;
        int contador=0;

        while(numero!=0){
            System.out.println("Ingrese un numero");
            numero=Integer.parseInt(sc.nextLine());
            if(contador==0){
                menor=numero;
            }
            if (numero>mayor){
                mayor=numero;
            }
            if (numero<menor && numero!=0){
                menor=numero;
            }
            if (numero!=0){
                contador++;
            }
        }

        if (mayor==0){
            System.out.println("No has introduccido ningún número");
        }else System.out.println("El mayor es: "+mayor+" El menor es: "+menor + " y has introducido " + contador + " numeros");
    }
}
