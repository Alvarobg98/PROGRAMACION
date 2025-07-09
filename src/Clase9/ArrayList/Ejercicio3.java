package Clase9.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
         * Crea un ArrayList<ArrayList<String>> que almacene nombres de ciudades
         * en cada lista interna. Permite al usuario ingresar una ciudad para
         * buscar en qué lista se encuentra. Imprime la lista que contiene
         * la ciudad.
         */

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> ciudades = new ArrayList<>();

        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("madrid");
        lista1.add("barcelona");
        lista1.add("malaga");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("sevilla");
        lista2.add("bilbao");
        lista2.add("vigo");

        ArrayList<String> lista3 = new ArrayList<>();
        lista3.add("zaragoza");
        lista3.add("teruel");
        lista3.add("jaen");

        ciudades.add(lista1);
        ciudades.add(lista2);
        ciudades.add(lista3);

        System.out.print("¿Que ciudad quieres buscar?: ");
        String ciudad = sc.next().toLowerCase();

        boolean encontrada = false;
        for (ArrayList<String> listaCiudades : ciudades) {
            if (listaCiudades.contains(ciudad)) {
                System.out.println(listaCiudades);
                encontrada = true;

                break;
            }
        }

        if (!encontrada) {
            System.out.println("Ciudad no encontrada");
        }
    }
}
