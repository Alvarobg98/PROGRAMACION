package Proyecto1;

import java.util.ArrayList;

public class Venta {
    private static int codVenta = 1;

    private Cliente cliente;
    private ArrayList<Libro> lineasDeVenta;
    private String fecha;
    private int idVenta;

    public Venta(Cliente cliente, String fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineasDeVenta = new ArrayList<>();
        this.idVenta = codVenta;

        codVenta++;
    }

    public void mostrarCliente() {
        System.out.println("Datos cliente:");
        System.out.print("\t");
        this.cliente.mostrarInfo();
    }

    public void mostrarCesta() {
        System.out.println("Cesta:");

        for (Libro libro: lineasDeVenta) {
            System.out.print("\t");
            libro.mostrarInfo();
        }
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return this.idVenta;
    }

    public void addVenta(Libro libro) {
        this.lineasDeVenta.add(libro);
    }

    public int getNumVentas() {
        return this.lineasDeVenta.size();
    }

    public double precioTotal() {
        double total = 0;

        for (Libro libro: this.lineasDeVenta) {
            total += libro.getPrecio();
        }

        return total;
    }
}
