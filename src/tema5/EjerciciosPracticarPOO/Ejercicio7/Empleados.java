package tema5.EjerciciosPracticarPOO.Ejercicio7;

public class Empleados {

    protected String nombre;
    protected Integer edad;
    protected Double salario;

    protected final Integer PLUS=300;

    protected Empleados(String nombre, Integer edad, Double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", PLUS=" + PLUS +
                '}';
    }
}
