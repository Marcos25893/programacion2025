package tema3.RepasoExamen;

public class Examen3 {

    public static int buscarDiccionario(String traductor[], String palabra){
        for (int i = 0; i< traductor.length; i++){
            if (palabra.equals(traductor[i])){
                return i;
            }
        }
        return -1;
    }

    public static String convertirAMorse(String traductorE[], String traductorM[], String textoE){
        StringBuffer sb = new StringBuffer();
        char letra;
        int posicion=0;
        for (int i=0;i<textoE.length();i++){
            letra=textoE.charAt(i);

            posicion=buscarDiccionario(traductorE, String.valueOf(letra));

            if (posicion!=-1){
                sb.append(traductorM[posicion]);
                sb.append(" ");
            }

        }
        return sb.toString();

    }

    public static String convertirAEspanol(String traductorE[], String traductorM[], String textoM){
        StringBuffer sb = new StringBuffer();
        int posicion;
        String palabras[]= textoM.split("#");
        for (String palabra: palabras){
            String letras[]=palabra.split(" ");
            for (String letra: letras){
                posicion=buscarDiccionario(traductorM,letra);

                if (posicion!=-1){
                    sb.append(traductorE[posicion]);
                }
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String espanol[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " " };
        String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "#" };

        String texto="hola mundo como estas";
        String traductorMorse=convertirAMorse(espanol,morse,texto);
        System.out.println(traductorMorse);
        String traductorEspanol=convertirAEspanol(espanol,morse,traductorMorse);
        System.out.println(traductorEspanol);


    }
}
