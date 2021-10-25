package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        /* 13. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la
venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto
recibirá un productor por la uva que entrega en un embarque, considerando lo
siguiente:
a. Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño1; y 30 céntimos si es de tamaño 2.
b. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
cuando es de tamaño 2.
Escribe un programa para determinar la ganancia obtenida.

         */

        // Datos de todas las variables
        Scanner sc = new Scanner(System.in);
        System.out.println(" Precio inicial: ");
        int precioinicial = sc.nextInt(); // precio inicial kg uva
        System.out.println("Tipo de uva (A o B) ");
        String tipouva = sc.next(); // Tecleamos A o B
        System.out.println("Tamaño uva (1 o 2)");
        int tamaño = sc.nextInt();
        System.out.println("Kilos de uvas: ");
        int kg = sc.nextInt();

        // Determinamos el valor segun el tipo y tamaño
        int preciofinal;
        if (tipouva.equals("A")) { // Tipo uva A
            if (tamaño == 1) { // Tamaño uva 1
                preciofinal = precioinicial + 20;
            } else {
                preciofinal = precioinicial + 30;
            }
        } else { // Si el tipo de uva no es A, entra aqui que es B
            if (tamaño == 1) {
                preciofinal = precioinicial - 30;
            } else {
                preciofinal = precioinicial - 50;
            }
            System.out.println(preciofinal * kg);

        }





    }
}
