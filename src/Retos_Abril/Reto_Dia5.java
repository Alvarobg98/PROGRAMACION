package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia5 {
    public static void main(String[] args) {
        /*
        * Jordi nunca se acuerda de abrir las exclamaciones. Él dice que es
        * porque en catalán no se abren las exclamaciones, pero yo creo que
        * simplemente no sabe escribir. Vamos a crear un programa que asegure
        * que hay tanto abrir exclamación (¡) como cerrar exclamación (!) para
        * flamearlo.
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto con exclamaciones al principio" +
                " y al final: ");
        String entrada = sc.next();

        boolean condicion = entrada.startsWith("¡") && entrada.endsWith("!");
        if (condicion) {
            int contExcIni = 0;
            int contExcFin = 0;

            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '¡') {
                    contExcIni++;
                } else {
                    break;
                }
            }

            for (int j = entrada.length(); j > 0; j--) {
                if (entrada.charAt(j-1) == '!') {
                    contExcFin++;
                } else {
                    break;
                }
            }

            if (contExcIni == contExcFin) {
                System.out.println("El numero de exclamaciones de apertura " +
                        "y de cierre coincide");
            } else {
                System.out.println("El numero de exclamaciones de apertura " +
                        "y de cierre no coincide");
            }
        } else {
            System.out.println("Falta al menos una exclamacion de apertura" +
                    " o de cierre");
        }
    }
}
