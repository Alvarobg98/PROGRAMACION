package Clase3;

public class EjerciciosClase3 {
    public static void main(String[] args) {
        // Ejercicio 1: Conversión implícita de int a double
        int numeroInt = 5;
        double numeroDouble = numeroInt;

        System.out.println("Numero tipo 'int': " + numeroInt);
        System.out.println("Conversion tipo 'double': " + numeroDouble);
        System.out.println("-------------------------------------------------");

        // Ejercicio 2: Conversión explícita (double a int) con truncamiento
        double valorDouble = 7.25;
        int valorInt = (int) valorDouble;

        System.out.println("Numero tipo 'double': " + valorDouble);
        System.out.println("Conversion tipo 'int': " + valorInt);
        System.out.println("-------------------------------------------------");

        // Ejercicio 3: Desbordamiento al convertir int a byte
        numeroInt = 150;
        byte numeroByte = (byte) numeroInt;

        System.out.println("Numero tipo 'int': " + numeroInt);
        System.out.println("Conversion tipo 'byte': " + numeroByte);
        System.out.println("-------------------------------------------------");

        // Ejercicio 4: Conversión de char a int (Código ASCII)
        char letra = 'B';
        numeroInt = letra;

        System.out.println("Valor tipo 'char': " + letra);
        System.out.println("Conversion tipo 'int': " + numeroInt);
        System.out.println("-------------------------------------------------");

        // Ejercicio 5: Conversión de String a int con Integer.parseInt()
        String numeroString = "58";
        numeroInt = Integer.parseInt(numeroString);

        System.out.println("Valor tipo 'string': " + numeroString);
        System.out.println("Conversion tipo 'int': " + numeroInt);
        System.out.println("-------------------------------------------------");

        // Ejercicio 6: Conversión de int a String
        numeroInt = 284;
        numeroString = String.valueOf(numeroInt);

        System.out.println("Valor tipo 'int': " + numeroInt);
        System.out.println("Conversion tipo 'string': " + numeroString);
        System.out.println("-------------------------------------------------");

        // Ejercicio 7: Conversión de double a String
        numeroDouble = 2.84;
        numeroString = String.valueOf(numeroDouble);

        System.out.println("Valor tipo 'double': " + numeroDouble);
        System.out.println("Conversion tipo 'string': " + numeroString);
        System.out.println("-------------------------------------------------");

        // Ejercicio 8: Conversión de boolean a String
        boolean valorBool = true;
        String boolString = String.valueOf(valorBool);

        System.out.println("Valor tipo 'boolean': " + valorBool);
        System.out.println("Conversion tipo 'string': " + boolString);
        System.out.println("-------------------------------------------------");

        // Ejercicio 9: Conversión en operaciones matemáticas
        int a = 10;
        int b = 3;

        System.out.println("Division entera: " + (10 / 3));

        double div = (double) 10 / 3;
        System.out.println("Division con decimales: " + div);
        System.out.println("-------------------------------------------------");

        // Ejercicio 10: Conversión de long a int y de float a int
        long numeroLong = 3000000000L;
        // Produce un desbordamiento
        numeroInt = (int) numeroLong;

        System.out.println("Valor tipo 'long': " + numeroLong);
        System.out.println("Conversion tipo 'int': " + numeroInt);

        float numeroFloat = 3.5f;
        numeroInt = (int) numeroFloat;

        System.out.println("Valor tipo 'float': " + numeroFloat);
        System.out.println("Conversion tipo 'int': " + numeroInt);

    }
}
