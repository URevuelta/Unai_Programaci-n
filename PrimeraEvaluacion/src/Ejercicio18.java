import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        //Reamur = Centígrados x 0.8
        //Fahenheit = (Centígrados * 9/5)+32
        //Kelvin = Centígrados + 273
        // Leemos temperatura en grados
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura en ºC: ");
        double centigrados = sc.nextDouble();

        // Cuidado con los parentesis!!!
        // A la vez que lo muestro lo calculo
        System.out.println("Reamur = " + (centigrados * 0.8));
        System.out.println("Fahenheit = " + ((centigrados * 9/5)+32));
        System.out.println("Kelvin = " + (centigrados + 273)) ;

    }
}
