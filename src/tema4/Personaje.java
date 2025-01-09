package tema4;

public class Personaje {
    //1. Crear una clase Personaje
    //   Propiedades: (private)
    //   - nombre de tipo String
    //   - clase de tipo String (elfo, bárbaro, ...)
    //   - sexo de tipo String (hombre, mujer, nodefinido)
    //   - vida de tipo Integer (0 - 100)
    //
    //   Constructor
    //   - Todas las propiedades -> new Personaje("Aragorn", "Guerrero", "hombre", 50)
    //   - Vacío -> new Personaje() -> que ponga por defecto ("SinNombre", "Humano", "nodefinido",10)
    //
    //   Métodos
    //   - Getter
    //   - Setter
    //   - ToString
    //
    //2. Crear una clase TestPersonaje
    //   - Crear un objeto jugador1 con los valores que queráis.
    //   - Crear un objeto jugador2 con los valores por defecto.
    //   - Cambiar la clase de jugador1 a "Enano"
    //   - Cambiar la vida de jugador2 a 75
    //   - Pintar jugador1 y jugador2

    private String nombre;
    private String clase;
    private String sexo;
    private Integer vida;

    public Personaje(String nombre, String clase, String sexo, Integer vida) {
        this.nombre = nombre;
        this.clase = clase;
        this.sexo = sexo;
        this.vida = vida;
    }

    public Personaje() {
        this.nombre="SinNombre";
        this.clase="Humano";
        this.sexo="nodefinido";
        this.vida=10;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", clase='" + clase + '\'' +
                ", sexo='" + sexo + '\'' +
                ", vida=" + vida +
                '}';
    }
}
