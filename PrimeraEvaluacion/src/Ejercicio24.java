import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Realiza un programa que pida el precio de venta de un producto, la cantidad de
        //productos comprados y el porcentaje de IVA aplicado. El programa mostrará el
        //importe a abonar.

        System.out.println("El precio es: ");
        double venta = sc.nextDouble();
        System.out.println("La cantidad es: ");
        double cant = sc.nextDouble();
        System.out.println("El porcentaje aplicado es: ");
        double porc = sc.nextDouble();

        double imp = venta * cant * porc / 100;
        System.out.println("El importe a abonar es " + imp + "€");
    }
}
