import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        double suma = num1 + num2 + num3 + num4;
        double media = suma/ 4;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);

    }
}
