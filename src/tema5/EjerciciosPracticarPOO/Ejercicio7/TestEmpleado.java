package tema5.EjerciciosPracticarPOO.Ejercicio7;

public class TestEmpleado {
    public static void main(String[] args) {

        Comercial per1 = new Comercial("Paco",68,1450.0,180.5);
        Comercial per2 = new Comercial("Pepe",63,1430.5,230.5);
       // Repartidor per3 = new Repartidor("Dolores",56,1500.0,"zona1");
       // Repartidor per4 = new Repartidor("Angustias",23,1350.0,"zona3");


        System.out.println(per1.plusComercial());
        System.out.println(per2);
        System.out.println(per2.plusComercial());
        System.out.println(per2);



    }
}
