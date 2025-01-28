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

    /**
     * Añadiendo el hechizo pasado como parametro, a la lista de hechizos
     * que el mao tiene aprendidos
     * @param hechizo
     */
    public void aprenderHechizo(Hechizo hechizo){
        this.hechizos.add(hechizo);
    }

    /**
     * Se le pasa una prueba y el hechizo por parametros
     * Compara si tiene energia para lanzar el hechizo o no
     * Si tiene energia ve si puede completar la prueba
     * @param prueba
     * @param hechizo
     */
    public void lanzarHechizo(Prueba prueba, Hechizo hechizo){
       if (this.getEnergia()>=hechizo.getEnergiaNecesaria()){
           this.energia-=hechizo.getEnergiaNecesaria();
           if (prueba.resolver(hechizo)) {
               recargarEnergia(prueba.getRecompensa());
               System.out.println("Has completado la prueba " + hechizo.getPotencia() + "/" + prueba.getNivelDificultad());

           }else {
               this.energia -= prueba.getNivelDificultad();
               System.out.println("No has completado la prueba " + hechizo.getPotencia() + "/" + prueba.getNivelDificultad());
           }
       }else if (this.getEnergia()<hechizo.getEnergiaNecesaria()){
           System.out.println("No tienes energia suficiente, necesitas " + (hechizo.getEnergiaNecesaria()-this.getEnergia()) + " energia");
       }
    }

    /**
     * Es similar al otro lanzarHechizo pero aqui solo se le pasa el nombre del Hechizo y la prueba
     * Primero tiene que comprobar que ese hechizo lo tenga aprendido el mago llamando al metodo "buscar"
     * Y luego si tiene aprendido ese hechizo comprueba que tenga energia para lanzarlo
     * @param prueba
     * @param nombreHechizo
     */
    public void lanzarHechizo2(Prueba prueba, String nombreHechizo){
        Hechizo miHechizo = this.buscar(nombreHechizo);
        if (miHechizo!=null && this.getEnergia()>=miHechizo.getEnergiaNecesaria()){
            this.energia-=miHechizo.getEnergiaNecesaria();
            if (prueba.resolver(miHechizo)) {
                recargarEnergia(prueba.getRecompensa());
                System.out.println("Has completado la prueba " + miHechizo.getPotencia() + "/" + prueba.getNivelDificultad());

            }else {
                this.energia -= prueba.getNivelDificultad();
                System.out.println("No has completado la prueba " + miHechizo.getPotencia() + "/" + prueba.getNivelDificultad());
            }
        }else if (miHechizo==null){
            System.out.println("No puedes usar ese hechizo, primero tienes que aprenderlo");
        }else System.out.println("No tienes energia suficiente, necesitas " + (miHechizo.getEnergiaNecesaria()-this.getEnergia()) + " energia");

    }

    /**
     * Busca en los Hechizos del mago y comprueba si tiene ese hechizo
     * @param nombreHechizo
     * @return
     */
    public Hechizo buscar(String nombreHechizo){
        for (Hechizo hechizo : hechizos){
          if (hechizo.getNombre().equalsIgnoreCase(nombreHechizo)){
              return hechizo;
          }
        }
        return null;
    }

    /**
     * sumar esa cantidad de energia a la energia del mago
     * no se puedo superar mas de 100 puntos de energia
     * @param cantidadEnergia
     */
    public void recargarEnergia(Integer cantidadEnergia){
        this.energia+=cantidadEnergia;
        if (this.getEnergia()>100){
            this.setEnergia(100);
            System.out.println("La energia esta al maximo");
        }
    }

}
