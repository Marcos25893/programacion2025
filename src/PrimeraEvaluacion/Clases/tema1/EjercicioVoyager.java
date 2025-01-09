package PrimeraEvaluacion.Clases.tema1;

public class EjercicioVoyager {
    public static void main(String[] args) {
        // Velocidad = 58000km/h  Año= 1977 Distancia=?  v=e/t

        int velocidad=58000, ano=1977, anoactual=2024;
        double distancia, horas;

        horas =(anoactual -  ano)*24*365;
        distancia = velocidad * horas;

        System.out.println("El Voyager esta a " + distancia + "km");
    }
}
