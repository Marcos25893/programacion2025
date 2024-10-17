package tema1;

public class EjercicioNumero56789 {
    public static void main(String[] args) {
//        int a='a';
//        System.out.println(a); //Si funciona a coge el valor ASCII

 //       int PI=3.14;
        //      System.out.println(PI); //No funciona porque la variable es de un entero y PI es un decimal.
//        double PI=3.14;
//        System.out.println(PI); //Si funciona al usar double que sirve para los numeros decimales

//        boolean adivina=(1==4);
//        System.out.println(adivina); //Si funciona boolean sirve para devolver true o false en este caso 1==4 es falso

//        boolean adivina=(97=='a'==97); //No funciona no se puede aplicar el == en un boolean
//        System.out.println(adivina);

        /////////////////////////////////////////////////////
        System.out.println("Ejercicio 6");


        System.out.println("Hola usuario."+" Bienvenido.");
        String dia = "Lunes";
        System.out.println("Hoy es " + dia);    //Nos muestras que el dia de hoy es lunes
        int hora = 12;
        System.out.println("Son las " + hora + " en punto.");   //Nos muestra la hora que es, en este caso las 12
        System.out.println("Dentro de 2 horas serán las " + hora + 2 + " en punto"); //Al poner la hora y sumarle un mas dos aparece la hora y un dos al lado, en este caso 122
        System.out.println("Dentro de 2 horas serán las " + (hora + 2) + " en punto"); //Ahora al ponerlo entre paretesis hace la suma, este caso 12+2=14

        ///////////////////////////////////////////////
        System.out.println("Ejercicio 7");

//        int n1=50,n2=30; //Le falta ;
//        int suma=0; //esto nunca puede ser un boolean ya que tendria que devolver verdadero o falso
//        suma=n1+n2;
//        System.out.println("LA SUMA ES: " + suma);

        //////////////////////////////////////////
        System.out.println("Ejercicio 8");

        int n2=30, suma=0, n3=6, n1=20; //falta la variable n1 y n3 hay que inicializarla
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
        suma=suma+n3;
        System.out.println(suma);

        ///////////////////////////////////////
        System.out.println("Ejercicio 9");

        int numero=2, cuad; //le falta el ;
                cuad=numero * numero; //no existe la variable número con tilde ni cuad
        System.out.println("EL CUADRADO DE "+numero+" ES: " + cuad); //la variable a de estar escrita de la misma forma o no la recoge

        //////////////////////////////////////
        System.out.println("Ejercicio 10");

        int num=5;
        num += num - 1 * 4 + 1;
        System.out.println(num); // el resultado es 7 al usar += es igual que sumarle num otra vez
        num=4;
        num %= 7 * num % 3 * 5; //el resultado es 4 ya que sale (7 * num % 3 * 5) es 5 ->4%5=4
        System.out.println(num);


    }
}
