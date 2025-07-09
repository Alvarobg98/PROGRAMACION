package Clase9.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * Crea un ArrayList<ArrayList<String>> y agrega 3 listas internas.
         * Cada lista interna debe contener un nombre y dos apellidos de
         * un estudiante.
         * Imprime la lista de listas.
         */

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> personas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ArrayList<String> persona = new ArrayList<>();

            System.out.print("Nombre: ");
            String nombre = sc.next();
            persona.add(nombre);

            System.out.print("Primer apellido: ");
            String apellido = sc.next();
            persona.add(apellido);

            System.out.print("Segundo apellido: ");
            apellido = sc.next();
            persona.add(apellido);

            System.out.println();
            personas.add(persona);
        }

        sc.close();

        for (ArrayList<String> persona : personas) {
            for (String dato : persona) {
                System.out.print(dato + " ");
            }

            System.out.println();
        }
    }
}
