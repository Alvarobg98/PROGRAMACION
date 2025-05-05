package Clase8;

import java.util.ArrayList;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
        * Crea una lista de tareas (ArrayList<String>), añade elementos y
        * elimina uno por su nombre.
        */
        ArrayList<String> tareas = new ArrayList<>();

        String tarea1 = "limpiar";
        String tarea2 = "barrer";
        String tarea3 = "fregar";
        String tarea4 = "cocinar";

        tareas.add(tarea1);
        tareas.add(tarea2);
        tareas.add(tarea3);
        tareas.add(tarea4);

        System.out.println("Lista de tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println("\t - " + tareas.get(i));
        }

        tareas.remove("barrer");

        System.out.println("\nLista de tareas actualizada:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println("\t - " + tareas.get(i));
        }
    }
}
