package Clase9.Matrices;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Crea una matriz de 3x3 que sea una matriz identidad
         * (con 1 en la diagonal principal y 0 en el resto).
         * Imprime la matriz.
         */
        int[][] matrizId = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    matrizId[i][j] = 1;
                } else {
                    matrizId[i][j] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(matrizId[0]) +
                        "\n" + Arrays.toString(matrizId[1]) +
                        "\n" + Arrays.toString(matrizId[2])
        );
    }
}
