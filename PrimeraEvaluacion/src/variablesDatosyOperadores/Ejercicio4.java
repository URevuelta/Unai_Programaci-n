package variablesDatosyOperadores;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int suma = num1 + num2;
        int producto = num3 * num4;

        System.out.println("Suma de " + num1 + "+" + num2 + "=" + suma);
        System.out.println("Producto de " + num3 + "*" + num4 + "=" + producto);

    }
}
