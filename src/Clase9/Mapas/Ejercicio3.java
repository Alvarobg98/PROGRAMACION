package Clase9.Mapas;

import java.util.TreeMap;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Crea un TreeMap<Integer, String> con claves numéricas y valores
         * de colores.
         * Elimina un color del mapa e imprime el mapa resultante.
         */

        TreeMap<Integer, String> colores = new TreeMap<>();
        colores.put(1, "rojo");
        colores.put(2, "amarillo");
        colores.put(3, "verde");
        colores.put(4, "azul");

        colores.remove(2);

        System.out.println(colores);
    }
}
