package PrimeraEvaluacion.Clases;

public class Clases {

    //Numero aleatorio

    public static int numero_aleatorio(int min , int max){

        return(int) (Math.random()*(max-min+1) )+min;
    }

    //Primo
    public static boolean esPrimo(int numero) {
        boolean primo = true;

        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                primo = false;
        }

        return primo;
    }

    //Si un numero es multiplo

    public static boolean multiplo(int a, int b){
        return a % b == 0;
    }

    //Mayor de tres numeros

    public static int mayor(int a, int b, int c){
        if (a>b && a>c) {
            return a;
        }else if (b>a && b>c) {
            return b;
        }else if (c>a && c>b) {
            return c;
        }
        return a;
    }

    //Maximo de dos numeros

    public static double maximo(double num1, double num2){
        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    //El numero Maximo de un array

    public static double maximo(double temp[]) {
        double max = temp[0];
        for(int i=1; i < temp.length; i++){
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        return max;
    }

    //Minimo de dos numeros

    public static double minimo(double num1, double num2){
        if(num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }

    //El numero Minimo de un array

    public static double minimo(double temp[]) {
        double min = temp[0];
        for(int i=1; i < temp.length; i++){
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        return min;
    }

    //Bisiesto

    public static boolean bisiesto(int ano){
        if ((ano%4==0)&& (ano%100!=0 || ano%400==0)){
            return true;
        }else return false;
    }

    //Fecha valida

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

    //Pintar un array de dos dimensiones

    public static void pintar(int matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Matriz transpuesta

    public static int[][] traspuesta(int matriz[][]) {
        int matrizT[][] = new int[5][5];

        for(int i=0; i<matriz[0].length; i++) {
            for(int j=0; j<matriz.length; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }

        return matrizT;
    }

    //Suma de diagonal principal y inversa

    public static int Suma(int numero[][], int diagonalP, int diagonalS){
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[0].length; j++) {
                if (i == j) {
                    diagonalP += numero[i][j];
                }
                if (i + j == numero.length - 1) {
                    diagonalS += numero[i][j];
                }
            }
        }
     return diagonalS;
    }

    //Ordenacion metodo burbuja (de menor a mayor)

    public static int [] ordenacionBurbujaMejorada(int matriz[]){
        int comparador;
        boolean centinela=false;
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j< matriz.length-(1+i);j++) {
                if (matriz[j] > matriz[j+1]) {  //cambiar a < para que ordene de mayor a menor
                    comparador = matriz[j];
                    matriz[j] = matriz[j+1];
                    matriz[j+1] = comparador;
                    centinela=true;
                }
            }
            if (centinela==false){
                break;
            }
            centinela=false;
        }
        return matriz;
    }

}
