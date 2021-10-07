import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte b = 1; // Casting Implicito
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5f;
        double d = 6;
        char c = 7; // 7 es un valor en la tabla ASCII
        boolean bool = true;

        // Empezamos con byte
        s = b;
        i = b;
        l = b;
        f = b;
        d = b;
        // c = b;  No lo permite, Char solo se intercambia con la variable INT

        // Short
        b = (byte) s; // Casting Explicito ( conversion forzada)
        i = s;
        l = s;
        f = s;
        d = s;

        // Posible problema
        long numgrande = 100_000_000_000_000L;
        // casting a int
        int num = (int) numgrande;
        System.out.println(num);

        // Numero maximo en un INT ??
        System.out.println(Integer .MAX_VALUE);
        System.out.println(Integer .MIN_VALUE);


    }
}
