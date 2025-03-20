package Reto1;

import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        // EJERCICIO 1
        System.out.println("Introduzca su nota: ");
        Scanner sc = new Scanner((System.in));

        int nota = sc.nextInt();
        if ((nota < 0) || (nota > 10)) {
            System.out.println("Error: La nota debe ser entre 0 y 10");
        } else {
            switch (nota) {
                case 5:
                    System.out.println("Calificacion: Aprobaado");
                    break;
                case 6:
                    System.out.println("Calificacion: Bien");
                    break;
                case 7:
                    System.out.println("Calificacion: Notable");
                    break;
                case 8:
                    System.out.println("Calificacion: Notable");
                    break;
                case 9:
                    System.out.println("Calificacion: Sobresaliente");
                    break;
                case 10:
                    System.out.println("Calificacion: Matricula de honor");
                    break;
                default:
                    System.out.println("Calificacion: Suspenso");
                    break;
            }
        }

        System.out.println("---------------------------------------------\n");

        // EJERCICIO 2
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        // Como no existe nextChar() de la siguiente forma 
        // tomamos solo el primer caracter introducido
        System.out.println("Introduce una letra:");
        char letra = sc.next().charAt(0);

        Boolean vocal = false;
        for (char c : vocales) {
            if (letra == c) {
                vocal = true;

                break;
            }
        }

        if (vocal) {
            System.out.println("La letra '" + letra + "' es una vocal");
        } else {
            System.out.println("La letra '" + letra + "' no es una vocal");
        }

        System.out.println("---------------------------------------------\n");

        // EJERCICIO 3
        int x, y, z;

        System.out.println("Introduce el primer numero:");
        x = sc.nextInt();

        System.out.println("Introduce el segundo numero:");
        y = sc.nextInt();

        System.out.println("Introduce el tercer numero:");
        z = sc.nextInt();

        if ((x > y) && (x > z)) {
            System.out.println("El mayor es: " + x);
        } else if ((y > x) && (y > z)) {
            System.out.println("El mayor es: " + y);
        } else {
            System.out.println("El mayor es: " + z);
        }

        System.out.println("---------------------------------------------\n");

        // EJERCICIO 4
        int num1, num2;
        char operacion;

        System.out.println("Introduzca el primer valor: ");
        num1 = sc.nextInt();

        System.out.println("Introduzca el segundo valor: ");
        num2 = sc.nextInt();

        System.out.println("Operacion (pulse +,-,/ o *): ");
        operacion = sc.next().charAt(0);

        switch (operacion) {
            case '+':
                int suma = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + suma);
                break;
            case '-':
            int resta = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resta);
                break;
            case '*':
                int mult = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + mult);
                break;
            case '/':
                double div = (double)num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + div);
                break;
            default:
                System.out.println("Caracter no reconocido");
                break;
        }

        System.out.println("---------------------------------------------\n");

        // EJERCICIO 5
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        System.out.println("Tabla de multiplicar de " + numero + ":");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }

        System.out.println("---------------------------------------------\n");

        // EJERCICIO 6
        System.out.println("Introduce el primer numero:");
        int valor1 = sc.nextInt();

        System.out.println("Introduce el segundo numero:");
        int valor2 = sc.nextInt();

        // Solo se muestran los impares entre valor1 y valor2
        // En caso de que alguno de los dos valores introducidos sea impar
        // no se tiene en cuenta
        System.out.println("Impares entre " + valor1 + " y " + valor2 + ":");
        for (int i = (valor2 - 1); i > valor1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("---------------------------------------------\n");

        // Ejercicio 7
        System.out.println("Introduce el total de la caja registradora:");
        int totalCaja = sc.nextInt();

        System.out.println("Introduce el valor de la compra:");
        int valorCompra = sc.nextInt();

        int[] billetes = {1, 2, 5, 10, 20, 50, 100};
        int cambio = totalCaja - valorCompra;
        int vuelta;

        System.out.println("Cambio:");
        for (int i = (billetes.length - 1); i >= 0; i--) {
            vuelta = cambio / billetes[i];

            if (billetes[i] > 2) {
                System.out.println("Billetes de " + billetes[i] + " E: " + vuelta);
            } else {
                System.out.println("Monedas de " + billetes[i] + " E: " + vuelta);
            }

            cambio %= billetes[i];
        }

    }
}
