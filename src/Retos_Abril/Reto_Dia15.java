package Retos_Abril;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reto_Dia15 {
    public static void main(String[] args) {
        /*
        * Resulta que nos piden que programemos un validador de contraseñas.
        * Algo fácil para los alumnos de Prometeo. Solo tenemos que decir si,
        * una contraseña introducida por terminal es válida o no. Para que una
        * contraseña sea válida debe:
        *   - Tener al menos 8 caracteres.
        *   - Tener al menos una letra minúscula.
        *   - Tener al menos una letra mayúscula.
        *   - Tener al menos un número.
        *   - Tener al menos un símbolo especial de entre los siguientes:
        *     *, ?, !, ^, “, $.
        *   - No contener la palabra GIT, en ningún formato (ni GIT, ni git,
        *     ni gIt, ni giT, ni Git, ni GIt, ni gIT, ni GiT). Odiamos Git.
        */
        Scanner sc = new Scanner(System.in);
        String pswd;

        System.out.print("Introduce la contraseña: ");
        pswd = sc.nextLine();
        sc.close();

        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])" +
                "(?=.*[*?!^“$]).{8,}$";

        if (pswd.matches(pattern)) {
            System.out.println("Contraseña valida");
        } else {
            System.out.println("Contrasña invalida");
        }
    }
}
