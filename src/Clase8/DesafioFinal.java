package Clase8;

import java.util.*;

public class DesafioFinal {
    public static void main(String[] args) {
        /*
        * Haz un pequeño programa que permita al usuario gestionar una lista
        * de la compra:
        *   - Añadir productos.
        *   - Mostrar productos.
        *   - Eliminar productos por nombre.
        *   - Mostrar la lista ordenada alfabéticamente.
        */
        Scanner sc = new Scanner(System.in);
        int opcion;

        ArrayList<String> productos = new ArrayList<>();
        String producto;

        boolean condicion = true;
        while (condicion) {
            System.out.print("""
                    OPCIONES:\
                    
                    \t1. Añadir productos\
                    
                    \t2. Mostrar productos\
                    
                    \t3. Eliminar productos\
                    
                    \t4. Mostrar productos ordenados por nombre\
                    
                    \t5. Salir\
                    
                    Opcion:\s""");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nIntroduce el producto: ");
                    producto = sc.next();

                    productos.add(producto);

                    System.out.println("El producto '" + producto +
                            "' se ha añadido\n");

                    break;
                case 2:
                    System.out.println("\nProductos: ");

                    if (productos.isEmpty()) {
                        System.out.println("\nNo hay productos\n");
                    } else {
                        for (String product : productos) {
                            System.out.println("\t - " + product);
                        }

                        System.out.println();
                    }

                    break;
                case 3:
                    if (!productos.isEmpty()) {
                        System.out.print("\nEliminar producto: ");
                        producto = sc.next();

                        boolean eliminado = productos.remove(producto);

                        if (eliminado) {
                            System.out.println("El producto '" + producto +
                                    "' se ha eliminado\n");
                        } else {
                            System.out.println("Producto no encontrado\n");
                        }
                    } else {
                        System.out.println("\nNo hay productos\n");
                    }

                    break;
                case 4:
                    if (!productos.isEmpty()) {
                        ArrayList<String> listaOrd = new ArrayList<>(productos);
                        Collections.sort(listaOrd);

                        System.out.println("\nProductos ordenados:");
                        for (String product : listaOrd) {
                            System.out.println("\t - " + product);
                        }

                        System.out.println();
                    } else {
                        System.out.println("\nNo hay productos\n");
                    }

                    break;
                case 5:
                    condicion = false;

                    break;
            }
        }

        sc.close();
        System.out.println("\nFin del programa");
    }
}
