package Clase8;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        * Pide al usuario un número y muestra si está presente en un array, y en
        * qué posición.
        */
        int[] valores = {1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);
        int num, pos = -1;

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        for (int i = 0; i < valores.length; i++) {
            if (num == valores[i]) {
                pos = i;
            }
        }

        if (pos != -1) {
            System.out.println("Posicion: " + pos);
        } else {
            System.out.println("Valor no encontrado");
        }

    }
}
