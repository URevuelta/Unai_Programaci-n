package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        System.out.println("Nivel de estudios: ");
        int nivel = sc.nextInt();
        System.out.println("Ingresos: ");
        int ingresos = sc.nextInt();

        boolean jasp = (edad <= 28) && (nivel > 3) || (edad < 30) && (ingresos > 28000);

        System.out.println(jasp);
        if (jasp == true) {
            System.out.println("Joven aunque sobradamente preparado");
        } else {
            System.out.println("Joven no preparado");
        }
    }
}
