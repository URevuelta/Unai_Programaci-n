package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tazas de mantequilla: ");
        int tazas = sc.nextInt();
        System.out.println("Fin de semana (true/false)");
        boolean finde = sc.hasNextBoolean();

        boolean exito;
        if (finde) { // finde == true
            if (tazas >= 15 && tazas <= 25) {
                exito = true;
            } else {
                exito = false;
            }
        }else {
            if (tazas >= 10 && tazas <= 20) {
                exito = true;
            } else {
                exito = false;
            }
            }
        System.out.println(exito);
    }
}
