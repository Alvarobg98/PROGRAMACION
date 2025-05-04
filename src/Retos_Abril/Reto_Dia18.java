package Retos_Abril;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Reto_Dia18 {
    public static void main(String[] args) {
        /*
        * Simula una votación simple para 3 candidatos
        * ("Coder", "Debugger", "Tester"). Pide a 5 votantes que introduzcan su
        * voto (el nombre del candidato).
        *   - Usa un bucle for para simular los 5 votantes.
        *   - Usa un diccionario (o similar) para llevar el conteo de votos para
        *     cada candidato.
        *   - Usa if/else para verificar si el voto introducido es para uno de
        *     los candidatos válidos. Si no lo es, incrementa un contador de
        *     "votos inválidos".
        *   - Introduce la posibilidad de un "error de conteo" aleatorio
        *     (simula lanzar una excepción dentro del if/else de los votos
        *     válidos).
        *   - Usa un try-catch alrededor del proceso de conteo. Si ocurre el
        *     error, muestra un mensaje de "¡Error en el conteo! ¡Se descarta
        *     este voto!".
        *   - Al final, muestra el número de votos para cada candidato y el
        *     número total de votos inválidos.
        */
        Scanner sc = new Scanner(System.in);
        String voto;
        int votoNulo = 0;

        Map<String, Integer> candidatos = new HashMap<>();
        candidatos.put("coder", 0);
        candidatos.put("debugger", 0);
        candidatos.put("tester", 0);

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce tu voto: ");
            voto = sc.nextLine().toLowerCase();

            Random rand = new Random();
            int randError = rand.nextInt(5) + 1 ;

            try {
                if (randError == 5) {
                    throw new Exception();
                }

                if (candidatos.containsKey(voto)) {
                    candidatos.put(voto, candidatos.get(voto) + 1);
                } else {
                    votoNulo++;
                }
            } catch (Exception e) {
                System.out.println("¡Error en el conteo! " +
                        "¡Se descarta este voto!");
            }
        }
        
        sc.close();
        System.out.println();

        for (String candidato : candidatos.keySet()) {
            System.out.println(candidato.toUpperCase() + ": "
                    + candidatos.get(candidato) + " votos");
        }

        System.out.println("Votos nulos: " + votoNulo);
    }
}
