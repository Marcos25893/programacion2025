package tema4.EjerciciosClase;

public class Temperatura {

    public double temp;

    public static double celsiusToFarenheit(double temp){
        temp =(1.8)* temp +32;
        return temp;
    }
    public static double farenheitToCelsius(double temp){
        temp =(temp -32)/1.8;
        return temp;
    }

    public static void main(String[] args) {
        double temperaturacel=32;
        double temperaturafar;
        System.out.println(celsiusToFarenheit(temperaturacel));
        temperaturafar=celsiusToFarenheit(temperaturacel);
        System.out.println(farenheitToCelsius(temperaturafar));


    }

}
