package Clase10;

import java.util.Scanner;

public class EjerciciosClase10 {
    /*
     * 1. Crea una función llamada doble que reciba un número entero y devuelva
     * su doble.
     */
    public static int doble(int num) {
        return num * 2;
    }

    /*
     * 2. Crea una función esPar(int n) que devuelva true si el número es par y
     * false en caso contrario.
     */
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    /*
     * 3. Escribe una función saludar(String nombre, int edad) que imprima
     * "Hola, [nombre], que bien llevas tus [edad] años".
     */
    public static void saludar(String nombre, int edad) {
        System.out.println("Hola, " + nombre + ", que bien llevas tus " +
                edad + " años");
    }

    /*
     * 4. Convierte este código en un programa que use mínimo dos funciones:
     * una para cargar datos, y otra para imprimirlos.
     */
    public static void cargarDatos() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();

        imprimirDatos(nombre, edad);
    }

    public static void imprimirDatos(String nombre, int edad) {
        System.out.println("Hola, " + nombre + ", tienes " + edad + " años");
    }

    /*
     * 5. Crea una función que reciba un array de enteros y devuelva la suma
     * de sus elementos.
     */
    public static int suma(int[] listaEnteros) {
        int suma = 0;

        for(int num : listaEnteros) {
            suma += num;
        }

        return suma;
    }

    /*
     * 6. Este código calcula el área de un rectángulo. Divídelo en dos
     * funciones: una para leer datos y otra para calcular el área.
     */
    public static void leerDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce base: ");
        double base = sc.nextDouble();

        System.out.print("Introduce altura: ");
        double altura = sc.nextDouble();

        calcularArea(base, altura);
    }

    public static void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("El área es: " + area);
    }

    /*
     * 7. Crea una función media(double a, double b, double c) que devuelva el
     * promedio de los tres valores.
     */
    public static double media(double a, double b, double c) {
        double promedio;
        promedio = (a + b + c) / 3;

        return promedio;
    }

    /*
     * 8. Función que reciba dos enteros y devuelva el mayor
     */
    public static int mayor(int a, int b) {
        if (a > b) return a;

        return b;
    }

    /*
     * 9. Este programa imprime una tabla de multiplicar. Crea una función
     * tablaMultiplicar(int n) que reciba un número y muestre su tabla.
     */
    public static void tablaMultiplicar(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    /*
     * 10. Crea una función celsiusAFahrenheit(double celsius) que devuelva el
     * equivalente en grados Fahrenheit.
     */
    public static double celsiusAFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = (celsius * 9/5) + 32;

        return fahrenheit;
    }

    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println("Doble de 4: " + doble(4));
        System.out.println("-----------------------------------------------\n");

        // Ejercicio 2
        System.out.println("¿Es 5 par?: " + esPar(5));
        System.out.println("-----------------------------------------------\n");

        // Ejercicio 3
        saludar("alvaro", 27);
        System.out.println("-----------------------------------------------\n");

        // Ejercicio 4
        cargarDatos();
        System.out.println("-----------------------------------------------\n");

        // Ejercicio 5
        int[] lista = {1, 2, 3, 4, 5};
        System.out.println("Suma de la lista: " + suma(lista));
        System.out.println("-----------------------------------------------\n");

        // Ejercicio 6
        leerDatos();
        System.out.println("-----------------------------------------------\n");

        // Ejercicio 7
        System.out.println("Promedio: " + media(5, 6, 7));
        System.out.println("-----------------------------------------------\n");

        // Ejercicio 8
        System.out.println("Mayor: " + mayor(5, 7));
        System.out.println("-----------------------------------------------\n");

        // Ejercicio 9
        tablaMultiplicar(5);
        System.out.println("-----------------------------------------------\n");

        // Ejercicio 10
        System.out.println("Celsius a Fahrenheit: " + celsiusAFahrenheit(35));

    }
}
