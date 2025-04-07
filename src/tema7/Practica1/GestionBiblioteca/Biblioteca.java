package tema7.Practica1.GestionBiblioteca;

import java.time.LocalDate;
import java.util.*;

public class Biblioteca {

    private HashMap<String, Libro> catalogo;
    private HashMap<String, Usuario> usuarios;
    private TreeMap<Usuario, HashSet<Prestamo>> prestamos;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Biblioteca(String nombre, String direccion, String telefono, String email) {
        this.catalogo = new HashMap<>();
        this.usuarios = new HashMap<>();
        this.prestamos = new TreeMap<>(Comparator.comparing(Usuario::getDni));
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public HashMap<String, Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(HashMap<String, Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public TreeMap<Usuario, HashSet<Prestamo>> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(TreeMap<Usuario, HashSet<Prestamo>> prestamos) {
        this.prestamos = prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "catalogo=" + catalogo +
                ", usuarios=" + usuarios +
                ", prestamos=" + prestamos +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }


    public void addLibro(Libro l){
        catalogo.put(l.getIsbn(),l);
    }

    public void addUsuario(Usuario u){
        usuarios.put(u.getDni(),u);
    }

    public boolean esLibroDisponible(String isbn){
        for (Usuario u : prestamos.keySet()){
            for (Prestamo p : prestamos.get(u)){
                if (p.getLibro().getIsbn().equals(isbn) && p.estaActivo())
                    return false;
            }
        }
        return true;
    }

    public boolean prestarLibro(String dni, String isbn){
        if (esLibroDisponible(isbn)){
            Prestamo p1 = new Prestamo(usuarios.get(dni),catalogo.get(isbn),LocalDate.now(),null);

            HashSet<Prestamo> hp1 = prestamos.get(usuarios.get(dni));
            if (hp1 != null){
                hp1.add(p1);
            }else {
                HashSet<Prestamo> nuevo = new HashSet<>();
                nuevo.add(p1);
                prestamos.put(usuarios.get(dni), nuevo);

            }
            return true;
        }else
            return false;
    }

    public boolean devolverLibro(String dni, String isbn){
        for (Prestamo p : prestamos.get(usuarios.get(dni))){
            if (p.getLibro().getIsbn().equals(isbn)) {
                if (p.estaActivo()){
                    p.devolverLibro();
                    catalogo.put(p.getLibro().getIsbn(),p.getLibro());
                    prestamos.get(usuarios.get(dni)).remove(p);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void buscarPrestamosUsuario(String dni){
        for (Prestamo p : prestamos.get(usuarios.get(dni))){
            System.out.println(p.getLibro());
        }

    }

    public void listarLibrosDisponibles(){
        HashSet<Libro> libro = new HashSet<>();

        for (String i : catalogo.keySet()) {
            libro.add(catalogo.get(i));
        }

        for (Usuario u : prestamos.keySet()){
            for (Prestamo p : prestamos.get(u)) {
                libro.remove(p.getLibro());
            }
        }

        for (Libro l : libro){
            System.out.println(l);
        }
    }
}
