package EstructurasdeControl;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {

        //ESTRUCTURA CONDICIONAL

        // Primer caso:
        Scanner sc = new Scanner(System.in);
        System.out.println("edad?:");
        int edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println("Mayor de edad. adelante");
            System.out.println("Siguiente instruccion tras el if");

            // Puedo poner solo una variable boolean
            boolean abierta = true;
            if (abierta == true) { //Abierta == true; !abierta -> abierta = false
                System.out.println("Pasa");
                System.out.println("Despues");

        // Segundo caso: if - else ( 2 posibilidades)
        if (edad >= 18){
            System.out.println("Adelante");
        }
        } else { // edad < 18
                // instrucciones false
                System.out.println("No puedes pasar");

            }
        }
    }
}
