import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Numero de tres cifras:");

        int numero = sc.nextInt();
        int c = numero / 100;
        int resto = numero % 100;
        int d = resto / 10;
        int u = resto % 10;

        int invertido = u * 100 + d * 10 + c;
        System.out.println(invertido);
    }
}
