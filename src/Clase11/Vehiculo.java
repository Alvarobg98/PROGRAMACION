package Clase11;

public class Vehiculo {
    private String _marca;
    private String _modelo;
    private String _matricula;
    private double _kilometraje;

    public Vehiculo(String marca, String modelo, String matricula,
                    double kilometraje) {
        this._marca = marca;
        this._modelo = modelo;
        this._matricula = matricula;
        this._kilometraje = kilometraje;
    }

    public void recorrer(double km) {
        this._kilometraje += km;
    }

    public void mostrarVehiculo() {
        System.out.println("Marca: " + this._marca);
        System.out.println("Modelo: " + this._modelo);
        System.out.println("Matricula: " + this._matricula);
        System.out.println("Kilometraje: " + this._kilometraje + "km");
    }
}
