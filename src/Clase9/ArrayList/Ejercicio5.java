package Clase9.ArrayList;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {
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

        int suma = 0;
        for(ArrayList<Integer> lista : productos) {
            for (int elem : lista) {
                suma += elem;
            }
        }

        System.out.println("Suma total de precios: " + suma);
    }
}
