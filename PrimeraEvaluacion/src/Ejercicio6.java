import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //N ardillas encuentran K nueces y deciden dividirlas equitativamente.             Escribe un
        //programa que calcule (y muestre) cuántas nueces corresponden a cada               ardilla y
        //cuántas sobrarán tras el reparto.

        // Metemos datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas ardillas?");
        int N = sc.nextInt();
        System.out.println("Cuantas nueces?");
        int K = sc.nextInt();

        // Calculamos
        int cociente = K / N;
        int resto = K % N;

        // Mostramos el resultado
        System.out.println("Las ardillas tocan a " + cociente + " nueces, y sobran " + resto);
    }
}
