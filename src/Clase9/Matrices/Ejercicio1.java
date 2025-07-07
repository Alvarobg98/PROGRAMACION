package Clase9.Matrices;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Crea dos matrices de 3x3 y suma sus elementos.
         * Imprime el resultado de la suma.
         */
        int[][] matriz1 = {
                {1, 5, 7},
                {8, 2, 3},
                {4, 6, 4}
        };

        int[][] matriz2 = {
                {2, 3, 6},
                {4, 5, 1},
                {7, 3, 2}
        };

        int[][] matriz3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println(Arrays.toString(matriz3[0]) +
                "\n" + Arrays.toString(matriz3[1]) +
                "\n" + Arrays.toString(matriz3[2]));
    }
}
