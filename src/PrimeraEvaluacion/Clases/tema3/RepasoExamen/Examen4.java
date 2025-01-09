package PrimeraEvaluacion.Clases.tema3.RepasoExamen;

public class Examen4 {

    public static void pintar(char matriz[][]){
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] pintarTablero(char[][] tablero){

        for (int i=0;i< tablero.length;i++){
            for (int j=0;j< tablero[0].length;j++){
                tablero[i][j]='a';
            }
        }

        return tablero;
    }

    public static char[][] colocarBarco(int x, int y, String direccion, int longitudBarco, char letra, char tablero[][]){
        int longitud=0;
        int direccionError=0;
        if (comprobarBarco(x,y,direccion,longitudBarco,tablero)){
            do {
                    tablero[x][y] = letra;
                switch (direccion){
                    case "arriba":
                        x--;
                        break;
                    case "abajo":
                        x++;
                        break;
                    case "derecha":
                        y++;
                        break;
                    case "izquierda":
                        y--;
                        break;
                    default:
                        System.out.println("Direccion no valida");
                        direccionError=1;
                        break;
                }

                longitud++;

            }while (longitudBarco!=longitud && direccionError!=1);
        }

        return tablero;
    }

    public static boolean comprobarBarco(int x, int y, String direccion, int longitudBarco, char tablero[][]){
        boolean colocar=false;
        int longitud=0;
        try {
            do {
                switch (direccion) {
                    case "arriba":
                        x--;
                        break;
                    case "abajo":
                        x++;
                        break;
                    case "derecha":
                        y++;
                        break;
                    case "izquierda":
                        y--;
                        break;
                    default:
                        colocar=false;
                        System.out.println("Tienes que elegir entre 'arriba', 'abajo','derecha','izquierda'");
                        return colocar;
                }
                if (tablero[x][y] == 'a') {
                    colocar = true;
                } else {
                    colocar = false;
                    break;
                }
                longitud++;
            } while (longitudBarco != longitud);
        }catch (Exception ex){
            System.out.println("No se puede colocar el barco");
        }

        return colocar;
    }

    public static boolean disparar(int x, int y, char tablero[][]){
        boolean acertar=true;
        if (tablero[x][y]=='a'){
            tablero[x][y]='-';
            acertar=false;
        }else{
            tablero[x][y]='x';
        }
        return acertar;
    }

    public static void main(String[] args) {

        char tablero[][]=new char[10][10];

        pintarTablero(tablero);
        colocarBarco(3,5,"derecha",3,'s',tablero);
        pintar(tablero);
        colocarBarco(3,0,"izquierda",3,'l',tablero);
        colocarBarco(3,0,"merequetengue",3,'p',tablero);
        System.out.println();
        disparar(3,5,tablero);
        pintar(tablero);
        System.out.println();
        disparar(0,2,tablero);
        pintar(tablero);






    }
}
