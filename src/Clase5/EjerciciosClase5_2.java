package Clase5;

import java.util.Scanner;

public class EjerciciosClase5_2 {
    public static void main(String[] args) {
        // Ejercicio 1: Clasificación de edad
        // Pide al usuario su edad e imprime si es menor de edad,
        // adulto o adulto mayor.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su edad:");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Es menor de edad");
        } else if (edad < 30) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es un adulto mayor");
        }
        System.out.println("-------------------------------------------------");

        // Ejercicio 2: Contador de vocales
        // Pide al usuario una palabra y cuenta cuántas vocales tiene.
        System.out.println("Introduce una palabra:");
        String palabra = sc.nextLine();

        int contador = 0;
        String vocales = "aeiou";

        for (int i = 0; i < palabra.length(); i++) {
            if (vocales.indexOf(palabra.charAt(i)) != -1) {
                contador++;
            }
        }

        System.out.println("Nº de vocales en '" + palabra + "': " + contador);
        System.out.println("-------------------------------------------------");

        // Ejercicio 3: Simulación de una calculadora
        // Crea un menú que permita sumar, restar, multiplicar y dividir dos
        // números ingresados por el usuario.
        System.out.println("Primer numero:");
        int num1 = sc.nextInt();

        System.out.println("Segundo numero:");
        int num2 = sc.nextInt();

        System.out.println("Opcion (+, -, *, /)");
        char opcion = sc.next().charAt(0);

        switch (opcion) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                double div = (double) num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + div);
                break;
            default:
                System.out.println("Opcion invalida!");
                break;
        }
        System.out.println("-------------------------------------------------");

        // Ejercicio 4: Números pares hasta N
        // Pide un número al usuario y muestra todos los números pares
        // desde 1 hasta ese número.
        System.out.println("Introduce un numero:");
        int numero = sc.nextInt();

        System.out.println("Numeros pares hasta " + numero + ":");
        for (int i = 2; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("-------------------------------------------------");

        // Ejercicio 5: Contraseña con intentos limitados
        // Pide al usuario una contraseña. Solo tiene 3 intentos
        // antes de bloquearse.
        String passwd;

        for (int i = 3; i > 0; i--) {
            System.out.println("Intentos restantes: " + i);
            System.out.println("Contraseña: ");
            passwd = sc.nextLine();

            if (passwd.equals("java123")) {
                System.out.println("Contraseña correcta");
                break;
            }

            System.out.println("Contraseña incorrecta");
        }
        System.out.println("-------------------------------------------------");

        // Ejercicio 6: Adivina el número
        // Genera un número aleatorio entre 1 y 100 y deja que el usuario
        // lo adivine con pistas.
        int rand = (int)Math.floor(Math.random()*100+1);

        System.out.println("¿En que numero del 1 al 100 estoy pensando?");
        int valor;

        do {
            valor = sc.nextInt();

            if (valor == rand) {
                System.out.println("¡Enhorabuena! El numero es: " + rand);
            } else if (rand < valor) {
                System.out.println("Incorrecto, prueba de nuevo");
                System.out.println("Pista: el numero es menor que " + valor);
            } else {
                System.out.println("Incorrecto, prueba de nuevo");
                System.out.println("Pista: el numero es mayor que " + valor);
            }
        } while (valor != rand);
        System.out.println("-------------------------------------------------");

        // Ejercicio 7: Serie Fibonacci
        // Pide un número n y muestra los primeros n términos de la serie
        // de Fibonacci.
        int a = 0;
        int b = 1;
        int c;

        System.out.println("Introduce un numero:");
        int n = sc.nextInt();

        System.out.println("Los " + n + " primeros numeros de la sucesion son:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
