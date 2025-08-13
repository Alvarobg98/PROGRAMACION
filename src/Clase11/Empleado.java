package Clase11;

public class Empleado {
    private String _nombre;
    private String _dni;
    private double _salarioMensual;

    public Empleado(String nombre, String dni, double salarioMensual) {
        this._nombre = nombre;
        this._dni = dni;
        this._salarioMensual = salarioMensual;
    }

    public void aumentarSalario(double porcentaje) {
        porcentaje = 1 + (porcentaje / 100);
        this._salarioMensual *= porcentaje;
    }

    public double getSalarioAnual() {
        return this._salarioMensual * 12;
    }

    public void mostrarEmpleado() {
        System.out.println("Nombre: " + this._nombre);
        System.out.println("DNI: " + this._dni);
        System.out.println("Salario mensual: " + this._salarioMensual);
    }
}
