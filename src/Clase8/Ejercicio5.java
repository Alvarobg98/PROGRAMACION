package Clase8;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        * Declara un array con números desordenados y ordénalo de menor a mayor
        * utilizando Arrays.sort().
        */
        int[] valores = {33, 5, 18, 87, 45, 24, 36, 74};

        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores));
    }
}
