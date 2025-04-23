package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia6 {
    public static void main(String[] args) {
        /*
        * Juan está trabajando en un mercadona en el que no hay cajero
        * automático, él siempre calcula el cambio de los clientes de cabeza.
        * ¿Se te ocurre alguna forma de hacerle la vida más sencilla al
        * pobre chaval? Crea un programa que:
        *   - Reciba la cantidad de dinero (double) que el usuario ha
        *     entregado para pagar.
        *   - Compare la cantidad entregada con el precio del producto
        *     y calcule la diferencia.
        *   - Súmale el IVA porque esto es españa,
        *     redondeado a dos décimas (+21%)
        *   - Devuelva el valor utilizando la menor cantidad de billetes y
        *     monedas posibles siendo estos billete de 500 €, billete de 200 €,
        *     billete de 100 €, billete de 50 €, billete de 20 €, billete
        *     de 10 €, billete de 5 €, moneda de 2 €, moneda de 1 €, moneda
        *     de 50 cnts, moneda de 20 cnts, moneda de 10 cnts, moneda
        *     de 2 cnts y moneda de 1 cnt.*/
        double precio, pago, vuelta;
        Scanner sc = new Scanner(System.in);

        System.out.print("Precio del producto: ");
        precio = sc.nextDouble();

        System.out.print("Pago recibido: ");
        pago = sc.nextDouble();
        sc.close();

        // Sumamos el IVA
        precio *= 1.21;
        precio = (double) Math.round(precio * 100) / 100;
        System.out.println("\nPrecion con IVA: " + precio);

        // Calculamos la diferencia y redondeamos a 2 decimales
        vuelta = pago - precio;
        vuelta = (double) Math.round(vuelta * 100) / 100;

        if (vuelta < 0) {
            System.out.println("Vuelta incorrecta. Falta " +
                    Math.abs(vuelta) + "€");
        } else {
            double[] cambio = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2,
                    0.1, 0.05, 0.02, 0.01};
            int cambioAux;

            System.out.println("A devolver: " + vuelta + "€");
            for (int i = 0; i < cambio.length; i++) {
                cambioAux = (int) (vuelta / cambio[i]);
                vuelta %= cambio[i];

                System.out.println("Cambio de " + cambio[i] + "€: " + cambioAux);
            }
        }
    }
}
