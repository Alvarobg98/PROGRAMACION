package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia16 {
    public static void main(String[] args) {
        /*
        * Crea una calculadora muy especial que a veces está de buen humor y
        * otras no. Pide al usuario que introduzca dos números y la
        * operación (+, -, *, /).
        *   - Si la operación es división (/) y el segundo número es 0, la
        *     calculadora se pondrá de mal humor y lanzará un error
        *     (simúlalo con un try-catch que imprima un mensaje como
        *     "¡¿Dividir por cero?! ¡¿Acaso quieres destruir el universo?!").
        *   - Para las otras operaciones, realiza el cálculo normal y muestra
        *     el resultado con un mensaje alegre como:
        *     "¡Tadá! El resultado es...".
        */
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char operacion;

        System.out.print("Primer digito: ");
        num1 = sc.nextInt();

        System.out.print("Segundo digito: ");
        num2 = sc.nextInt();

        System.out.print("Operacion (+,-,*,/): ");
        operacion = sc.next().charAt(0);
        sc.close();

        try {
            switch (operacion) {
                case '+':
                    System.out.println("¡Tadá! El resultado es " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("¡Tadá! El resultado es " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("¡Tadá! El resultado es " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("¡Tadá! El resultado es " + (num1 / num2));
                    break;
                default:
                    System.out.println("Operacion ivalida");
                    break;
            }
        } catch (Exception e) {
            System.out.println("¡¿Dividir por cero?! " +
                    "¡¿Acaso quieres destruir el universo?!");
        }

    }
}
