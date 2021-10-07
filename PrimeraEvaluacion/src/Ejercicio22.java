import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bbdd = sc.nextDouble();
        double pro = sc.nextDouble();
        double leng = sc.nextDouble();
        double ent = sc.nextDouble();
        double si = sc.nextDouble();

        double nota = bbdd + pro + leng + ent + si;
        System.out.printf("%.2f", nota);

        double notafinal = nota/5;
        System.out.println("Nota final" + notafinal);


    }
}
