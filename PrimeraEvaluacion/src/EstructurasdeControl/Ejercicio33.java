package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Base: ");
        double base= sc.nextInt();
        System.out.println("Exponente: ");
        int exponente = sc.nextInt();

        double potencia = 1;

        for (int i = 1; i <= exponente; i++) {
            potencia = potencia * base;
        }
        System.out.println("Resultado: " + potencia);
    }
}
