package Clase8;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
        * Crea un programa que invierta los elementos de un array. Por ejemplo,
        * si el array es {1, 2, 3, 4, 5}, el resultado debe ser {5, 4, 3, 2, 1}.
        */
        int[] valores = {1, 2, 3, 4, 5};
        int[] valoresAux = new int[valores.length];

        for (int i = valores.length - 1; i >= 0; i--) {
            valoresAux[valores.length - 1 - i] = valores[i];
        }

        valores = valoresAux;
        System.out.println(Arrays.toString(valores));
    }
}
