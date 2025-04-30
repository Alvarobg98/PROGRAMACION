package Retos_Abril;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Reto_Dia13 {
    public static void main(String[] args) throws InterruptedException {
        /*
        * ¿Alguna vez te has levantado con la necesidad de crear un cronómetro?
        * Tranquilo, no eres el único. Hoy vas a poder hacer tu sueño realidad.
        * Crea un programa que:
        *   - Pida al usuario que ingrese el número de segundos que
        *     desea contar.
        *   - Usa un bucle para contar desde el primer segundo hasta el
        *     número total de segundos indicado por el usuario.
        *   - Cada vez que el cronómetro llegue a 60 segundos, debe reiniciar
        *     los segundos a 0 y sumar 1 minuto.
        *   - Cuando los minutos lleguen a 60, debe reiniciar los minutos a 0
        *     y sumar 1 hora.
        *   - El cronómetro debe mostrar el tiempo en formato hh:mm:ss,
        *     donde hh son las horas, mm los minutos y ss los segundos.
        */
        Scanner sc = new Scanner(System.in);
        int numSeg, seg = 1, min = 0, hora = 0;

        LocalTime horaFormat;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.print("Introduce el numero de segundos: ");
        numSeg = sc.nextInt();
        sc.close();

        while (seg <= numSeg) {
            horaFormat = LocalTime.of(hora, min, seg);
            System.out.println(horaFormat.format(formatter));
            seg++;

            if (seg == 60) {
                min++;
                numSeg -= 60;
                seg = 0;
            }

            if (min == 60) {
                hora++;
                min = 0;
            }

            Thread.sleep(1000);
        }
    }
}
