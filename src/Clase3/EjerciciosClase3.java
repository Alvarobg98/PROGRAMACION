package Clase3;

import java.util.Scanner;

public class EjerciciosClase3 {
    public static void main(String[] args) {
        // EJERCICIO 1
        final double GRAVEDAD = 9.81;
        System.out.println("Gravedad: " + GRAVEDAD);
        System.out.println("----------------------");

        // EJERCICIO 2
        int a = 25;
        int b = 7;

        int suma = a + b;
        int resta = a - b;
        int mult = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Modulo: " + mod);
        System.out.println("----------------------");

        // EJERCICIO 3
        int edad = 15;
        System.out.println("Edad: " + edad);
        System.out.println("¿Es mayor de edad?: " + (edad >= 18));
        System.out.println("----------------------");

        // EJERCICIO 4
        System.out.println("¿Es 25 mayor que 7?: " + (a > b));
        System.out.println("¿Es 7 menor que 25?: " + (b < a));
        System.out.println("¿Son iguales?: " + (a == b));
        System.out.println("----------------------");

        // EJERCICIO 5
        /* Como (5 > 3) = V y (10 < 20) = V el resultado de la expresion es V, ya que ambas proposiciones son V
        * y estamos usando la expresion logica AND */
        Boolean expresion = (5 > 3) && (10 < 20);
        System.out.println("(5 > 3) && (10 < 20): " + expresion);
        System.out.println("----------------------");

        // EJERCICIO 6
        /* Como (5 > 3) = V y (10 > 20) = F el resultado de la expresion logica es V, ya que estamos usando
        * la expresion logica OR y con que una de las proposiciones sea V el resultado es tambien V */
        expresion = (5 > 3) || (10 > 20);
        System.out.println("(5 > 3) || (10 > 20): " + expresion);
        System.out.println("----------------------");

        // EJERCICIO 7
        int x = 10;
        int y = 20;
        int z = 30;

        Boolean mayor = (x + y) > z;
        Boolean menor = (x + y) < z;
        Boolean diferente = (x + y) != z;
        Boolean igual = (x + y) == z;

        System.out.println("¿Es x+y mayor que z?: " + mayor);
        System.out.println("¿Es x+y menor que z?: " + menor);
        System.out.println("¿Es x+y diferente de z?: " + diferente);
        System.out.println("¿Es x+y igual que z?: " + igual);
        System.out.println("----------------------");

        // EJERCICIO 8
        int num1, num2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un numero entero: ");
        num1 = entrada.nextInt();

        System.out.println("Introduzca otro numero entero: ");
        num2 = entrada.nextInt();

        Boolean multiplos = (num1 % num2) == 0;
        System.out.println("¿Son " + num1 + " y " + num2 + " multiplos?: " + multiplos);
        System.out.println("----------------------");

        // EJERCICIO 9
        Boolean par = (num1 % 2) == 0;

        System.out.println("¿Es " + num1 + " par?: " + par);
        System.out.println("----------------------");

        // EJERCICIO 10
        final float TASA_CAMBIO = 1.12f;
        int dolares;
        float cambioDivisa;

        System.out.println("Ingresa una cantidad de dolares: ");
        dolares = entrada.nextInt();

        cambioDivisa = dolares * TASA_CAMBIO;
        System.out.println(dolares + "$ equivale a " +  cambioDivisa + "€");
    }
}
