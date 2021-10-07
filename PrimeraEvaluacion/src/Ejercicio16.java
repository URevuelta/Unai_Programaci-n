import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado = sc.nextInt();
        int perimetro = lado * 4;

        System.out.println("El perimetro de un cuadrado de " + lado + " de lado, tiene de perimetro " + perimetro);
    }
}
