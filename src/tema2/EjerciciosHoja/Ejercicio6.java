package tema2.EjerciciosHoja;

public class Ejercicio6 {
    public static void main(String[] args) {

        int numero;
        int sumaimpar=0;

        for (int i=0;i<=100;i++){
            if (i%2!=0){
                sumaimpar=sumaimpar+i;
            }
        }
        System.out.println(sumaimpar);

    }
}
