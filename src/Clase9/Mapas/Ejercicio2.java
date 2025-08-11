package Clase9.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        Crea un HashMap<String, String> que almacene nombres de países como
        claves y sus capitales como valores. Permite al usuario ingresar el
        nombre de un país para mostrar su capital.
        */

        HashMap<String,String> paises = new HashMap<>();
        paises.put("España", "Madrid");
        paises.put("Francia", "Paris");
        paises.put("Italia", "Roma");

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Que pais quieres buscar?: ");
        String pais = sc.next();

        System.out.println(pais + ": "
                + paises.getOrDefault(pais, "Desconocido"));
    }
}
