package tema4.EjerciciosClase;

public class Incidencia {

    enum Estado{ ABIERTA, PROCESO, RESUELTA}
    private Integer codigo;
    private Estado estado;
    private String problema;
    private String solucion;
    private static Integer pendientes=0;

    public Incidencia(Integer codigo, String problema){
        Incidencia.pendientes++;
        this.codigo = codigo;
        this.estado = Estado.ABIERTA;
        this.problema = problema;
        this.solucion = "";
    }

    public static int getPendientes() {
        return pendientes;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo=").append(codigo);
        sb.append(", estado=").append(estado);
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void resuelve(String solucion){
        this.estado=Estado.RESUELTA;
        this.solucion = solucion;
        Incidencia.pendientes--;
    }
}
