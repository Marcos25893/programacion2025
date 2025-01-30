package tema5.EjerciciosPracticarPOO.Ejercicio1;

public class TestPersona {
    public static void main(String[] args) {

        Persona p1 = new Persona("Paco",43,"5268461D",'O',86.3,1.67);
        Persona p2 = new Persona("Ramon",47,"5268461D",'H',75.3,1.64);

        System.out.println(p1.esMayorEdad());
        System.out.println(p1.calcularIMC());
        System.out.println(p1.equals(p2));


    }
}
