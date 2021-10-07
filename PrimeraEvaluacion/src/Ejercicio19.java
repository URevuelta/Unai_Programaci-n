import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos los datos
        // punto 1
        System.out.println("x1;");
        double x1 = sc.nextDouble();
        System.out.println("y1;");
        double y1 = sc.nextDouble();
        System.out.println("x2;");
        double x2 = sc.nextDouble();
        System.out.println("y2;");
        double y2 = sc.nextDouble();

        // Ahora calculo
        double d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.print("Distancia: ");

        // Si quiero mostrarlo solo con dos decimales: printf
        System.out.printf("%.2f", d);
    }
}
