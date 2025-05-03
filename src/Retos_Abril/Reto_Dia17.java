package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia17 {
    public static void main(String[] args) {
        /*
        * Pide al usuario que introduzca un poema de hasta 4 líneas. Lola la
        * Crítica intentará analizar su "métrica" según reglas muy extrañas:
        *   - Línea 1: Debe tener exactamente 5 palabras.
        *   - Línea 2: Debe contener la letra 'z' al menos una vez.
        *   - Línea 3: Debe tener más vocales que consonantes.
        *   - Línea 4: Debe terminar con la misma palabra con la que empezó la
        *     primera línea (ignorando mayúsculas/minúsculas).
        * Para llevar a cabo el programa:
        *   - Usa un bucle for para leer cada línea del poema.
        *   - Usa if/else para verificar si cada línea cumple su regla. Si no,
        *     Lola da una crítica divertida (ej., "¡Demasiadas palabras para
        *     mi gusto!", "¡Le falta un toque de 'z'!".).
        *   - Usa try-catch para manejar si el usuario introduce menos de 4
        *     líneas (simulando un poema incompleto).
        *   - Al final, da una "puntuación poética" basada en cuántas reglas
        *     cumplió el poema.
        */
        Scanner sc = new Scanner(System.in);
        String linea;

        int puntuacion = 0, nLineas = 0;
        String firstWord = "", lastWord;

        System.out.println("Introduce un poema de 4 lineas");
        for (int i = 0; i < 4; i++) {
            System.out.println("Linea " + i + ":");
            linea = sc.nextLine();

            if (!linea.isBlank()) {
                nLineas++;

                switch (i) {
                    case 0:
                        int nWords = linea.split(" ").length;
                        firstWord = linea.split(" ")[0];

                        if (nWords < 5) {
                            System.out.println("¡Pocas palabras para " +
                                    "mi gusto!");
                        } else if (nWords > 5) {
                            System.out.println("¡Demasiadas palabras para " +
                                    "mi gusto!");
                        } else {
                            puntuacion++;
                        }

                        break;
                    case 1:
                        if (linea.contains("z")) {
                            puntuacion++;
                        } else {
                            System.out.println("¡Le falta un toque de 'z'!");
                        }

                        break;
                    case 2:
                        int nVocals = 0, nVowels = 0;
                        String vocals = "aeiou";

                        for (int j = 0; j < linea.trim().length(); j++) {
                            if (vocals.indexOf(linea.trim().charAt(j)) != -1) {
                                nVocals++;
                            } else {
                                nVowels++;
                            }
                        }

                        if (nVocals > nVowels) {
                            puntuacion++;
                        } else {
                            System.out.println("Demasiadas consonantes");
                        }

                        break;
                    case 3:
                        String[] words = linea.split(" ");
                        lastWord = words[words.length - 1];

                        if (firstWord.equalsIgnoreCase(lastWord)) {
                            puntuacion++;
                        } else {
                            System.out.println("Deberia terminar con la " +
                                    "primera palabra del poema");
                        }
                        break;
                }
            }

        }

        sc.close();

        try {
            if (nLineas != 4) {
                throw new Exception();
            }

            System.out.println("\nPuntuacion poetica: " + puntuacion);
        } catch (Exception e) {
            System.out.println("No voy a puntuar un poema con" +
                    " menos de 4 lineas");
        }

    }
}
