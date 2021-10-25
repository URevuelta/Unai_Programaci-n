package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        int n = sc.nextInt();

        // Calculamos el factorial
        int producto = 1;
        for (int i = 1; i <= n ; i++) {
            producto = producto * i;
            System.out.println(producto);
        }
        System.out.println(n + "! = " + producto);
    }
}
