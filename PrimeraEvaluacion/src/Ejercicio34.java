import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println((n1 != n2) && (n1 != n3) && (n2 != n3));
    }
}
