package Clase9.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         * Crea un HashMap<String, Double> que almacene nombres de productos y
         * sus precios. Usa un TreeMap para ordenar los productos por nombre de
         * forma alfabética. Imprime el mapa ordenado.
         */

        HashMap<String, Double> productos = new HashMap<>();
        productos.put("arroz", 5.9);
        productos.put("manzanas", 9.95);
        productos.put("fresas", 3.0);

        TreeMap<String, Double> pOrdenados = new TreeMap<>(productos);

        for(Map.Entry<String, Double> producto : pOrdenados.entrySet()) {
            System.out.println(producto.getKey() + ": " + producto.getValue());
        }
    }
}
