import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hora inicial");
        int h1 = sc.nextInt();
        System.out.println("Minutos iniciales");
        int m1 = sc.nextInt();
        System.out.println("Segundos iniciales");
        int s1 = sc.nextInt();

        System.out.println("Hora final");
        int h2 = sc.nextInt();
        System.out.println("Minutos finales");
        int m2 = sc.nextInt();
        System.out.println("Segundos finales");
        int s2 = sc.nextInt();

        // Pasar el momento inicial a segundos
        int h1s = h1 * 3600;
        int m1s = m1 * 60;

        int momento1 = h1s + m1s + s1; // Cuantos segundos son h1, m1 y s1
        System.out.println(momento1);

        int h2s = h2 * 3600;
        int m2s = m2 * 60;

        int momento2 = h2s + m2s + s2;
        System.out.println(momento2);

        // Se resta para sacar la diferencia en segundos
        int D = momento2 - momento1;


        // Cuantas horas hay en D?
        int hD = D / 3600;
        int resto1 = D % 3600;
        int mD = resto1 / 60;
        int sD = resto1 % 60;

        System.out.println(hD + ":" + mD + ":" + sD);
    }
}
