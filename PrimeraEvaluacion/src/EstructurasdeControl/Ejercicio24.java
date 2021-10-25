package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dos numeros enteros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;

        if ((a) < (b)) {
        } else {
            System.out.println("Datos incorrectos");
        }

        for (int i = a; i <= b; i++) {
            total = total + i;
        }
        System.out.println("El resultado es " +total);

    }
}
