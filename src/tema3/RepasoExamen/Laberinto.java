package tema3.RepasoExamen;

import java.util.Scanner;

public class Laberinto {

    public static int numero_aleatorio(int min, int max) {

        return(int) (Math.random() * (max - min + 1)) + min;
    }

    public static void pintarTablero(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println( "1 (derecha), 2 (izquierda), 3 (abajo), 4 (arriba)");
    }

    public static String[][] CrearLaberinto(String laberinto[][]){
        int meta=0;
        int lugarmeta=0;
        for (int i=0;i< laberinto.length;i++){
            for (int j=0;j<laberinto[0].length;j++){
                if (j==0 || j==laberinto[0].length-1){
                    laberinto[i][j]="|";
                } else if (i==0 || i== laberinto.length-1) {
                    laberinto[i][j]="-";
                }else laberinto[i][j]=".";
            }
        }
        laberinto[0][0]="@";

        do {
            meta = numero_aleatorio(0, laberinto[0].length - 1);
            lugarmeta = numero_aleatorio(1, 4);
        }while (meta==0 && (lugarmeta==1 || lugarmeta==3));

        switch (lugarmeta){
            case 1:
                laberinto[meta][0]="#";
                break;
            case 2:
                laberinto[meta][laberinto[0].length-1]="#";
                break;
            case 3:
                laberinto[0][meta]="#";
                break;
            case 4:
                laberinto[laberinto.length-1][meta]="#";
                break;
        }
        return laberinto;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String laberinto[][]=new String[20][20];


        int bombax=0;
        int bombay=0;
        int movimiento=0;
        int jugadorX=0;
        int jugadorY=0;
        int salidaX=0;
        int salidaY=0;
        int numeroPasos=0;

       bombax=numero_aleatorio(1,laberinto.length-2);
       bombay=numero_aleatorio(1, laberinto[0].length-2);

       CrearLaberinto(laberinto);
        System.out.println(bombax + " " + bombay);

        for (int i = 0; i < laberinto.length; i++) {
            for (int j = 0; j < laberinto[i].length; j++) {
                if (laberinto[i][j].equals("#")){
                    salidaX=i;
                    salidaY=j;
                }
            }
        }

        boolean bomba=false;
        boolean ganar=false;
        boolean salirse=false;

        while (bomba==false && ganar==false && salirse==false ){
            pintarTablero(laberinto);

            try{
                movimiento=Integer.parseInt(sc.nextLine());
                switch (movimiento){
                    case 1:
                        jugadorY++;
                        break;
                    case 2:
                        jugadorY--;
                        break;
                    case 3:
                        jugadorX++;
                        break;
                    case 4:
                        jugadorX--;
                        break;
                }
                laberinto[jugadorX][jugadorY]="@";
                if (laberinto[jugadorX][jugadorY]==laberinto[bombax][bombay]){
                    bomba=true;
                } else if (laberinto[jugadorX][jugadorY]==laberinto[salidaX][salidaY]) {
                    ganar=true;
                }

                numeroPasos++;

            }catch (IndexOutOfBoundsException ex){
                salirse=true;
                System.out.println(" ");
            }
        }

        if (ganar){
            System.out.println("Has ganado, has conseguido salir del laberinto, numero de pasos " + numeroPasos);
        } else if (bomba) {
            System.out.println("Has perdido, has pisado la bomba, numero de pasos " + numeroPasos);
        } else if (salirse) {
            System.out.println("Has perdido, te has salido del laberinto, numero de pasos " + numeroPasos);
        }

    }
}
