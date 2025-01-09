package PrimeraEvaluacion.Clases.tema2.bucles;

import java.util.Scanner;

public class Ejercicio1While {
    public static void main(String[] args) {

        int numero=1;
        while (numero<=5){
            System.out.println(numero);
            numero=numero+1; //-> numero++;
        }

        //Pinta los numeros pares del 1 al 20
        numero=2;
        while (numero<=20){
            System.out.println(numero);
            numero+=2;//-> numero=numero+2;
        }
        //Cuenta atras del 10 al 1

        numero=10;

        while (numero>=1){
            System.out.println(numero);
            numero--;
        }
        //Muestra los numero que son decenas del 1 al 100

        numero=10;
        while (numero<=100){
            System.out.println(numero);
            numero+=10;
        }

        //Muestra los numero que son decenas del 1 al 100 empezando con el 1
        numero=1;
        while (numero<=100){
            if (numero%10==0){ //Compruebas sin es multiplo de 10, asi solo aparece 10,20,30,40,50
                System.out.println(numero);
            }
            numero++;
        }

        //Del 1 al 200 muestra los numeros impares que no sean multiplos de 7

        numero=1;
        while (numero<=200){
            if (numero%2!=0 && numero%7!=0){
                System.out.println(numero);
            }
            numero++;
        }

        //Pida por teclado un contraseña mientras la logitud sea menor de 8 caracteres
        //password.length() -->devulve la longitud de String password

        String password = "1234567";
        Scanner sc=new Scanner(System.in);

//        while(password.length() < 8){
//            System.out.println("Escribe la contraseña");
//            password= sc.nextLine();
//        }
//        System.out.println("Tu contraseña correcta es " + password);

        //Pida por teclado una contraseña mientras la longitud sea menor de 10 caracterees
        // y tenga al menos una letra mayuscula
        //password.toUpperCase() pasa la cadena a mayusculas
        //password.toLowerCase() pasa la cadena a minusculas


        while ( (password.equals(password.toLowerCase()) ) || (password.length() < 10)){
            System.out.println("Escribe contraseña");
            password= sc.nextLine();
        }

        System.out.println("Tu contraseña correcta es " + password);
    }
}
