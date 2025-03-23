package Clase2;

public class EjericiosClase2 {
    public static void main(String[] args) {
        // 📌 EJERCICIO 1:
        // Crea una variable de cada tipo entero y asígnale valores distintos.
        // Luego imprímelas con System.out.println().
        byte numByte = 100;
        short numShort = 30000;
        int numInt = 50000;
        long numLong = 1000000000L;

        System.out.println(numByte);
        System.out.println(numShort);
        System.out.println(numInt);
        System.out.println(numLong);
        System.out.println("-------------------------------------------------");

        // 📌 EJERCICIO 2:
        // Declara una variable de tipo float y otra de tipo double con valores distintos.
        // Imprímelas en la consola.
        double numDouble = 10;
        float numFloat = 2.5f;

        System.out.println(numDouble);
        System.out.println(numFloat);
        System.out.println("-------------------------------------------------");

        // 📌 EJERCICIO 3:
        // Declara una variable boolean y asígnale un valor falso.
        // Luego usa un `if` para imprimir un mensaje si es true o false.
        boolean valor = false;

        if (!valor) {
            System.out.println("Es falso");
        }
        System.out.println("-------------------------------------------------");

        // 📌 EJERCICIO 4:
        // Declara una variable de tipo char con tu inicial y otra
        // con un símbolo especial.
        // Imprímelas en la consola.
        char inicial = 'A';
        char simbolo = '*';

        System.out.println(inicial);
        System.out.println(simbolo);
        System.out.println("-------------------------------------------------");

        // 📌 EJERCICIO 5:
        // Declara una variable String con tu nombre y otra con tu
        // lenguaje favorito.
        // Concátalas en un mensaje y muestra el resultado.
        String nombre = "Alvaro";
        String leng = "Python";

        System.out.println(nombre + leng);
        System.out.println("-------------------------------------------------");

        // 📌 EJERCICIO 6:
        // Declara un array de 5 nombres y muéstralos en la consola usando un bucle.
        String[] nombres = {"Alvaro", "Elena", "Juan", "Alicia", "Jose"};

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("-------------------------------------------------");

        // 📌 EJERCICIO 7:
        // Usa literales para imprimir en consola:
        // Un número entero, un decimal, un booleano y una cadena de texto.
        System.out.println("Entero: " + 10);
        System.out.println("Decimal: " + 2.5);
        System.out.println("Booleano: " + true);
        System.out.println("Cadena: " + "Esto es una cadena");
    }
}
