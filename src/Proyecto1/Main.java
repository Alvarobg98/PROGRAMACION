package Proyecto1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.*;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Venta> ventas = new ArrayList<>();

    public static void main(String[] args) {
        cargarClientes();
        cargarLibros();

        String opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n### MENU PRINCIPAL ###");
            System.out.println("1. Gestion de clientes");
            System.out.println("2. Gestion de libros");
            System.out.println("3. Gestion de ventas");
            System.out.println("4. Salir");

            System.out.print("\nSelecciona una opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> gestionClientes(sc);
                case "2" -> gestionLibros(sc);
                case "3" -> gestionVentas(sc);
                case "4" -> System.out.println("Saliendo del sistema");
                default -> System.out.println("Selecciona una opcion valida");
            }
        } while (!opcion.equals("4"));

        sc.close();
    }

    // GESTION DE CLIENTES
    static void gestionClientes(Scanner sc) {
        String opcion;

        do {
            System.out.println("\n### MENU CLIENTES ###");
            System.out.println("1. Alta de clientes");
            System.out.println("2. Baja cliente");
            System.out.println("3. Modificacion cliente");
            System.out.println("4. Busqueda por DNI");
            System.out.println("5. Listado");
            System.out.println("6. Atras");

            System.out.print("\nSelecciona una opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> altaCliente(sc);
                case "2" -> bajaCliente(sc);
                case "3" -> modificarCliente(sc);
                case "4" -> {
                    Cliente cl = busquedaPorDNI(sc);
                    if (cl != null) {
                        cl.mostrarInfo();
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                }
                case "5" -> mostrarClientes();
                case "6" -> System.out.println("Volviendo al menu principal");
                default -> System.out.println("Selcciona una opcion valida");
            }
        } while (!opcion.equals("6"));
    }

    static void cargarClientes() {
        String ficheroCl = "src/Proyecto1/clientes.csv";
        BufferedReader br = null;

        String nombre, dni, tlf, email;
        try {
            br =new BufferedReader(new FileReader(ficheroCl));
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                nombre = fields[0];
                dni = fields[1];
                tlf = fields[2];
                email = fields[3];

                Cliente cliente = new Cliente(nombre, dni, tlf, email);
                clientes.add(cliente);
            }

        } catch (Exception e) {
            System.err.println("Archivo CSV no encontrado: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el archivo: " +
                            e.getMessage());
                }
            }
        }
    }

    static void altaCliente(Scanner sc) {
        String nombre, dni, tlf, email;
        ArrayList<String> listadoDNI = new ArrayList<>();

        for (Cliente cl: clientes)
            listadoDNI.add(cl.getDni());

        System.out.print("DNI: ");
        dni = sc.nextLine();

        if (!listadoDNI.contains(dni)) {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("Telefono: ");
            tlf = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();

            clientes.add(new Cliente(nombre, dni, tlf, email));
        } else {
            System.out.println("Ya existe un usuario con ese DNI");
        }
    }

    static void bajaCliente(Scanner sc) {
        Cliente cl = seleccionarCliente(sc);

        if (cl != null) {
            clientes.remove(cl);
            System.out.println("Cliente eliminado correctamente");
        }
    }

    static void modificarCliente(Scanner sc) {
        Cliente cl = seleccionarCliente(sc);

        if (cl != null) {
            System.out.print("Nombre: ");
            cl.setNombre(sc.nextLine());

            System.out.print("Telefono: ");
            cl.setTelefono(sc.nextLine());

            System.out.print("Email: ");
            cl.setEmail(sc.nextLine());

            System.out.println("Cliente modificado correctamente");
        }
    }

    static Cliente busquedaPorDNI(Scanner sc) {
        Cliente cl = null;
        System.out.print("DNI del cliente: ");
        String dni = sc.nextLine();

        for (Cliente cliente: clientes) {
            if (cliente.getDni().equals(dni)) {
                cl = cliente;

                break;
            }
        }

        return cl;
    }

    static void mostrarClientes() {
        System.out.println("\n---LISTADO DE CLIENTES---");
        ordenarPorNombre();

        for (Cliente cl: clientes) {
            System.out.print((clientes.indexOf(cl) + 1) + ". ");
            cl.mostrarInfo();
        }
    }

    static Cliente seleccionarCliente(Scanner sc) {
        Cliente cliente = null;

        mostrarClientes();
        System.out.print("Selecciona un cliente: ");

        try {
            cliente = clientes.get(sc.nextInt() - 1);
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Error: Seleccion invalida");
            sc.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Seleccion fuera de rango");
            sc.nextLine();
        }

        return cliente;
    }

    static void ordenarPorNombre() {
        clientes.sort(Comparator.comparing(Cliente::getNombre));
    }

    // GESTION DE LIBROS
    static void gestionLibros(Scanner sc) {
        String opcion;

        do {
            System.out.println("\n### MENU LIBROS ###");
            System.out.println("1. Alta de libros");
            System.out.println("2. Mostrar catalogo");
            System.out.println("3. Busqueda por ISBN");
            System.out.println("4. Atras");

            System.out.print("\nSelecciona una opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> altaLibro(sc);
                case "2" -> mostrarLibros();
                case "3" -> buscarPorISBN(sc);
                case "4" -> System.out.println("Volviendo al menu principal");
                default -> System.out.println("Selcciona una opcion valida");
            }
        } while (!opcion.equals("4"));
    }

    static void cargarLibros() {
        String ficheroLibros = "src/Proyecto1/libros.csv";
        BufferedReader br = null;

        String titulo, autor, isbn, editorial;
        double precio;
        try {
            br =new BufferedReader(new FileReader(ficheroLibros));
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                titulo = fields[0];
                autor = fields[1];
                isbn = fields[2];
                editorial = fields[3];
                precio = Double.parseDouble(fields[4]);

                Libro libro = new Libro(titulo, autor, isbn, editorial, precio);
                libros.add(libro);
            }

        } catch (Exception e) {
            System.err.println("Archivo CSV no encontrado: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el archivo: " +
                            e.getMessage());
                }
            }
        }
    }

    static void altaLibro(Scanner sc) {
        String titulo, autor, isbn, editorial;
        double precio;
        ArrayList<String> listadoISBN = new ArrayList<>();

        for (Libro libro: libros)
            listadoISBN.add(libro.getIsbn());

        System.out.print("ISBN: ");
        isbn = sc.nextLine();

        if (!listadoISBN.contains(isbn)) {
            System.out.print("Titulo: ");
            titulo = sc.nextLine();
            System.out.print("Autor: ");
            autor = sc.nextLine();
            System.out.print("Editorial: ");
            editorial = sc.nextLine();
            System.out.print("Precio: ");
            precio = Double.parseDouble(sc.nextLine());

            libros.add(new Libro(titulo, autor, isbn, editorial, precio));
        } else {
            System.out.println("Ya existe un libro con ese ISBN");
        }
    }

    static void mostrarLibros() {
        System.out.println("\n---CATALOGO DE LIBROS---");
        ordenarPorTitulo();

        for (Libro libro: libros) {
            System.out.print((libros.indexOf(libro) + 1) + ". ");
            libro.mostrarInfo();
        }
    }

    static void buscarPorISBN(Scanner sc) {
        System.out.print("ISBN del libro: ");
        String isbn = sc.nextLine();

        boolean encontrado = false;

        for (Libro libro: libros) {
            if (libro.getIsbn().equals(isbn)) {
                encontrado = true;
                libro.mostrarInfo();

                break;
            }
        }

        if (!encontrado)
            System.out.println("Libro no encontrado");
    }

    static Libro seleccionarLibro(Scanner sc) {
        Libro libro = null;

        mostrarLibros();
        System.out.print("Selecciona un articulo: ");

        try {
            libro = libros.get(sc.nextInt() - 1);
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Error: Seleccion invalida");
            sc.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Seleccion fuera de rango");
            sc.nextLine();
        }

        return libro;
    }

    static void ordenarPorTitulo() {
        libros.sort(Comparator.comparing(Libro::getTitulo));
    }

    // GESTION DE VENTAS
    static void gestionVentas(Scanner sc) {
        String opcion;

        do {
            System.out.println("\n### MENU VENTAS ###");
            System.out.println("1. Crear venta");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas por cliente");
            System.out.println("4. Atras");

            System.out.print("\nSelecciona una opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> realizarVenta(sc);
                case "2" -> mostrarVentas();
                case "3" -> mostrarVentasCliente(sc);
                case "4" -> System.out.println("Volviendo al menu principal");
                default -> System.out.println("Selcciona una opcion valida");
            }
        } while (!opcion.equals("4"));
    }

    static void realizarVenta(Scanner sc) {
        if (clientes.isEmpty() || libros.isEmpty()) {
            System.out.println("No se puede crear una venta, " +
                    "faltan clientes y/o productos");
        } else {
            String opcion;
            Cliente cl = seleccionarCliente(sc);

            if (cl != null) {
                // Obtener la fecha actual
                LocalDate fecha = LocalDate.now();

                // Formatearla como String
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
                String fechaFormateada = fecha.format(dtf);
                Venta venta = new Venta(cl, fechaFormateada);

                do {
                    Libro libro = seleccionarLibro(sc);

                    if (libro != null) {
                        venta.addVenta(libro);

                        System.out.print("Pulsa S para añadir mas libros: ");
                        opcion = sc.nextLine().toUpperCase();
                    } else {
                        opcion = "S";
                    }
                } while (opcion.equals("S"));

                if (venta.getNumVentas() > 0) {
                    ventas.add(venta);
                    System.out.println("Venta creada correctamente");
                }
            }
        }
    }

    static void mostrarVentas() {
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas realizadas");
        } else {
            for (Venta venta: ventas) {
                System.out.println("ID: " + venta.getIdVenta() + " (" +
                        venta.getFecha() + ")");
                venta.mostrarCliente();
                venta.mostrarCesta();

                System.out.println("Total: " + venta.precioTotal());
                System.out.println("---------------------------------------\n");
            }
        }
    }

    static void mostrarVentasCliente(Scanner sc) {
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas realizadas");
        } else {
            Cliente cl = busquedaPorDNI(sc);

            if (cl != null) {
                double totalVentas = 0;
                for (Venta venta : ventas) {
                    if (venta.getCliente() == cl) {
                        System.out.println("ID: " + venta.getIdVenta() + " (" +
                                venta.getFecha() + ")");
                        venta.mostrarCliente();
                        venta.mostrarCesta();

                        totalVentas += venta.precioTotal();
                        System.out.println("Total: " + venta.precioTotal());
                        System.out.println("-------------------------------\n");
                    }
                }

                System.out.println("Importe de todas las ventas: " +
                        totalVentas + "€");
            }
        }
    }
}
