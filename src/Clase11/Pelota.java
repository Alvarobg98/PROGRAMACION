package Clase11;

public class Pelota {
    private String _color;
    private double _diametro;
    private int _rebotes;

    public Pelota(String color, double diametro) {
        this._color = color;
        this._diametro = diametro;
        this._rebotes = 0;
    }

    public void rebotar() {
        this._rebotes += 1;
    }

    public int getRebotes() {
        return this._rebotes;
    }

    public void reiniciar() {
        this._rebotes = 0;
    }
}
