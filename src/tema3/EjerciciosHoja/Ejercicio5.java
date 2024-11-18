package tema3.EjerciciosHoja;

public class Ejercicio5 {

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) )+min;
    }

    public static double media(int total, int cantidad){
        return (double) total/cantidad;
    }

    public static int mayor(int n1, int n2){
        if (n1>n2){
            return n1;
        } else {
            return n2;
        }
    }

    public static int menor(int n1, int n2){
        if (n1>n2){
            return n2;
        } else {
            return n1;
        }
    }

    public static void main(String[] args) {

        int numero[]=new int[10];
        int total=0, mayor=0, menor=0;

        for (int i=0;i< numero.length;i++){
            numero[i]=numero_aleatorio(1,50);
            System.out.println(numero[i]);
            if (i==0){
                menor=numero[i];
            }
            total+=numero[i];
            mayor=mayor(mayor,numero[i]);
            menor=menor(menor,numero[i]);
        }
        System.out.println("La media es " + media(total,numero.length));
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);


    }
}
