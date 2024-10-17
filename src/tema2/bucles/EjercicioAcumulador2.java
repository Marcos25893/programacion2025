package tema2.bucles;

public class EjercicioAcumulador2 {
    public static void main(String[] args) {

        // Genera 100 numeros aleatorios entre 1 y 100
        //Muestra la suma de los pares y la suma de los impares

        int par=0, aleatorio, impar=0;

        for (int i=1; i<=100; i++){
            aleatorio=(int) (Math.random() * (100+1-1)+1);
            if (aleatorio%2==0){
                par+=aleatorio;
            }else {
                impar+=aleatorio;
            }
        }
        System.out.println("la suma de los pares es " + par + " La suma de los impares " + impar);

    }
}
