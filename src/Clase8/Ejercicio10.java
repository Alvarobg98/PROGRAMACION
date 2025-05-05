package Clase8;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        * Dado un array de enteros, muestra cuántas veces se repite cada valor.
        */
        int[] numeros = {1, 17, 1, 24, 24, 37, 18, 24, 59, 17};
        int[] aux = new int[numeros.length];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;

            for (int numAux : aux) {
                if (numAux == numeros[i]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                aux[i] = numeros[i];

                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[i] == numeros[j]) {
                        contador++;
                    }
                }

                System.out.println(numeros[i] + " aparece " + contador + " veces");
                contador = 0;
            }
        }
    }
}
