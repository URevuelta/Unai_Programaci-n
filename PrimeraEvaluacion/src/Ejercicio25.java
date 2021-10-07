import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
        //desea saber cuanto deberá pagar finalmente por su compra.

        System.out.println("Importe de la compra: ");
        double total = sc.nextDouble();
        double finl = total * 15 / 100;
        System.out.println("El precio de la compra es " + total + "€, con el 15% de descuento aplicado es " + (total - finl) + "€");

    }
}