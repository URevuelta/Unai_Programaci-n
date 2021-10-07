public class Ejercicio15 {
    public static void main(String[] args) {

        // 16. Realiza un programa que calcule el área de una circunferencia de radio 5,2
        //centímetros.

        double area = Math.PI * (5.2 * 5.2);
        System.out.println(area);

        // Otra forma de hacerlo
        double area2 = Math.PI * Math.pow(5.2,2);
        System.out.println(area2);

        // Como mostrar solo este valor con dos decimales
        System.out.printf("%.2f", area);
    }
}
