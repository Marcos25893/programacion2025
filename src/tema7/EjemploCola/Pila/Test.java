package tema7.EjemploCola.Pila;

public class Test {

    public static void main(String[] args) {

        Pila<Proceso> procesos = new Pila<>();

        procesos.insertar(new Proceso(1,"mnb", "mnb/vn", 1));
        procesos.insertar(new Proceso(2,"qwe", "qwe/po", 3));
        procesos.insertar(new Proceso(3,"PLJ", "PLJ/xc", 2));
        procesos.insertar(new Proceso(4,"df", "df/hg", 5));

        System.out.println(procesos.mostrarElemento());
        System.out.println(procesos.eliminar());
        System.out.println(procesos.mostrarElemento());
    }
}
