package PrimeraEvaluacion.Clases.tema1;

public class EjercicioNumero1234 {
    public static void main(String[] args) {

        int a=6, b=2, c=3;

        System.out.println("Ejercicio 1");
        System.out.println((a * b) % c);
        System.out.println(a * b / c);
        System.out.println(c % b + c * b);
        System.out.println(a % (a * b * c /(b + c)));
        System.out.println(b * b + c - b * (a % b));

        System.out.println("Ejercicio 2 ");
        a=3;
        System.out.println("a vale " + a + " y b vale " + b);
        b=4;
        System.out.println("a vale " + a + " y b vale " + b);
        c = 2 * a * b;
        System.out.println("a vale " + a + " y b vale " + b);
        a = a + 2;
        System.out.println("a vale " + a + " y b vale " + b);
        b= c - a;
        System.out.println("a vale " + a + " y b vale " + b);

        System.out.println("Ejercicio 3");
        int d=5, e=6, f=4, g=3;

        System.out.println(a>2);
        System.out.println((b<=25) && (b>5));
        System.out.println((c>6) || (c == d));
        System.out.println((e%2)==0 || (e>50));
        System.out.println(f > a && f > b && f > c);
        System.out.println(g==3 || g==4 || g==5);

        System.out.println("Ejercicio 4 ");
        System.out.println((3<=7) && (7<=7));
        System.out.println(!((-8>1) && (3<=4)));
        System.out.println(("Hola") == ("Hola "));
        System.out.println(((2<=5) && (3>=6)) || (2>-1));
        System.out.println(((2<=5) || (3>=6)) && (2>-1));

    }
}
