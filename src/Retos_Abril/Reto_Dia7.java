package Retos_Abril;

import java.util.Random;

public class Reto_Dia7 {
    public static void main(String[] args) {
        /*
        * Imagina una emocionante carrera entre caracoles cibernéticos. Cada
        * caracol tiene una velocidad aleatoria entre 1 y 5 (¡qué emoción!).
        *   - Escribe un programa que simule una carrera de 20 "pasos" entre
        *     dos caracoles.
        *   - En cada paso, la posición de cada caracol aumenta según
        *     su velocidad.
        *   - Al final, ¡declara al caracol ganador (o si hay un
        *     emocionante empate)!
        */
        Random r = new Random();

        int velCaracol1 = r.nextInt(5) + 1;
        int velCaracol2 = r.nextInt(5) + 1;

        int posCaracol1 = 0;
        int posCaracol2 = 0;

        while (posCaracol1 < 20 || posCaracol2 < 20) {
            posCaracol1 += velCaracol1;
            posCaracol2 += velCaracol2;
        }

        if (posCaracol1 == posCaracol2) {
            System.out.println("¡Empate!");
        } else if (posCaracol1 > posCaracol2) {
            System.out.println("¡Caracol 1 es el ganador!");
        } else {
            System.out.println("¡Caracol 2 es el ganador!");
        }
    }
}
