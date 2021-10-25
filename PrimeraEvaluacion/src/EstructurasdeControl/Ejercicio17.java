package EstructurasdeControl;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*Escribe un programa que lea el número de dirección (1 - arriba, 2 - abajo, 3 -
izquierda, 4 - derecha, 0 – no mover) y muestre el texto « subir », o «bajar», o «
mover a la izquierda », o« mover a la derecha », o« no mover », según el número
introducido). Si es un número que no pertenece a ninguna de las direcciones
enumeradas, el programa debería generar: « ¡error! »

         */
        //Presento al usuario el menu
        // 1 - Arriba
        // 2- Abajo
        // 3 - Izquierda
        // 4 - Derecha
        // 0 - No mover

        // Se introduce la opcion que se desee

        // con if else o con switch segun el numero escribe
        // si 1 --> "subir"
        // si 2 --> "bajar"

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el numero de direccion: \nNumero 1\nNumero 2\nNumero 3\nNumero 4\nNumero 0");
        int direccion = sc.nextInt();

        switch (direccion) {
            case 1: {
                System.out.println("Subir");
                break;
            }
            case 2: {
                System.out.println("Bajar");
                break;
            }
            case 3: {
                System.out.println("Mover a la izquierda");
                break;
            }
            case 4: {
                System.out.println("Mover a la derecha");
                break;
            }
            case 0: {
                System.out.println("No mover");
                break;
            }
            default:
                System.out.println("!Error¡");
        }
    }
}
