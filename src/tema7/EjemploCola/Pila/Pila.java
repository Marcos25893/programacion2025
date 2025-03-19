package tema7.EjemploCola.Pila;

import java.util.LinkedList;

public class Pila<E> {

    LinkedList<E> elementos;

    public Pila() {
        this.elementos = new LinkedList<>();
    }

    public void insertar(E elemento){
        this.elementos.push(elemento);
    }

    public E eliminar(){
        return this.elementos.pop();
    }

    public E mostrarElemento(){
        return this.elementos.peek();
    }
}
