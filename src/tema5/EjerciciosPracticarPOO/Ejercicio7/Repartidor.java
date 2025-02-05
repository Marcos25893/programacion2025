package tema5.EjerciciosPracticarPOO.Ejercicio7;

import java.util.Objects;

public class Repartidor extends Operario{

    private String zona;

    public Repartidor(String nombre, Integer edad, Double salario, boolean hacerHorasExtra, String zona) {
        super(nombre, edad, salario, hacerHorasExtra);
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
        final StringBuffer sb = new StringBuffer("Repartidor{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
        sb.append(", hacerHorasExtra=").append(hacerHorasExtra);
        sb.append(", zona='").append(zona).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Repartidor that = (Repartidor) o;
        return Objects.equals(zona, that.zona);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(zona);
    }

    public boolean plusRepartidor(){
        if (this.edad<25 && this.zona.equalsIgnoreCase("zona3")){
            if (this.hacerHorasExtra){
                this.salario+=(this.PLUS*2);
            }else {
                this.salario += this.PLUS;
            }
            return true;
        }else
            return false;
    }
}
