import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();

        // Sacar horas, minutos y segundos
        // Horas: Dividir entre 60*60 (3600)

        int horas = segundos / 3600;
        int resto1 = segundos % 3600;
        int minutos = resto1 / 60;
        int resto2 = resto1 / 60;

        System.out.println("En " + segundos + " hay " + horas + " horas, " + minutos + " minutos y " + resto2 + " segundos.");
    }
}
