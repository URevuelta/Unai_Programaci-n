package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("El primero es mayor que el segundo");
        } else {
            System.out.println("El segundo es mayor que el primero");
        }
    }
}
