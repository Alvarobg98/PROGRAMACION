package Clase12;

public class Cliente {
    private String _nombre;
    private String _dni;
    private double _saldo;

    public Cliente(String nombre, String dni, double saldo) {
        this._nombre = nombre;
        this._dni = dni;
        this._saldo = saldo;
    }

    public String getDni() {
        return this._dni;
    }

    public double getSaldo() {
        return this._saldo;
    }

    public void depositar(double cantidad) {
        this._saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (cantidad < this._saldo) {
            this._saldo -= cantidad;

            return true;
        }

        return false;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this._nombre + "(" + this._dni + ")" +
                " | Saldo: " + this._saldo);
    }
}
