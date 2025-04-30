package Retos_Abril;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Reto_Dia14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        String pregunta1 = "¿Que es un 'int'?:Un valor de tipo entero";
        String pregunta2 = "¿Que es un 'float'?:Un valor de tipo decimal";
        String pregunta3 = "¿Que es un 'string'?:Una cadena de caracteres";

        ArrayList<String> flashcards = new ArrayList<>();
        flashcards.add(pregunta1);
        flashcards.add(pregunta2);
        flashcards.add(pregunta3);

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Pregunta aleatoria");
            System.out.println("2. Añadir flashcard");
            System.out.println("3. Finalizar programa");

            System.out.print("Elige una opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    Random rand = new Random();
                    int randPos = rand.nextInt(flashcards.size());

                    String flashcard = flashcards.get(randPos);
                    String pregunta = flashcard.split(":")[0];
                    String respuesta = flashcard.split(":")[1];

                    System.out.println(pregunta);
                    System.out.print("Respuesta: ");
                    opcion = sc.nextLine();

                    if (respuesta.trim().equalsIgnoreCase(opcion)) {
                        System.out.println("Respuesta correcta\n");
                    } else {
                        System.out.println("Respuesta incorrecta, " +
                                "la respuesta correcta es: ");
                        System.out.println("\t- " + respuesta + "\n");
                    }

                    break;
                case "2":
                    System.out.print("Introduce 'Pregunta:Respuesta': ");

                    opcion = sc.nextLine();
                    flashcards.add(opcion);

                    System.out.println("Flashcard creada\n");

                    break;
                case "3":
                    continuar = false;
                    break;
            }
        }

        sc.close();
    }
}
