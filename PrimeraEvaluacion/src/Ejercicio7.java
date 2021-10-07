import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt(); // Por ejemplo 1000
        int horas = minutos / 60;
        int resto = minutos % 60;

        System.out.println("En " + minutos + " minutos hay " + horas + " horas y " + resto + " minutos");
    }
}
