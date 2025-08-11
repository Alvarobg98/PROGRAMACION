package Clase9.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> productos = new ArrayList<>();
        ArrayList<Integer> productos1 = new ArrayList<>();
        ArrayList<Integer> productos2 = new ArrayList<>();
        ArrayList<Integer> productos3 = new ArrayList<>();

        productos1.add(10);
        productos1.add(15);
        productos1.add(5);

        productos2.add(6);
        productos2.add(9);
        productos2.add(12);

        productos3.add(19);
        productos3.add(22);
        productos3.add(17);

        productos.add(productos1);
        productos.add(productos2);
        productos.add(productos3);

        System.out.print("¿Que lista de productos quieres modificar?: ");
        int listaProductos = sc.nextInt();

        System.out.print("¿A que producto quieres cambiarle el precio?: ");
        int producto = sc.nextInt();

        System.out.print("Precio nuevo: ");
        int precio = sc.nextInt();
        sc.close();

        productos.get(listaProductos).set(producto, precio);

        System.out.println("Lista de precios actualizada:");
        for (ArrayList<Integer> lista : productos) {
            System.out.println(lista);
        }
    }
}
