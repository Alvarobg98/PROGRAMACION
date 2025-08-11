package Clase9.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         * Crea un HashMap<String, Integer> que asocie los nombres de
         * estudiantes con sus notas. Añade al menos 5 estudiantes y muestra
         * sus nombres y notas.
         */

        HashMap<String, Integer> estudiantes = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Estudiante: ");
            String nombreEst = sc.next();

            System.out.print("Nota: ");
            int nota = sc.nextInt();

            estudiantes.put(nombreEst, nota);
        }

        sc.close();

        for(Map.Entry<String, Integer> estudiante : estudiantes.entrySet()) {
            System.out.println(estudiante.getKey() + ": "
                    + estudiante.getValue());
        }
    }
}
