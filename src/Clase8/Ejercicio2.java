package Clase8;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        * Suma todos los valores de un array de enteros y muestra el total.
        */
        int total = 0;
        int[] valores = {1, 2, 3, 4, 5};

        for (int valor : valores) {
            total += valor;
        }

        System.out.println("Total: " + total);
    }
}
