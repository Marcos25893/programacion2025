package tema4.Practica1.AcademiaMagia;

import java.util.Objects;

public class Hechizo {

    private String nombre;
    private int energiaNecesaria;
    private int potencia;

    public Hechizo(String nombre, int energiaNecesaria, int potencia) {
        this.nombre = nombre;
        this.energiaNecesaria = energiaNecesaria;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergiaNecesaria() {
        return energiaNecesaria;
    }

    public void setEnergiaNecesaria(int energiaNecesaria) {
        this.energiaNecesaria = energiaNecesaria;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hechizo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energiaNecesaria=").append(energiaNecesaria);
        sb.append(", potencia=").append(potencia);
        sb.append('}');
        return sb.toString();
    }

    public boolean esEfectivo(Prueba prueba){
        boolean superado=false;
        if (this.potencia>=prueba.getNivelDificultad()){
            superado=true;
        }
        return superado;
    }
}
