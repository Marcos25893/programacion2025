package tema6.EjercicioClasePoo;

import java.time.LocalDate;

public class NovelaGrafica extends Comic{

    private String resumen;

    public NovelaGrafica(Integer numPagina, LocalDate fecha, String titulo, Double precio, Genero genero,
                         Integer numeroEjemplares, String resumen) {
        super(numPagina, fecha, titulo, precio, genero, numeroEjemplares);
        this.resumen = resumen;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NovelaGrafica{");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", numPagina=").append(numPagina);
        sb.append(", autores=").append(autores);
        sb.append(", precio=").append(precio);
        sb.append(", numeroEjemplares=").append(numeroEjemplares);
        sb.append(", resumen='").append(resumen).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
