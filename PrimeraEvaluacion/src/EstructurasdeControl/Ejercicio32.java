package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {

        // multiplo de 5: (Numero % == 0) true --> imprime
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num ; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
