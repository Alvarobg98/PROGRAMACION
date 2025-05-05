package Clase7;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        * Usa try-catch para evitar que el programa se detenga si nombre es null
        */
        try {
            String nombre = null;

            System.out.println("La longitud del nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("Error: variable 'nombre' es null");
        }

    }
}
