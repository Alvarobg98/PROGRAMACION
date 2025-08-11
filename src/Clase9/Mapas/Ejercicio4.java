package Clase9.Mapas;

import java.util.HashMap;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
         * Crea un HashMap<String, Integer> que almacene productos y sus
         * cantidades. Actualiza la cantidad de un producto y luego muestra el
         * mapa actualizado.
         */

        HashMap<String, Integer> productos = new HashMap<>();
        productos.put("arroz", 5);
        productos.put("manzanas", 10);
        productos.put("fresas", 3);

        productos.replace("fresas", 15);

        System.out.println(productos);
    }
}
