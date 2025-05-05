package Clase8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*
        * Crea una ArrayList de tipo String, añade 5 nombres y muéstralos
        * por pantalla.
        */
        Scanner sc = new Scanner(System.in);
        String nombre;
        ArrayList<String> nombres = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un nombre: ");
            nombre = sc.nextLine();

            nombres.add(nombre);
        }

        sc.close();
        System.out.println();

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre " + (i + 1) + " : " + nombres.get(i));
        }
    }
}
