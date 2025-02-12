package tema5.Objetos2.EquipoCiclistas;

public class Escalador extends Ciclista{

    private float aceleracionPromedioSubida;
    private float gradoDeRampaSoportada;

    public Escalador(Integer identificador, String nombre, Double tiempoAcumulado,
                     float aceleracionPromedioSubida, float gradoDeRampaSoportada) {
        super(identificador, nombre, tiempoAcumulado);
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
        this.gradoDeRampaSoportada = gradoDeRampaSoportada;
    }

    public float getAceleracionPromedioSubida() {
        return aceleracionPromedioSubida;
    }

    public void setAceleracionPromedioSubida(float aceleracionPromedioSubida) {
        this.aceleracionPromedioSubida = aceleracionPromedioSubida;
    }

    public float getGradoDeRampaSoportada() {
        return gradoDeRampaSoportada;
    }

    public void setGradoDeRampaSoportada(float gradoDeRampaSoportada) {
        this.gradoDeRampaSoportada = gradoDeRampaSoportada;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Escalador{");
        sb.append("aceleracionPromedioSubida=").append(aceleracionPromedioSubida);
        sb.append(", gradoDeRampaSoportada=").append(gradoDeRampaSoportada);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String imprimirTipo() {
        return "";
    }


}
