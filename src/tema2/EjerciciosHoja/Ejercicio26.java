package tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio26 {

    public static void convierteEnPalos(int n) {
        String palos="";
        String totalPalos="";
        int numero=0;
         if (n==0){    //Cuando el valor del numero que introducimos valga 0 solo devolvera "-"
             System.out.print("-");
         }else if (n>0) {  //Cuando sea mayor entrara en el bucle
            while (n>0){
                numero=n%10;  // Sacamos el primer numero
                if (numero==0){ //Si es 0 devuelve "--"
                    palos="--";
                }else{
                    for (int i=0; i<numero; i++){ //Si no entra en el bucle y añade a la variable palos tantos "|" como el valor que tenga numero
                        palos+="|";
                    }
                }
                if ((n%100)-(n%10)==0){ //Si el siguiente numero es un cero le pongo la variable numero=0 (se podria usar otra variable)
                    numero=0;           //solo para que luego entre en el otro if y no salga un "-" de mas
                }

                n=n/10; //Lo dividos para que en la siguiente vuelta coja el siguiente numero
                if (n<=0){ //De esta manera no sale un "-" al principio
                    totalPalos=palos + totalPalos;
                }else if (numero==0){ //Aqui uso la variable numero==0 para que no salga un "-" demas
                    totalPalos=palos+totalPalos;
                }else{ //Mientras no sea el ultimo numero y el siguiente numero no sea un cero los separa con el "-" + palos
                    totalPalos = "-" + palos + totalPalos;
                }
                palos="";
            }
             System.out.print(totalPalos);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero=-1;
        while(numero<0) {
            try {
                System.out.println("Dime un numero");
                numero = Integer.parseInt(sc.nextLine());
            }catch (Exception ex){
                System.out.println("Error, valor introducido no válido");
            }
        }
        convierteEnPalos(numero);
    }
}
