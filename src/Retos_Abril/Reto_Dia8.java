package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia8 {
    public static void main(String[] args) {
        /*
        * Escribe un programa que le pregunte al usuario su nombre.
        *   - Si el nombre comienza con la letra "A" (mayúscula o minúscula),
        *     el robot responderá con un saludo entusiasta como:
        *     ¡Hola, Asombroso/a "Nombre"!.
        *   - Si el nombre tiene más de 7 letras, el robot dirá:
        *     ¡Vaya, "Nombre", ¡qué nombre tan largo y sofisticado!.
        *   - Para cualquier otro nombre, el robot simplemente dirá:
        *     Saludos, "Nombre".
        */
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.print("¿Como te llamas?: ");
        nombre = sc.next();
        sc.close();

        if (nombre.startsWith("A") && nombre.length() >= 7) {
            System.out.println("¡Hola, Asombroso/a " + nombre + "!");
            System.out.println("¡Que nombre tan largo y sofisticado!");
        } else if (nombre.startsWith("A")) {
            System.out.println("¡Hola, Asombroso/a " + nombre + "!");
        } else if (nombre.length() >= 7) {
            System.out.println("¡Que nombre tan largo y sofisticado!");
        } else {
            System.out.println("Saludos, " + nombre);
        }
    }
}
