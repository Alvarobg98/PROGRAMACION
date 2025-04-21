package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia1 {
    public static void main(String[] args) {
        /*
        * En Grado Superior las notas se tienen que poner como un número entero,
        * así que un día podrás ser el profe de entornos y podrás disfrutar del
        * placer de poner un 7 a un estudiante con un 7,49 en el examen.
        * Desarrolla un algoritmo que, dado un número decimal, devuelve su
        * resultado entero redondeado siguiendo estas normas:
        *   Todos los números decimales por debajo de ,5 se redondean a la baja.
        *   Los que tengan decimales desde ,5 a superior, se redondean al alza.
        * Ejemplo:
        *   Si el usuario introduce 4,49, el programa debe devolver un 4
        *   Si el usuario introduce 9,5 el programa debe devolver un 10
        */
        System.out.print("Introduce tu nota: ");

        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();

        System.out.println("Tu nota redondeada es: " + Math.round(nota));
    }
}
