package tema5.EjerciciosClase;

public class TestTelefonoMovil {
    public static void main(String[] args) {

        TelefonoMovil t1 = new TelefonoMovil("nokia","636872145","ES",3.8);
        TelefonoMovil t2 = new TelefonoMovil(t1);
        TelefonoMovil t3 = t1;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        if (t1.equals(t2)){
            System.out.println("son iguales");
        }else System.out.println("son diferentes");

        if (t1.equals(t3)){
            System.out.println("son iguales");
        }else System.out.println("son diferentes");

        if (t2.equals(t3)){
            System.out.println("son iguales");
        }else System.out.println("son diferentes");

        if (t1==t2){
            System.out.println("son iguales");
        }else System.out.println("son diferentes");

        if (t1==t3){
            System.out.println("son iguales");
        }else System.out.println("son diferentes");

        if (t2==t3){
            System.out.println("son iguales");
        }else System.out.println("son diferentes");

        System.out.println("Se usaria mejor el equals porque esta comparando que los datos sean los mismo" +
                "mientras que el == esta viendo si miran al mismo lugar");
    }
}
