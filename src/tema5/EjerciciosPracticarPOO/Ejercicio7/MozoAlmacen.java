package tema5.EjerciciosPracticarPOO.Ejercicio7;

import java.util.Objects;

public class MozoAlmacen extends Operario {

    private Integer peligrosidad;

    public MozoAlmacen(String nombre, Integer edad, Double salario,
                       boolean hacerHorasExtra, Integer peligrosidad) {
        super(nombre, edad, salario, hacerHorasExtra);
        this.peligrosidad = peligrosidad;
    }

    public Integer getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(Integer peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MozoAlmacen{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
        sb.append(", hacerHorasExtra=").append(hacerHorasExtra);
        sb.append(", peligrosidad='").append(peligrosidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MozoAlmacen that = (MozoAlmacen) o;
        return Objects.equals(peligrosidad, that.peligrosidad);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(peligrosidad);
    }

    public boolean plusMozoAlmacen(){
        if ((this.peligrosidad==3 && this.edad>30) || (this.peligrosidad==1 && this.edad < 30)) {
            if (this.hacerHorasExtra){
                this.salario += (this.PLUS * 2);
            }else {
                this.salario += this.PLUS;
            }
            return true;
        }else
            return false;
    }
}
