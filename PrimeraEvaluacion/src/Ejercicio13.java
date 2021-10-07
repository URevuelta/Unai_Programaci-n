import java.util.Scanner;

//Escribe un programa que, dado un importe en euros, indique el número mínimo de
//billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad.
//Por ejemplo:
//
//232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros.

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Cantidad en euros: ");
        int cantidad = sc.nextInt();

        int b500 = cantidad / 500;
        int resto = cantidad % 500;
        System.out.println(" Billetes de 500 " + b500);

        int b200 = resto / 200;
        resto = resto % 200;
        System.out.println(" Billetes de 200: " + b200);

        int b100 = resto / 100;
        resto = resto % 100;
        System.out.println(" Billetes de 100 " + b100);

        int b50 = resto / 50;
        resto = resto % 50;
        System.out.println(" Billetes de 50: " + b50);

        int b20 = resto / 20;
        resto = resto % 20;
        System.out.println(" Billetes de 20: " + b20);

        int b10 = resto / 10;
        resto = resto % 10;
        System.out.println(" Billetes de 10: " + b10);

        int b5 = resto / 5;
        resto = resto % 5;
        System.out.println(" Billetes de 5: " + b5);

        int m2 = resto / 2;
        resto = resto % 2;
        System.out.println(" Monedas de 2: " + m2);

        System.out.println(" Monedas de 1: " + resto);


    }
}
