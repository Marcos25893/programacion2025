package tema5.EjerciciosPracticarPOO.Ejercicio7;

public class TestEmpleado {
    public static void main(String[] args) {

        Comercial per1 = new Comercial("Paco",68,1450.0,180.5);
        Comercial per2 = new Comercial("Pepe",63,1430.5,230.5);
        Repartidor per3 = new Repartidor("Dolores",56,1500.0,false,"zona3");
        Repartidor per4 = new Repartidor("Angustias",23,1350.0,true,"zona3");
        MozoAlmacen per5 = new MozoAlmacen("Domingo",28,1200.0,true,1);
        MozoAlmacen per6 = new MozoAlmacen("Juana",35,1342.0,false,3);


        System.out.println("Tiene el PLUS " + per1.plusComercial());

        System.out.println("Tiene el PLUS " + per2.plusComercial());
        System.out.println(per2);

        System.out.println("Tiene el PLUS " + per3.plusRepartidor());
        System.out.println(per3);

        System.out.println("Tiene el PLUS " + per4.plusRepartidor());
        System.out.println(per4);

        System.out.println("Tiene el PLUS " + per5.plusMozoAlmacen());
        System.out.println(per5);

        System.out.println("Tiene el PLUS " + per6.plusMozoAlmacen());
        System.out.println(per6);





    }
}
