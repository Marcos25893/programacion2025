package tema5.EjerciciosPracticarPOO.Ejercicio7;

public class Repartidor extends Empleados{

    private String zona;

    public Repartidor(String nombre, Integer edad, Double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "zona='" + zona + '\'' +
                '}';
    }
}
