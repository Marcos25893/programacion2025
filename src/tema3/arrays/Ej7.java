package tema3.arrays;

public class Ej7 {

    public static int tirada(int mayor, int menor){
        return (int)(Math.random()*(mayor-menor+1)+menor);
    }

    public static void main(String[] args) {

        //7. Genera un vector de 100 elementos enteros entre 1 y 100 aleatorios. Dime la moda
        // del vector, es decir, el número que más veces se repite.

        int numero[]= new int[100];
        int repetido[]= new int[100];

        for (int i=0; i< numero.length;i++){
            numero[i]=tirada(100,1);
        }

        for (int i=1; i<= numero.length;i++){
            for (int j=0; i< numero.length;i++){
                if (numero[j]==i){
                    repetido[i-1]++;
                }
            }
        }

        for (int i=0;i< numero.length;i++) {
            System.out.println(numero[i] + "  " + (i+1) + "  " +  repetido[i]);
        }

    }
}
