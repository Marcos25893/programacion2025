package tema5.EjerciciosPracticarPOO.Ejercicio7;

public abstract class Operario extends Empleados{

    protected boolean hacerHorasExtra;

    public Operario(String nombre, Integer edad, Double salario, boolean hacerHorasExtra) {
        super(nombre, edad, salario);
        this.hacerHorasExtra = hacerHorasExtra;
    }

    public boolean isHacerHorasExtra() {
        return hacerHorasExtra;
    }

    public void setHacerHorasExtra(boolean hacerHorasExtra) {
        this.hacerHorasExtra = hacerHorasExtra;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Operario{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
        sb.append(", hacerHorasExtra=").append(hacerHorasExtra);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public abstract boolean aplicaPlus();
}
