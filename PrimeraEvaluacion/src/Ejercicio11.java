import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero a invertir: ");
        int numero = sc.nextInt();

        // separo decenas de unidades
        int decenas = numero / 10;
        int unidades = numero % 10;

        int invertido = unidades * 10 + decenas;
        System.out.println("numero invertido: " + invertido);

    }
}
