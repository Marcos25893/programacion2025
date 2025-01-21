package tema4.PracticaClase;

public class Pizza {

    enum Size{ PEQUEÑA, MEDIANA, FAMILIAR }
    enum Estado{PREPARADA, SERVIDA}
    enum Tipo{BARBACOA, CARBONARA, CUATROQUESOS}

    private Size tamano;
    private Estado estado;
    private Tipo tipo;

    public Pizza(Size tamano, Tipo tipo) {
        this.tamano = tamano;
        this.estado = Estado.PREPARADA;
        this.tipo = tipo;
        Pizza.TotalPreparadas++;
    }

    private static int TotalPreparadas;
    private static int TotalServidas;

    public void sirve(){
        if (this.estado == Estado.PREPARADA){
            setEstado(Estado.SERVIDA);
            TotalServidas++;
        }
    }

    public void setTamano(Size tamano) {
        this.tamano = tamano;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public static int getTotalPreparadas() {
        return TotalPreparadas;
    }

    public static int getTotalServidas() {
        return TotalServidas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pizza{");
        sb.append("tamano=").append(tamano);
        sb.append(", estado=").append(estado);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Size getTamano() {
        return tamano;
    }

    public Estado getEstado() {
        return estado;
    }
}
