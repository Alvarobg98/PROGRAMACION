package Clase9.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * Crea un ArrayList<ArrayList<String>> que contenga información
         * sobre 3 estudiantes: nombre, apellido y edad.
         * Imprime la información de todos los estudiantes.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce un estudiante: ");

            System.out.print("\tNombre: ");
            String nombre = sc.next();
            System.out.print("\tApellido: ");
            String apellido = sc.next();
            System.out.print("\tEdad: ");
            String edad = sc.next();
            String estudiante = nombre + " " + apellido + " " + edad;

            estudiantes.add(estudiante);
        }

        sc.close();

        for (String persona : estudiantes) {
            System.out.println(persona);
        }
    }
}
