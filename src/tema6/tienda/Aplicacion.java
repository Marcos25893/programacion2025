package tema6.tienda;

import java.util.Scanner;
import java.util.UUID;

public class Aplicacion {

    public static void main(String[] args) throws StockInsuficienteException {

        Tienda tn1 = new Tienda();

        Scanner sc = new Scanner(System.in);

        int eleccion=0;
        String codigo, nombre, talla, material, deporte, marca;
        int stock, elegir, cantidad;
        double precio;


        do {
            try {
                System.out.println("1.Mostrar inventario");
                System.out.println("2.Agregar Producto");
                System.out.println("3.Eliminar Producto");
                System.out.println("4.Actualizar Producto");
                System.out.println("5.Realizar Compra");
                System.out.println("6.Mostrar historial de compras");
                System.out.println("7.Salir");
                eleccion = Integer.parseInt(sc.nextLine());
            }catch (Exception ex){
                System.out.println("Error");
            }
            switch (eleccion){
                case 1:
                    tn1.mostrarInventario();
                    break;
                case 2:
                    try {
                        System.out.println("Para añadir un nuevo producto tenemos que rellenar sus datos");
                        System.out.println("Cual es el código del producto");
                        codigo = sc.nextLine();
                        System.out.println("Nombre");
                        nombre = sc.nextLine();
                        System.out.println("Precio del produto");
                        precio = Double.parseDouble(sc.nextLine());
                        System.out.println("Cantidad en stock");
                        stock = Integer.parseInt(sc.nextLine());
                        System.out.println("Elige 1 si el producto es Ropa Deportiva");
                        System.out.println("Elige 2 si el producto es de Equipamiento");
                        elegir = Integer.parseInt(sc.nextLine());

                        switch (elegir) {
                            case 1:
                                System.out.println("-----Ropa Deportiva------");
                                System.out.println("Cual es la talla");
                                talla = sc.nextLine();
                                System.out.println("Material");
                                material = sc.nextLine();
                                RopaDeportiva rd = new RopaDeportiva(codigo, nombre, precio, stock, material, talla);
                                tn1.anadirProducto(rd);
                                break;

                            case 2:
                                System.out.println("-----Equipamiento-------");
                                System.out.println("De que deporte es este equipamiento");
                                deporte = sc.nextLine();
                                System.out.println("Marca del Equipamiento");
                                marca = sc.nextLine();
                                Equipamiento eq = new Equipamiento(codigo, nombre, precio, stock, marca, deporte);
                                tn1.anadirProducto(eq);
                                break;

                            default:
                                System.out.println("Valor incorrecto tienes que elegir entre 1 o 2");
                                break;
                        }
                    }catch (Exception ex){
                        System.out.println("Valor Incorrecto");
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Cual es el codigo del producto que quieres eliminar");
                        codigo = sc.nextLine();
                        tn1.eliminarProducto(codigo);

                    }catch (Exception ex){

                    }
                    break;
                case 4:
                    try {
                        System.out.println("Codigo del producto que hay que actualizar");
                        codigo = sc.nextLine();
                        System.out.println("Cual sera su nuevo precio");
                        precio = Double.parseDouble(sc.nextLine());
                        System.out.println("Cual es la nueva cantidad de Stock");
                        stock = Integer.parseInt(sc.nextLine());
                        tn1.actualizarProducto(codigo, precio, stock);

                    }catch (Exception ex){
                        System.out.println("Error");
                    }
                    break;

                case 5:
                    try {
                        System.out.println("Cual es el codigo del producto que quieres comprar");
                        codigo = sc.nextLine();
                        System.out.println("Cuantos productos quieres comprar");
                        cantidad = Integer.parseInt(sc.nextLine());
                        tn1.realizarCompra(codigo, cantidad);
                    }catch (StockInsuficienteException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 6:
                    tn1.mostrarHistorialCompras();
                    break;

                case 7:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Valor no valido");
                    break;
            }


        }while(eleccion!=7);


    }

}