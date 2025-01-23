package tema4.Practica1.AcademiaMagia;

import java.util.ArrayList;
import java.util.Objects;

public class Mago {

    private String nombre;
    private Integer energia;
    private ArrayList<Hechizo> hechizos;

    public Mago(String nombre, Integer energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.hechizos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public ArrayList<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setHechizos(ArrayList<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Mago{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append(", hechizos=").append(hechizos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mago mago = (Mago) o;
        return Objects.equals(nombre, mago.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public void aprenderHechizo(Hechizo hechizo){
        this.hechizos.add(hechizo);
    }

    public void lanzarHechizo(Prueba prueba, Hechizo hechizo){

       if (buscar(hechizo.getNombre())!=null && this.energia>=hechizo.getEnergiaNecesaria()){
           if (prueba.resolver(hechizo)) {
               recargarEnergia(prueba.getRecompensa());
               System.out.println("Has completado la prueba");

           }else {
               this.energia -= prueba.getNivelDificultad();
               System.out.println("No has completado la prueba");
           }
       }else if (this.energia<hechizo.getEnergiaNecesaria()){
           System.out.println("No tienes energia suficiente para lanzar el hechizo");
       }else
           System.out.println("No puedes usar ese hechizo, primero tienes que aprenderlo");
    }

    public Hechizo buscar(String nombreHechizo){
        for (Hechizo hechizo : hechizos){
          if (hechizo.getNombre().equalsIgnoreCase(nombreHechizo)){
              return hechizo;
          }
        }
        return null;
    }

    public void recargarEnergia(Integer cantidadEnergia){
        this.energia+=cantidadEnergia;
        if (this.energia>100){
            this.energia=100;
            System.out.println("La energia esta al maximo");
        }
    }
}
