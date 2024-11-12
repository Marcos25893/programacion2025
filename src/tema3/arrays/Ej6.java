package tema3.arrays;

public class Ej6 {

    public static boolean primo(int n) {
        for (int i=2;i<n;i++){
            if (n%i==0){
                primo: return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /////////////////////////////////////
        //La funcion primo esta mal//////////
        ////////////////////////////////////

        //6.Genera un vector de 20 elementos enteros y rellenalo con los 20 primeros numeros primos.

        int numero[]= new int[20];
        int contador=0;
        int num=1;

        while (contador>20){
            if (primo(num)){
                numero[contador]=num;
                contador++;
            }
            num++;
        }

        for (int i=0;i< numero.length;i++) {
            System.out.println(numero[i]);
        }
    }
}
