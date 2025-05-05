package Clase7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        * Usa try-catch para evitar error si se ingresa una posición incorrecta
        * (como 5 o -1).
        */
        String[] frutas = {"Manzana", "Banana", "Naranja"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 2: ");

        try {
            int posicion = sc.nextInt();

            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: el numero introducido no esta " +
                    "entre 0 y 2");
        }

        sc.close();

    }
}
