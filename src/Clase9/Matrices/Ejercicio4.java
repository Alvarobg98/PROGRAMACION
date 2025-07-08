package Clase9.Matrices;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * Crea una matriz de 2x3 y transponla, es decir, 
         * convierte sus filas en columnas.
         * Imprime la matriz original y la transpuesta.
         */
        
        int[][] matrizOrig = {
                {2, 8 ,4},
                {5, 1, 7}
        }; 
        
        int[][] matrizTrasp = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrizTrasp[i][j] = matrizOrig[j][i];
            }
        }

        System.out.println("Matriz original:" +
                "\n" + Arrays.toString(matrizOrig[0]) +
                "\n" + Arrays.toString(matrizOrig[1])
        );

        System.out.println("Matriz traspuesta:" +
                "\n" + Arrays.toString(matrizTrasp[0]) +
                "\n" + Arrays.toString(matrizTrasp[1]) +
                "\n" + Arrays.toString(matrizTrasp[2])
        );
    }
}
