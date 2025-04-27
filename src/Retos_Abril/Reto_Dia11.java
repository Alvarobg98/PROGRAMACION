package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia11 {
    public static void main(String[] args) {
        /*
        * El programa elige una palabra secreta (por ejemplo, "programar"). El
        * usuario tiene 5 intentos para adivinar la palabra. En cada intento,
        * el programa compara la palabra introducida por el usuario con la
        * palabra secreta.
        *   - Si son iguales, muestra un mensaje de felicitación y termina.
        *   - Si no son iguales, indica cuántos intentos le quedan.
        *   - Si se agotan los intentos sin adivinar, muestra la palabra secreta
        *     y un mensaje de "¡Game Over!".
        */
        String palabraSecreta = "programacion";
        String palabra;
        Scanner sc = new Scanner(System.in);

        for (int i = 5; i > 0; i--) {
            System.out.print("\nIntroduce una palabra: ");
            palabra = sc.nextLine();

            if (palabra.equals(palabraSecreta)) {
                System.out.println("¡Enhorabuena! Has descubierto la palabra");

                break;
            } else if (i == 1) {
                System.out.println("¡Game Over!");
            } else {
                System.out.println("Prueba de nuevo");
                System.out.println("Te quedan " + (i - 1) + " intentos");
            }
        }

    }
}
