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
        final StringBuffer sb = new StringBuffer("Comercial{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
        sb.append(", comision=").append(comision);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean aplicaPlus() {
        if (this.edad>30 && this.comision>200){
            this.salario+=this.PLUS;
            return true;
        }else
            return false;
    }
}
