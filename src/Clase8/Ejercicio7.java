package Clase8;

import java.util.Arrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
        * Dado un array con posibles números repetidos, crea un nuevo array que
        * contenga los mismos elementos sin duplicados.
        */
        int[] numeros = {5, 5, 73, 34, 19, 34, 81, 7, 32, 19};
        int[] numerosAux = new int[numeros.length];
        int tam = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;

            for (int numAux : numerosAux) {
                if (numeros[i] == numAux) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                numerosAux[tam] = numeros[i];
                tam++;
            }
        }

        int[] numSinRepetir = new int[tam];
        for (int i = 0; i < tam; i++) {
            numSinRepetir[i] = numerosAux[i];
        }

        System.out.println(Arrays.toString(numSinRepetir));
    }
}
