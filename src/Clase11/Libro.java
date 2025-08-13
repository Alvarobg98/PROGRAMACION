package Clase11;

public class Libro {
    private String _titulo;
    private String _autor;
    private int _anioPublicacion;
    private boolean _prestado;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this._titulo = titulo;
        this._autor = autor;
        this._anioPublicacion = anioPublicacion;
        this._prestado = false;
    }

    public void prestar() {
        this._prestado = true;
    }

    public void devolver() {
        this._prestado = false;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + this._titulo);
        System.out.println("Autor: " + this._autor);
        System.out.println("Año de publicacion: " + this._anioPublicacion);

        if (this._prestado) {
            System.out.println("Estado: prestado");
        } else {
            System.out.println("Estado: disponible");
        }
    }
}
