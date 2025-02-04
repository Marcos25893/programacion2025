package tema5.EjerciciosPracticarPOO.Ejercicio1;

import java.util.Objects;

public class Persona {

    private String nombre;
    private Integer edad;
    private String dni;
    private Character sexo;
    private Double peso;
    private Double altura;

    public Persona() {
        this.sexo='H';
    }

    public Persona(Character sexo, String dni, Integer edad, String nombre) {
        this.sexo = sexo;
        this.dni = dni;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Persona(String nombre, Integer edad, String dni, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(Persona unPersona){
        this.nombre = unPersona.nombre;
        this.edad = unPersona.edad;
        this.dni = unPersona.dni;
        this.sexo = unPersona.sexo;
        this.peso = unPersona.peso;
        this.altura = unPersona.altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", peso=").append(peso);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    public int calcularIMC(){
        double imc=0;
        int media=-10;
        if (this.altura!=0 && this.peso!=0) {
            imc = (this.peso / Math.pow(this.altura,2));
        }

        if (imc<20 && imc!=0){
            media= 1;
            System.out.println("Tiene peso ideal");
        } else if (imc<=25 && imc!=0) {
            media= 0;
            System.out.println("Estas por debajo de tu peso ideal");
        } else if (imc>25) {
            media= -1;
            System.out.println("Tienes sobrepeso");
        }

        return media;
    }

    public boolean esMayorEdad(){
        return getEdad()>=18;
    }
}
