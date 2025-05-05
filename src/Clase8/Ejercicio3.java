package Clase8;

public class Ejercicio3 {
    public static void main(String[] args) {
        /* Dado un array de enteros, muestra el valor más alto y el más bajo. */
        int[] valores = {9, 5, 2, 7, 10};
        int min = valores[0], max = valores[0];

        for ( int valor : valores) {
            if (valor < min) {
                min = valor;
            }

            if (valor > max) {
                max = valor;
            }
        }

        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
    }
}
