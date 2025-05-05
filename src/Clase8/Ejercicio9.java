package Clase8;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
        * Pide al usuario que introduzca dos arrays de enteros del mismo tamaño
        * y muestra cuántos elementos coinciden en la misma posición.
        */
        Scanner sc = new Scanner(System.in);
        int tam, coincidencias = 0;

        System.out.print("Introduce un tamaño para los vectores: ");
        tam = sc.nextInt();

        int[] array1 = new int[tam];
        int[] array2 = new int[tam];

        System.out.println("Introduce los enteros del primer vector");
        for (int i = 0; i < tam; i++) {
            System.out.print((i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        System.out.println("\nIntroduce los enteros del segundo vector");
        for (int i = 0; i < tam; i++) {
            System.out.print((i + 1) + ": ");
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                coincidencias++;
            }
        }

        System.out.println("\nCoincidencias: " + coincidencias);
    }
}
