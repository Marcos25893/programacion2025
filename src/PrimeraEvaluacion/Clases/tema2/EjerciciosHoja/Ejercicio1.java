package PrimeraEvaluacion.Clases.tema2.EjerciciosHoja;

public class Ejercicio1 {

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

    public static void main(String[] args) {

    int num1=5;
    int num2=60;
    int num3=25;

        System.out.println("El mayor es " + mayor(num1, num2, num3));

    }
}
