package EstructurasdeControl;

import java.util.Scanner;

public class PruebaContador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Meto numeros y que los vaya contando
        int contador = 0; //guarda la cuenta de los numeros
        int num = 0; // guarda temporalmente el numero que introduzco
        int suma = 0; // guarda la suma y acumulando los numeros en cada vuelta
        for (int i = 0; i < 4; i++) {
            System.out.println("Numero: ");
            num = sc.nextInt();
            suma = suma + num;
            contador++; // Cada vez que introduzco un numero, incremento el marcador
            System.out.println("i = " + i + " la suma = " + suma);
            System.out.println("\n\nSuma total: " + suma);
            System.out.println("Contador = " + contador);


        }
    }
}
