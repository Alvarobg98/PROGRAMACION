package Retos_Abril;

import java.time.*;

public class Reto_Dia3 {
    public static void main(String[] args) {
        /*
        * Crear dos variables utilizando los objetos fecha En la primera se
        * representa la fecha (día, mes, año) actual. En la segunda se
        * representa la fecha de nacimiento. Calcular cuántos años han
        * transcurrido entre ambas fechas y muestra su resultado de
        * maneras diferentes:
        *   Día, mes y año.
        *   Hora, minuto y segundo.
        *   Día de año.
        *   Día de la semana.
        *   Nombre del mes.
        */
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNac = LocalDate.of(1998, Month.JUNE, 5);
        LocalDateTime horaNac = fechaNac.atStartOfDay();
        LocalDateTime horaActual = fechaActual.atStartOfDay();

        Period periodoTiempo = Period.between(fechaNac, fechaActual);
        System.out.println("Periodo transcurrido:" +
                "\n\t" + periodoTiempo.getYears() + " año(s), " +
                periodoTiempo.getMonths() + " mese(s), " +
                periodoTiempo.getDays() + " dia(s)");

        Duration duracionTiempo = Duration.between(horaNac, horaActual);
        System.out.println("Duracion transcurrida:" +
                "\n\t" + duracionTiempo.toHours() + " hora(s), " +
                duracionTiempo.toMinutes() + " minuto(s), " +
                duracionTiempo.toSeconds() + " segundo(s)");

        System.out.println("Dia del año: " + fechaActual.getDayOfYear());
        System.out.println("Dia del mes: " + fechaActual.getDayOfMonth() +
                " (" + fechaActual.getMonth() + ")");
    }
}
