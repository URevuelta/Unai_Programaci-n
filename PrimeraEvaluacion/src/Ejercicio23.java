import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n:");
        double n = sc.nextDouble();
        System.out.println("p:");
        double p = sc.nextDouble();

        // Calculamos la cantidad del porcentaje

        double porc = n * p / 100;
        System.out.println("El " + p + "% de " + n + " es " + porc);

        // Incrementamos
        System.out.println("a) " + n + " incrementado un " + p + "% es: " +(n + porc));
        // Decrementamos
        System.out.println("b) " + n + " decrementado un " + p + "% es: " + (n - porc));

    }
}
