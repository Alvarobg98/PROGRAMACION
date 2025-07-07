package Clase9.Matrices;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Crea una matriz de 4x4 y rellénala con números aleatorios
         * entre 1 y 100.
         * Imprime la matriz.
         */

        int[][] matriz = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(1, 101);
            }
        }

        System.out.println(Arrays.toString(matriz[0]) +
                "\n" + Arrays.toString(matriz[1]) +
                "\n" + Arrays.toString(matriz[2]) +
                "\n" + Arrays.toString(matriz[3]));
    }
}
