package tema3.EjerciciosHoja;

import java.util.Arrays;

public class Ejercicio9 {

    public static double numero_aleatorio(double min , double max){
        return (Math.random()*(max-min+1) )+min;
    }

    public static double mayor(double n1, double n2){
        if (n1>n2){
            return n1;
        } else {
            return n2;
        }
    }

    public static double menor(double n1, double n2){
        if (n1>n2){
            return n2;
        } else {
            return n1;
        }
    }

    public static void main(String[] args) {

        double corredores[]=new double[10];
        double total=0, media=0, mayor=0, menorP=0, menorS=0;
        int primero=0, segundo=0, ultimo=0;

        for (int i=0;i< corredores.length;i++){
            corredores[i]=numero_aleatorio(0.5,4.0);
            total+=corredores[i];
            System.out.println(corredores[i]);
        }

        media=total/ corredores.length;

        for (int i=0;i< corredores.length;i++){
            if (i==0){
                menorP=corredores[i];
            }
            if (corredores[i]>mayor){
                ultimo=i;
            }
            mayor=mayor(corredores[i], mayor);

            if (corredores[i]<menorP){
                primero=i;
            }

            menorP=menor(corredores[i], menorP);
        }

        menorS=mayor;

        for (int i=0;i< corredores.length;i++){
            if (primero!=i){
                if (corredores[i]<menorS){
                    segundo=i;
                }
                menorS=menor(corredores[i], menorS);
            }
        }

        System.out.println("El primero fue el corredor " + primero + " con un tiempo de " + menorP);
        System.out.println("El segundo fue el corredor " + segundo + " con un tiempo de " + menorS);
        System.out.println("El ultimo fue el corredor " + ultimo + " con un tiempo de " + mayor);
        System.out.println("La media de todos los corredores es " + media);


        //Usando Arrays.sort (ordena todos los valores de menor a mayor)
        Arrays.sort(corredores);

        System.out.printf("El primero es el corredor " + corredores[0]);
        System.out.printf("El segundo es el corredor " + corredores[1]);
        System.out.printf("El ultimo es el corredor " + corredores[9]);
    }
}
