import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int altura = sc.nextInt();
        int area = (base * altura) / 2;

        float basef = sc.nextFloat();
        float alturaf = sc.nextFloat();
        float areaf = sc.nextFloat();
        System.out.println("El area del triangulo de base " + base + ", y de altura " + altura + ", es " + area);
        System.out.println("El area del triangulo de base " + basef + ", y de altura " + alturaf + ", es " + areaf);

    }
}
