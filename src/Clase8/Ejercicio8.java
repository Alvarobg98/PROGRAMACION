package Clase8;

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {
        /*
        * Escribe un programa que rote los elementos de un array una posición
        * hacia la derecha.
        */
        int[] numeros = {1, 2, 3, 4, 5};
        int ultimo = numeros[numeros.length - 1];

        for (int i = numeros.length - 1; i > 0 ; i--) {
            numeros[i] = numeros[i - 1];
        }

        numeros[0] = ultimo;

        System.out.println(Arrays.toString(numeros));
    }
}
