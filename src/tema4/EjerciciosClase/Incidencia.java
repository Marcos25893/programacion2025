package tema4.EjerciciosClase;

public class Incidencia {

    enum Estado{ ABIERTA, PROCESO, RESUELTA}
    private Integer codigo;
    private Estado estado;
    private String problema;
    private String solucion;
    private static int pendientes;

    public Incidencia(Integer codigo, Estado estado, String problema, String solucion) {
        Incidencia.pendientes++;
        this.codigo = codigo;
        this.estado = estado;
        this.problema = problema;
        this.solucion = solucion;
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

    public void resuelve(){
        this.estado=Estado.RESUELTA;
        Incidencia.pendientes--;
//        if (this.estado==Estado.RESUELTA) {
//            Incidencia.pendientes--;
//        }
    }

//    public static void resuelve(){
//
//        Incidencia.pendientes--;
//
//    }



}
