package Clase8;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
        * Dado un array de enteros, conviértelo a una ArrayList<Integer> y
        * muestra su contenido.
        */
        int[] numeros = {1, 2, 3, 4, 5};
        ArrayList<Integer> listaNum = new ArrayList<>();

        for (int numero : numeros) {
            listaNum.add(numero);
        }

        System.out.println(listaNum);
    }
}
