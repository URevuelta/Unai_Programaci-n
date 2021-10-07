import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double eva1 = sc.nextDouble();
        double eva2 = sc.nextDouble();
        double eva3 = sc.nextDouble();
        double fin = eva1 + eva2 + eva3;

        System.out.println("Notas: 1ª evaluacion " + eva1 + ", 2ª evaluacion " + eva2 + " y 3ª evaluacion " + eva3);

        double media = fin/3;
        System.out.println("Nota final " + media);
        System.out.printf("%.2f", media);
    }
}
