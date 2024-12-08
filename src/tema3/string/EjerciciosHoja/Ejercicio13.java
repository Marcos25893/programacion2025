package tema3.string.EjerciciosHoja;

public class Ejercicio13 {
    public static void main(String[] args) {

        //Encontrar la palabra de mayor longitud de este texto: “No se me ocurre ninguna frase larga”.

        String texto="No se me ocurre ninguna frase larga";
        String mayores="";
        String palabra[]=texto.split(" ");

        for (int i=0;i<palabra.length;i++){
            if (mayores.length()<palabra[i].length()){
                mayores=palabra[i];
            }
        }
        System.out.println(mayores);


    }
}
