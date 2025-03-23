package Clase5;

import java.util.Scanner;

public class EjerciciosClase5_1 {
    public static void main(String[] args) {
        // Ejercicio 1: Uso de if para verificar números positivos y negativos
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un numero:");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Es positivo");
        } else if (numero < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es igual a 0");
        }
        System.out.println("-------------------------------------------------");

        // Ejercicio 2: Uso de switch para menú de opciones
        System.out.println("Pulsa una opcion (+, -, *, /):");
        char opcion = sc.next().charAt(0);

        switch (opcion) {
            case '+':
                System.out.println("Suma: 5 + 2 = " + (5 + 2));
                break;
            case '-':
                System.out.println("Resta: 5 - 2 = " + (5 - 2));
                break;
            case '*':
                System.out.println("Multiplicacion: 5 * 2 = " + (5 * 2));
                break;
            case '/':
                double div = (double) 5 / 2;
                System.out.println("Division: 5 / 2 = " + div);
                break;
            default:
                System.out.println("Operacion invalida");
        }
        System.out.println("-------------------------------------------------");

        // Ejercicio 3: Uso de for para mostrar los primeros 10 números
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------");

        // Ejercicio 4: Uso de while para contar hasta que el usuario ingrese 0
        System.out.println("Introduzca un numero (0 para parar):");
        int valor = sc.nextInt();

        while (valor != 0) {
            System.out.println("Valor introducido: " + valor);
            System.out.println("Introduzca un numero (0 para parar):");
            valor = sc.nextInt();
        }

        System.out.println("Fin del programa");
        System.out.println("-------------------------------------------------");

        // Ejercicio 5: Uso de do-while para pedir contraseña
        System.out.println("Introduce la contraseña:");
        String password = sc.nextLine();

        while (!password.equals("java123")) {
            System.out.println("Contraseña incorrecta. Prueba de nuevo:");
            password = sc.nextLine();
        }

        System.out.println("Contraseña correcta");

        sc.close();
    }
}
