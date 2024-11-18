package tema3.EjerciciosHoja;

public class Ejercicio6 {

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) )+min;
    }

    public static void main(String[] args) {

        int numero[]=new int[10];

        for (int i=0;i<numero.length;i++){
            numero[i]=numero_aleatorio(1,30);
            System.out.println(numero[i]);
        }

        System.out.println();

        for (int i=0;i<numero.length/2;i++) {
            System.out.println(numero[i]);
            if (i==0) {
                System.out.println(numero[numero.length - 1]);
            }else System.out.println(numero[numero.length - (i+1)]);
        }
    }
}
