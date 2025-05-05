package Clase8;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        * Crea una ArrayList con elementos repetidos
        * (por ejemplo: [1, 2, 2, 3, 4, 4, 5]). Elimina los duplicados y muestra
        * la lista final sin repetir.
        */
        Random rand = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numAux = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(5) + 1;
            numeros.add(num);
        }

        System.out.println("Lista sin limpiar: " + numeros);

        for (int i = 0; i < numeros.size(); i++) {
            boolean repetido = false;

            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(j).equals(numeros.get(i))) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                numAux.add(numeros.get(i));
            }
        }

        numeros.clear();
        numeros.addAll(numAux);
        System.out.println("Lista limpiada: " + numeros);
    }
}
