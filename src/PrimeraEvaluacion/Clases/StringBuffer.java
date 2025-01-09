package PrimeraEvaluacion.Clases;

public class StringBuffer {

    public static void main(String[] args) {

        /*
       1. //////// Crear un StringBuffer vacío//////////
        StringBuffer sb = new StringBuffer(); // Crea un StringBuffer sin contenido inicial

       2. /////// Crear un StringBuffer con contenido inicial//////////////
        StringBuffer sb2 = new StringBuffer("Hola"); // Crea un StringBuffer con el texto "Hola"

       3. /////// Append: Añadir texto al final del StringBuffer/////////////
        sb.append(" Mundo"); // Añade " Mundo" al final del contenido actual de sb
        System.out.println("Después de append: " + sb);

       4. /////// Insert: Insertar texto en una posición específica/////////////////
        sb.insert(5, "a todos "); // Inserta "a todos " en el índice 5
        System.out.println("Después de insert: " + sb);

       5. /////// Delete: Eliminar una porción del contenido entre dos índices/////////////
        sb.delete(5, 10); // Elimina el texto entre los índices 5 (inclusive) y 10 (exclusivo)
        System.out.println("Después de delete: " + sb);

       6. //////// DeleteCharAt: Eliminar un solo carácter en una posición específica/////////////
        sb.deleteCharAt(5); // Elimina el carácter en el índice 5
        System.out.println("Después de deleteCharAt: " + sb);

       7. /////// Replace: Reemplazar una porción de texto entre dos índices//////////////////
        sb.replace(5, 10, "amigos"); // Reemplaza el texto entre los índices 5 y 10 con "amigos"
        System.out.println("Después de replace: " + sb);

       8. //////// Reverse: Invertir el contenido del StringBuffer/////////////////
        sb.reverse(); // Invierte todo el contenido de sb
        System.out.println("Después de reverse: " + sb);

       9. //////// Length: Obtener la longitud del StringBuffer////////////////
        int length = sb.length(); // Retorna la longitud del contenido de sb
        System.out.println("Longitud del StringBuffer: " + length);

       10. /////////// Capacity: Obtener la capacidad interna del StringBuffer//////////////////
        int capacity = sb.capacity(); // Retorna la capacidad interna de almacenamiento, no necesariamente la longitud del contenido
        System.out.println("Capacidad del StringBuffer: " + capacity);

       11. //////// SetLength: Cambiar la longitud del StringBuffer////////////////
        sb.setLength(5); // Establece la longitud de sb a 5 caracteres. Si es más corta, lo recorta; si es más larga, lo rellena con espacios.
        System.out.println("Después de setLength: " + sb);

       12. //////////// ToString: Convertir el StringBuffer a un String///////////////
        String str = sb.toString(); // Convierte el contenido de sb a un String normal
        System.out.println("String convertido desde StringBuffer: " + str);

       12. ////////////// EnsureCapacity: Asegurarse de que el StringBuffer tenga suficiente capacidad/////////////
        sb.ensureCapacity(100); // Asegura que el StringBuffer tenga al menos la capacidad indicada (100 en este caso)
        System.out.println("Capacidad asegurada después de ensureCapacity: " + sb.capacity());

         */
    }
}
