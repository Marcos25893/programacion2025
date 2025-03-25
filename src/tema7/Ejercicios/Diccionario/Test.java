package tema7.Ejercicios.Diccionario;

public class Test {

    public static void main(String[] args) {

        Entrada e1 = new Entrada("Casa", "House");
        Entrada e2 = new Entrada("Perro", "Dog");
        Entrada e3 = new Entrada("Gato", "Cat");
        Entrada e4 = new Entrada("Amigo", "Friend");
        Entrada e5 = new Entrada("Libro", "Book");
        Entrada e6 = new Entrada("Cielo", "Sky");
        Entrada e7 = new Entrada("Mar", "Sea");
        Entrada e8 = new Entrada("Sol", "Sun");
        Entrada e9 = new Entrada("Luna", "Moon");
        Entrada e10 = new Entrada("Árbol", "Tree");
        Entrada e11 = new Entrada("Comida", "Food");
        Entrada e12 = new Entrada("Agua", "Water");
        Entrada e13 = new Entrada("Rápido", "Fast");
        Entrada e14 = new Entrada("Lento", "Slow");
        Entrada e15 = new Entrada("Día", "Day");
        Entrada e16 = new Entrada("Noche", "Night");
        Entrada e17 = new Entrada("Trabajo", "Work");
        Entrada e18 = new Entrada("Escuela", "School");
        Entrada e19 = new Entrada("Estudiante", "Student");
        Entrada e20 = new Entrada("Profesor", "Teacher");
        Entrada e21 = new Entrada("Ciudad", "City");
        Entrada e22 = new Entrada("Familia", "Family");
        Entrada e23 = new Entrada("Niño", "Boy");
        Entrada e24 = new Entrada("Niña", "Girl");
        Entrada e25 = new Entrada("Carro", "Car");
        Entrada e26 = new Entrada("Bicicleta", "Bicycle");
        Entrada e27 = new Entrada("Zapato", "Shoe");
        Entrada e28 = new Entrada("Ropa", "Clothes");
        Entrada e29 = new Entrada("Mesa", "Table");
        Entrada e30 = new Entrada("Silla", "Chair");
        Entrada e31 = new Entrada("Puerta", "Door");
        Entrada e32 = new Entrada("Ventana", "Window");
        Entrada e33 = new Entrada("Calle", "Street");
        Entrada e34 = new Entrada("Montaña", "Mountain");
        Entrada e35 = new Entrada("Río", "River");
        Entrada e36 = new Entrada("Piedra", "Stone");
        Entrada e37 = new Entrada("Lluvia", "Rain");
        Entrada e38 = new Entrada("Viento", "Wind");
        Entrada e39 = new Entrada("Fuego", "Fire");
        Entrada e40 = new Entrada("Fruta", "Fruit");
        Entrada e41 = new Entrada("Verdura", "Vegetable");
        Entrada e42 = new Entrada("Pescado", "Fish");
        Entrada e43 = new Entrada("Carne", "Meat");
        Entrada e44 = new Entrada("Pan", "Bread");
        Entrada e45 = new Entrada("Leche", "Milk");
        Entrada e46 = new Entrada("Jugo", "Juice");
        Entrada e47 = new Entrada("Café", "Coffee");
        Entrada e48 = new Entrada("Té", "Tea");
        Entrada e49 = new Entrada("Sopa", "Soup");
        Entrada e50 = new Entrada("Pizza", "Pizza");


        Diccionario d1 = new Diccionario();

        d1.addEntrada(e1);
        d1.addEntrada(e2);
        d1.addEntrada(e3);
        d1.addEntrada(e4);
        d1.addEntrada(e5);
        d1.addEntrada(e6);
        d1.addEntrada(e7);
        d1.addEntrada(e8);
        d1.addEntrada(e9);
        d1.addEntrada(e10);
        d1.addEntrada(e11);
        d1.addEntrada(e12);
        d1.addEntrada(e13);
        d1.addEntrada(e14);
        d1.addEntrada(e15);
        d1.addEntrada(e16);
        d1.addEntrada(e17);
        d1.addEntrada(e18);
        d1.addEntrada(e19);
        d1.addEntrada(e20);
        d1.addEntrada(e21);
        d1.addEntrada(e22);
        d1.addEntrada(e23);
        d1.addEntrada(e24);
        d1.addEntrada(e25);
        d1.addEntrada(e26);
        d1.addEntrada(e27);
        d1.addEntrada(e28);
        d1.addEntrada(e29);
        d1.addEntrada(e30);
        d1.addEntrada(e31);
        d1.addEntrada(e32);
        d1.addEntrada(e33);
        d1.addEntrada(e34);
        d1.addEntrada(e35);
        d1.addEntrada(e36);
        d1.addEntrada(e37);
        d1.addEntrada(e38);
        d1.addEntrada(e39);
        d1.addEntrada(e40);
        d1.addEntrada(e41);
        d1.addEntrada(e42);
        d1.addEntrada(e43);
        d1.addEntrada(e44);
        d1.addEntrada(e45);
        d1.addEntrada(e46);
        d1.addEntrada(e47);
        d1.addEntrada(e48);
        d1.addEntrada(e49);
        d1.addEntrada(e50);

        System.out.println(d1.listarPalabras());

        System.out.println(d1.buscarEntrada("zapato"));
        System.out.println(d1.buscarEntrada("noche"));


    }
}
