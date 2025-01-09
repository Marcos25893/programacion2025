package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

import java.util.Scanner;

public class Ejercicio23 {

    public static void fecha(int dia,int mes, int ano){
        System.out.println("dia " + dia + " mes " + mes + " año " +ano);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia=0, mes=0, ano=0;

        while((dia<=0 || dia>31) || (mes<=0 || mes>12) || ano<=0) {
            try {
                System.out.println("Dime que dia es");
                dia = Integer.parseInt(sc.nextLine());

                System.out.println("Dime que mes es");
                mes = Integer.parseInt(sc.nextLine());

                System.out.println("Dime que año es");
                ano = Integer.parseInt(sc.nextLine());

                if (mes==2 && dia>28){
                    System.out.println("El mes de febrero solo tiene 28 dias");
                    dia=0;
                }
                if((mes==4 || mes==6 || mes==9 || mes==11) && dia>30){
                    System.out.println("Los meses de abril, junio, septiembre y noviembre tienen 30 dias");
                    dia=0;
                }

            } catch (Exception ex) {
                System.out.println("ERROR, los  valores no son correctos");
            }
        }

        switch (mes){
            case 1,3,5,7,8,10,12:
                if (dia==31 && mes==12){
                    mes=1;
                    dia=1;
                    ano++;
                    fecha(dia,mes,ano);
                } else if (dia==31 && mes!=12) {
                    mes++;
                    dia=1;
                    fecha(dia,mes,ano);
                } else if (dia!=31) {
                    dia++;
                    fecha(dia,mes,ano);
                }
                break;

            case  4,6,9,11:
                if (dia==30) {
                    mes++;
                    dia=1;
                    fecha(dia, mes, ano);
                } else if (dia!=30) {
                    dia++;
                    fecha(dia,mes,ano);
                }
                break;
            case 2:
                if (dia==28){
                    dia=1;
                    mes++;
                    fecha(dia,mes,ano);
                }
                break;
        }

    }
}
