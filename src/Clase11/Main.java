package Clase11;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        Libro libro = new Libro("Cocinando con Hannibal Lecter",
                "Hannibal Lecter", 2001);

        libro.mostrarInfo();
        System.out.println();

        libro.prestar();
        libro.mostrarInfo();

        System.out.println("-----------------------------------------------\n");

        // Ejercicio 2
        Vehiculo coche = new Vehiculo("Renault", "Scenic",
                "0000ABC", 128000.5);

        coche.mostrarVehiculo();
        System.out.println();

        coche.recorrer(2000);
        coche.mostrarVehiculo();

        System.out.println("-----------------------------------------------\n");

        // Ejercicio 3
        Empleado empleado = new Empleado("Alvaro",
                "87963405Z", 1200.61);

        System.out.println("Salario anual: " + empleado.getSalarioAnual());
        empleado.aumentarSalario(3);
        empleado.mostrarEmpleado();

        System.out.println("-----------------------------------------------\n");

        // Ejercicio 4
        Pelota pelota = new Pelota("Rojo", 10);

        pelota.rebotar();
        System.out.println("Rebotes: " + pelota.getRebotes());

        pelota.reiniciar();
        System.out.println("Rebotes: " + pelota.getRebotes());

    }
}
