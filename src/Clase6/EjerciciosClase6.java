package Clase6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosClase6 {
    public static void main(String[] args) {
        // Ejercicio 1 – Salir de un bucle while con break

        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.println("Introduce un numero:");
            numero = sc.nextInt();

            if (numero == 0) {
                break;
            }
        }

        // Ejercicio 2 – Saltarse los múltiplos de 3 con continue
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

        // Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
        for (int i = 1; i <= 20; i++) {
            if (i == 7) {
                break;
            }

            System.out.print(i + " ");
        }

        // Ejercicio 4 – Evitar mostrar letras vocales con continue
        String vocales = "AEIOU";
        String palabra = "PROGRAMACION";

        for (int i = 0; i < palabra.length(); i++) {
            if (vocales.indexOf(palabra.charAt(i)) != -1) {
                continue;
            }

            System.out.print(palabra.charAt(i));
        }

        // Ejercicio 5 – Dividir dos números con try-catch
        System.out.println("Introduce el dividendo:");
        int dividendo = sc.nextInt();

        System.out.println("Introduce el divisor:");
        int divisor = sc.nextInt();

        try {
            int div = dividendo / divisor;

            System.out.println("Resultado: " + div);
        } catch (ArithmeticException e) {
            System.out.println("[ArithmeticException]: division entre 0");
        }

        // Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción
        System.out.println("Introduce una cadena:");
        String cadena = sc.next();

        System.out.println("Posicion:");
        int pos = sc.nextInt();

        try {
            System.out.println(cadena.charAt(pos));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("[StringIndexOutOfBoundsException]: " +
                    "posicion fuera de rango");
        }

        // Ejercicio 7 – Mensaje de fin con finally
        System.out.println("Introduce el dividendo:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el divisor:");
        int num2 = sc.nextInt();

        try {
            int div = num1 / num2;

            System.out.println("Resultado: " + div);
        } catch (ArithmeticException e) {
            System.out.println("[ArithmeticException]: division entre 0");
        } finally {
            System.out.println("Operacion terminada");
        }

        // Ejercicio 8 – Leer números y sumar los positivos,
        // ignorando los negativos con continue
        int num;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();

            if (num < 0) {
                continue;
            }

            sum += num;
        }

        System.out.println("Suma: " + sum);

        // Ejercicio 9 – Detectar si se ha introducido texto en lugar de número (try-catch)
        try {
            System.out.print("Introduce un numero: ");
            int valor = sc.nextInt();

            System.out.println(valor);
        } catch (InputMismatchException e) {
            System.out.println("[InputMismatchException]: no es un numero");
        }

        // Ejercicio 10 – Salir de un bucle do-while cuando se adivina un número secreto
        int randNum = (int) (Math.random() * 10 + 1);
        int numUsuario;
        boolean encontrado = false;

        do {
            System.out.print("Introduce un numero: ");
            numUsuario = sc.nextInt();

            if (numUsuario == randNum) {
                encontrado = true;

                System.out.println("¡Enhorabuena, has acertado!" +
                        " El numero es " + randNum);
            } else if (numUsuario > randNum) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("El numero es mayor");
            }
        } while (!encontrado);
    }
}
