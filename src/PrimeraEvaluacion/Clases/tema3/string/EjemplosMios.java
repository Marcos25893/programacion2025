package PrimeraEvaluacion.Clases.tema3.string;

public class EjemplosMios {
    public static void main(String[] args) {

        String texto="hola";
        StringBuffer sb = new StringBuffer(texto);

        sb.append(" mundo");

        int longitud =texto.length();
        System.out.println(longitud);

        texto= sb.toString();

        longitud =texto.length();
        System.out.println(longitud);
        System.out.println(texto);

        char letra =texto.charAt(2);
        System.out.println(letra);

        int posicion=texto.indexOf("mundo");
        System.out.println(posicion);

        String parrafo[]=texto.split(" ");
        for (String linea:parrafo){
            System.out.println(linea);
        }

        boolean igual= texto.equals("hola mundo");
        System.out.println(igual);

        texto= texto.toUpperCase();
        System.out.println(texto);
        texto=texto.toLowerCase();
        System.out.println(texto);

        sb.deleteCharAt(1);
        System.out.println(sb.toString());
        System.out.println(texto);

        String completar="HOLA MUNDO";

        sb.replace(0,8,completar);
        System.out.println(sb.toString());

        sb.delete(0,11);
        sb.append("Paquito");
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());

        texto= sb.toString();
        texto= texto.toLowerCase();
        boolean verdad=texto.equals("paquito");
        System.out.println(verdad);
        sb.reverse();
        texto= sb.toString();
        texto= texto.toLowerCase();
        verdad=texto.equals("paquito");
        System.out.println(verdad);

        sb.setCharAt(2,'p');
        System.out.println(sb.toString());

        System.out.println(texto.substring(3));
        System.out.println(texto.substring(3,5));

        sb.replace(0,7,"Hola mundo");
        System.out.println(sb.toString());

        char[] cadena= texto.toCharArray();
        for (char cadenita: cadena){
            System.out.println(cadenita);
        }


    }
}
