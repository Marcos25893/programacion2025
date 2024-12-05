package tema3.string.EjerciciosHoja;

public class Ejercicio8 {
    public static void main(String[] args) {

        //Divide la cadena “http://www.iesjaroso.es/noticias” en “http”, “www.iesjaroso.es”, “noticias”.

        String texto="http://www.iesjaroso.es/noticias";

        String []trozo= texto.split("/");

        for (int i=0;i<trozo.length;i++){
            System.out.println(trozo[i]);
        }


    }
}
