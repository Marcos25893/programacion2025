package tema5.EjerciciosPracticarPOO.Ejercicio7;

public class Comercial extends Empleados {

    private Double comision;

    public Comercial(String nombre, Integer edad, Double salario, Double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "comision=" + comision +
                '}';
    }
}
