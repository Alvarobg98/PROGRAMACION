package Clase12;

import java.util.ArrayList;

public class Banco {
    private String _nombre;
    private ArrayList<Cliente> _clientes;

    public Banco(String nombre) {
        this._nombre = nombre;
        this._clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        System.out.println("Cliente añadido al banco");
        this._clientes.add(cliente);
    }

    public Cliente buscarClientePorDNI(String dni) {
        Cliente cliente = null;

        for (Cliente c: this._clientes) {
            if (c.getDni().equals(dni)) {
                cliente = c;
                break;
            }
        }

        return cliente;
    }

    public void mostrarTodosLosClientes() {
        for (Cliente cliente: this._clientes) {
            cliente.mostrarInfo();
        }
    }

    public void transferir(String dniOrig, String dniDest, double cantidad) {
        Cliente clienteOrig = buscarClientePorDNI(dniOrig);
        Cliente clienteDest = buscarClientePorDNI(dniDest);

        if (clienteOrig == null || clienteDest == null) {
            System.out.println("Cliente no encontrado");
        } else {
            System.out.println("Realizando transeferencia...");
            boolean operacion = clienteOrig.retirar(cantidad);

            if (operacion) {
                clienteDest.depositar(cantidad);
                System.out.println("Transferencia completada");
            } else {
                System.out.println("La transferencia no pudo ser completada");
            }
        }

    }
}
