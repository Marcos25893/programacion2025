package tema3.RepasoExamen;

public class Examen3 {

    public static int comparar(String dicionario[], String palabra){
        int posicion=0;
        for (int i=0;i< dicionario.length;i++){
            if (dicionario[i].equals(palabra)){
                posicion=i;
                return posicion;
            }
        }

        return -1;
    }

    public static String convertirAMorse(String morse[], String espanol[], String palabra){
        StringBuffer sb = new StringBuffer();
        palabra=palabra.toLowerCase();

        char letra;
        int posicion=0;
        for (int i=0;i< palabra.length();i++){
            letra= palabra.charAt(i);
            posicion=comparar(espanol, String.valueOf(letra));

            if (posicion!=-1){
                sb.append(morse[posicion]);
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static String convertirAEspanol(String morse[],String espanol[], String palabraMorse){
        StringBuffer sb = new StringBuffer();
        String palabras[]=palabraMorse.split("#");

        String palabra;
        int posicion=0;
        for (int i = 0; i< palabras.length; i++){

            String letras[]=palabraMorse.split(" ");
            for (int j=0;j<letras.length;j++) {

                palabra = letras[i];
                posicion = comparar(morse, palabra);

                if (posicion != -1) {
                    sb.append(espanol[posicion]);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String morse[]={".-", "-...", "-.-.", "#"};
        String espanol[]={"a", "b", "c"," "};

        String texto="bac abc";
        String traductorMorse=convertirAMorse(morse,espanol,texto);
        System.out.println(traductorMorse);
        String traductorEspanol=convertirAEspanol(morse,espanol,traductorMorse);
        System.out.println(traductorEspanol);

    }
}
