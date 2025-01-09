package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio24 {

    public static boolean esFechaValida(int dia,int mes,int ano){

        if ((dia>0 && dia<=31) && (mes>0 && mes<13) && (ano>0)){
            if (mes==2 && dia<=28){
                return true;
            } else if ((mes==4 || mes==6 || mes==9 || mes==11) && dia<=30) {
                return true;
            }else if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && dia<=31){
                return true;
            }
            return false;

        }
        return false;

    }

    public static boolean bisiesto(int ano){
        if ((ano%4==0)&& (ano%100!=0 || ano%400==0)){
            return true;
        }else return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Que dia es");
        int dia=Integer.parseInt(sc.nextLine());
        System.out.println("Que mes es");
        int mes=Integer.parseInt(sc.nextLine());
        System.out.println("Que año es");
        int ano=Integer.parseInt(sc.nextLine());

        System.out.println("La fecha que introdugiste es " + esFechaValida(dia,mes,ano));
        System.out.println("El año es bisiesto " + bisiesto(ano));

    }
}
