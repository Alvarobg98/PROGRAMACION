package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia9 {
    public static void main(String[] args) {
        /*
        * Los alumnos de Prometeo que cursan DAM/DAW + Master andan muy liados
        * y no tienen claro cuando tienen clase y cuando no. Haz un programa
        * que les indique si tienen clase de FP, de Máster, o de las dos en
        * un conjunto de fechas dado. El usuario introduce un número N, que
        * indica el número de días que quiere ver, se deberá imprimir el número
        * del día, si no tienen nada en esa fecha, FP si tiene clase de un
        * módulo de DAM/DAW o Máster si ese día tiene clase de máster.
        *   - Los días múltiplos de 3 tienen clase de FP.
        *   - Los días múltiplos de 5, de máster.
        *   - Los días que son múltiplos de 3 y 5 tienen clase de las dos.
        */
        Scanner sc = new Scanner(System.in);
        int numDias;

        System.out.print("¿Cuantos dias quieres ver?: ");
        numDias = sc.nextInt();

        for (int i = 1; i <= numDias; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FP + Master");
            } else if (i % 3 == 0) {
                System.out.println("FP");
            } else if (i % 5 == 0) {
                System.out.println("Master");
            } else {
                System.out.println(i);
            }
        }
    }
}
