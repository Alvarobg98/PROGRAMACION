package Clase7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        * Añade un bloque try-catch para evitar que el programa se rompa si el
        * usuario escribe letras.
        */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Escribe un número (en texto): ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println("Número x 10: " + (numero * 10));
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor introducido no es un numero");
        }

        sc.close();

    }
}
