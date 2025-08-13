package Clase12;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("BBVA");
        Cliente client1 = new Cliente("Alvaro", "1234A", 2500);
        Cliente client2 = new Cliente("Elena", "1234B", 1000);

        banco.agregarCliente(client1);
        banco.agregarCliente(client2);
        System.out.println();

        System.out.println("Clientes en el banco:");
        banco.mostrarTodosLosClientes();
        System.out.println();

        banco.transferir("1234A", "1234B", 500);
        System.out.println();
        banco.mostrarTodosLosClientes();
    }
}
