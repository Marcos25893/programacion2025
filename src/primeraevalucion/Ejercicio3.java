package primeraevalucion;

public class Ejercicio3 {


    public static String encriptar(String texto) {
        StringBuffer sb = new StringBuffer();

//        String palabras[]=texto.split(" ");
        char letra;
//        String cambio;
//        for (String palabra:palabras){
//            StringBuffer uno = new StringBuffer();
//            letra=palabra.charAt(0);
//            sb.insert(palabra.length(), letra);
//            sb.deleteCharAt(0);
//            cambio=uno.toString();
//            sb.append(cambio);
//
//        }

        for (int i=0;i<texto.length();i++){
            letra=texto.charAt(i);
            switch (letra){
                case 'a':
                    sb.append("@");
                    break;
                case 'e':
                    sb.append("&");
                    break;
                case 'i':
                    sb.append("$");
                    break;
                case 'o':
                    sb.append("º");
                    break;
                case 'u':
                    sb.append("#");
                    break;
                default:
                    sb.append(letra);
            }
        }
        String palabras[]=texto.split(" ");
        for (String palabra:palabras){
            if (palabra.length()%2!=0){
                sb.reverse();
            }
        }


        return sb.toString();
    }


    public static String desencritar(String textoEncriptado) {
        StringBuffer sb = new StringBuffer();

        char letra;
        for (int i=0;i<textoEncriptado.length();i++){
            letra=textoEncriptado.charAt(i);
            switch (letra){
                case '@':
                    sb.append("a");
                    break;
                case 'e':
                    sb.append("e");
                    break;
                case '$':
                    sb.append("i");
                    break;
                case 'º':
                    sb.append("o");
                    break;
                case '#':
                    sb.append("u");
                    break;
                default:
                    sb.append(letra);
            }
        }

        String palabras[]=textoEncriptado.split(" ");
        for (String palabra:palabras){
            if (palabra.length()%2!=0){
                sb.reverse();
            }
        }



        return sb.toString();
    }
    public static void main(String[] args) {

        String texto="Hola mundo";
        String encritado;

        encritado=encriptar(texto);
        System.out.println(encritado);
        System.out.println(desencritar(encritado));



    }
}
