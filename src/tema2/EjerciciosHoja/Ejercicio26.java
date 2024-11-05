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

                n=n/10; //Lo dividos para que cuando vuelva a entrar en el bucle coja el siguiente numero
                if (n<=0){ //De esta manera no sale un "-" al principio
                    totalPalos=palos + totalPalos;
                }else if (n%10==0 || numero==0){ //Cuando el numero sea cero o el siguiente lo sea para que no salga un "-" ya que palos="--"
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
