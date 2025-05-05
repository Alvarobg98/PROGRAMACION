package Clase8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        * Pregunta al usuario un nombre, y busca si está en la lista. Si está,
        * muestra su posición.
        */
        Scanner sc = new Scanner(System.in);
        String nombre;

        ArrayList<String> nombres = new ArrayList<>();
        int pos;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un nombre: ");
            nombre = sc.nextLine();

            nombres.add(nombre);
        }

        System.out.print("\n¿Que nombre quieres buscar?: ");
        nombre = sc.nextLine();

        pos = nombres.indexOf(nombre);
        if (pos != -1) {
            System.out.println("Posicion: " + pos);
        } else {
            System.out.println("No se encuentra en la lista");
        }

        sc.close();
    }
}
