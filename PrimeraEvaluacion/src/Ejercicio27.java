import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nota parcial 1: ");
        double p1 = sc.nextDouble();
        System.out.println("Nota parcial 2: ");
        double p2 = sc.nextDouble();
        System.out.println("Nota parcial 3: ");
        double p3 = sc.nextDouble();

        double media = (p1 + p2 + p3) / 3;
        double proporcion = media * 55 / 100;

        System.out.println("Examen final: ");
        double ef = sc.nextDouble();
        double proporcion2 = ef * 30 / 100;

        System.out.println(" Nota trabajo final: ");
        double tf = sc.nextDouble();
        double proporcion3 = tf * 15 / 100;

        double notafinal = proporcion + proporcion2 + proporcion3;

        System.out.printf("Nota Final: ", + notafinal);



    }
}
