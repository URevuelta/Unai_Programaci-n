package variablesDatosyOperadores;

import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {
        // Tipos de datos primitivos

            // Numeros enteros
            long largo; // 64 bits = 64\8 = 8 bytes, numeros muy grandes
            int entero = 999999999; // 32 bits = 4 bytes
            short corto; // 16 bits = 2 bytes
            // byte b; // 8 bytes

        // Division entera
        int a = 25;
        int b = 8;
        int c = a / b; // 3, es el cociente
        System.out.println(c);
        //int resto = a % b; // resto de la division entera
        System.out.println("resto");

        // ejemplo pag. 6, vamos a hacerlo con Scanner
        // Primero recogemos los datos

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Despues operamos con los datos, los procesamos
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int division = num1 / num2;
        int resto = num1 % num2;
        // Finalmente mostramos el resultado
        System.out.println("Suma de " + num1 + "+" + num2 + "=" + suma);
        System.out.println(" Resta de " + num1 + "-" + num2 + "=" + resta);
        System.out.println("");

        // Tipos de variables para numeros con decimales
        double h = 3.4567; // En el editor, los decimales con un punto
        float k = 3.4567F;
        // Cuando pedimos un numero de estos por teclado
        Scanner sx = new Scanner(System.in);
        System.out.println("Numero decimal: ");
        double t = sc.nextDouble();
        System.out.println(t);

    }
}
