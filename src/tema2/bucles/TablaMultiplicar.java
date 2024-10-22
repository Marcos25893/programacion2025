package tema2.bucles;

public class TablaMultiplicar {
    public static void main(String[] args) {

        //Imprimir tabla de multiplicar del 9

        for (int i=0;i<=10;i++){
            System.out.println("9x" + i + "=" + (9*i));
        }

        //Imprimir todas las tablas de multiplicar del 1 al 10
        for (int y=0;y<=10;y++){
            for (int x=0; x<=10; x++){
                System.out.println(y + "*" + x + "=" + (x*y));
            }
        }

    }
}
