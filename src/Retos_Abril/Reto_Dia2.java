package Retos_Abril;

public class Reto_Dia2 {
    public static void main(String[] args) {
        /*
        * Tu misión es simple, soldado: crear un calendario que muestre todos
        * los meses del año y sus semanas de forma clara y organizada. Nada de
        * efectos especiales ni complicaciones innecesarias, solo un buen código
        * que haga el trabajo. Crea un programa que:
        *   Itere los meses del año
        *   Itere las semanas del mes
        */
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo",
        "junio", "julio", "agosto", "septiembre", "octubre", "noviembre",
        "diciembre"};
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int cont = 1;
        int semanas = 1;
        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i].toUpperCase());
            for (int j = 1; j <= dias[i]; j++) {
                if (cont < 7) {
                    System.out.print(j + " ");
                    cont++;
                } else {
                    System.out.println(j + " Semana: " + semanas);
                    semanas++;
                    cont = 1;
                }
            }

            System.out.println("\n-----------------------------------------------");
        }

    }
}
