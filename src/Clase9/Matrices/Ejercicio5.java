package Clase9.Matrices;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Crea dos matrices de 2x2 y multiplícalas.
         * Imprime el resultado de la multiplicación.
         */

        int[][] matriz1 = {
                {1, 5},
                {12, 7}
        };

        int[][] matriz2 = {
                {8, 10},
                {12, 3}
        };

        int[][] mult = new int[matriz1.length][matriz2[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1.length; k++) {
                    mult[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        for (int[] fila : mult) {
            System.out.println(Arrays.toString(fila));
        }

    }
}
