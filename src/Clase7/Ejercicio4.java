package Clase7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        * Añade manejo de NumberFormatException y un finally que diga:
        * "Juego finalizado."
        */
        Random random = new Random();
        int secreto = random.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Adivina el número (1-10): ");

        try {
            String intentoTexto = sc.nextLine();

            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor introducido no es un numero");
        } finally {
            System.out.println("Juego finalizado");
        }

        sc.close();

    }
}
