package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia12 {
    public static void main(String[] args) {
        /*
        * Pide al usuario que introduzca varios números enteros (uno por uno,
        * y que indique "fin" para terminar). El programa debe verificar si
        * cada número introducido es un "número de la suerte".
        *   - Se considera un número de la suerte si es múltiplo de 7 (el
        *     resto de la división entre 7 es 0).
        *   - Por cada número de la suerte encontrado, el programa imprimirá
        *     "¡[número] es un número de la suerte!".
        *   - Al final, mostrará cuántos números de la suerte se
        *     encontraron en total.
        */
        String entrada = "";
        Scanner sc = new Scanner(System.in);

        int contador = 0;

        try {
            while (!entrada.trim().equalsIgnoreCase("fin")) {
                System.out.print("Introduce un numero de la suerte: ");
                entrada = sc.nextLine();

                if (entrada.trim().equalsIgnoreCase("fin")) {
                    break;
                }

                if (Integer.parseInt(entrada) % 7 == 0) {
                    System.out.println("¡" + entrada +
                            " es un numero de la suerte!");
                    contador++;
                }
            }

            System.out.println("Numeros de la suerte encontrados: " + contador);
        } catch (NumberFormatException e) {
            System.out.println("Error: Introduce un numero entero o 'fin'");
        }
    }
}
