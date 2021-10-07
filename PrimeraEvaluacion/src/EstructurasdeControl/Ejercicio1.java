package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0) {
        System.out.println("Numero par: " + num);
        } else {
            System.out.println("Es un numero impar");
        }
}
}