package Retos_Abril;

import java.util.Scanner;

public class Reto_Dia10 {
    public static void main(String[] args) {
        /*
        * Una tienda de galletas artesanales vende al por mayor en su página
        * web. Cada caja de galletas cuesta 6€. Solicita la cantidad de cajas de
        * galletas en cada venta y dependiendo de la cantidad introducida se
        * realizan los siguientes pasos:
        *   - Si la cantidad de cajas de galletas vendidas es menor a 5:
        *     no se permiten compras inferiores a 5 cajas de galletas.
        *   - Si la cantidad de cajas de galletas es mayor o igual a 5,
        *     pero menor a 15: los gastos de envío son de 10€.
        *   - Si la cantidad de cajas de galletas es mayor a 15: El envío
        *     es gratuito.
        * Promociones:
        *   - Si el precio total es inferior a 120€ no hay promociones.
        *   - Si el precio total supera los 120€ pero es menor a 250€:
        *     Tiene un descuento del 5%.
        *   - Si el precio total supera los 250€: Tiene un descuento del 10%.
        * Muestra al cliente un mensaje por pantalla según la cantidad de cajas
        * de galletas que quiera comprar:
        *   - Número total de cajas a comprar.
        *   - Total € de la compra.
        *   - Gastos de envío (si los tiene o si es gratuito)
        *   - Descuento por compra (Indicar al cliente cuántos € falta para
        *     entrar en una promoción si la compra es <100€ o el importe de
        *     descuento generado si es superior)
        */
        Scanner sc = new Scanner(System.in);
        int numCajas;

        System.out.print("¿Cuantas cajas de galletas quiere?: ");
        numCajas = sc.nextInt();
        sc.close();

        if (numCajas < 5) {
            System.out.println("No se permiten compras menores a 5 cajas");
        } else {
            int total = numCajas * 6;
            int gastosEnvio, descuento = 0;

            // Gastos de envio
            if (numCajas >= 15) {
                gastosEnvio = 0;

                // Promociones
                if (total >= 250) {
                    descuento = 10;
                } else if (total >= 120){
                    descuento = 5;
                }
            } else {
                gastosEnvio = 10;
            }

            System.out.println("Total cajas: " + numCajas);
            System.out.println("Coste total: " + total);
            System.out.println("Gastos de envio: " + gastosEnvio);

            if (descuento == 0) {
                System.out.println("Te faltan " + (120 - total) +
                        "€ para tener un descuento");
            } else {
                System.out.println("Descuento: " + descuento + "%");
            }
        }
    }
}
