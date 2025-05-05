package Clase7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        * Añade try-catch-finally para evitar que el programa falle si el
        * divisor es cero o si se introduce texto
        */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el dividendo: ");
            int a = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;

            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: introduce solo numeros");
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por 0");
        } finally {
            sc.close();
        }

    }
}
