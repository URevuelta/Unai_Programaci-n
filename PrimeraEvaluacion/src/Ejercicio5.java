import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // texto por teclado
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int resultado = ((n + 1) * n + 2) * n + 3;

        System.out.println("Resultado: " + resultado);
    }
}
