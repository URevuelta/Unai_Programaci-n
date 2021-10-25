package EstructurasdeControl;

public class EjemplosFor {
    public static void main(String[] args) {
            // i = 0 ; quiere decir que es desde 0
            // mientras se cumpla que i < 10 (true o false)
            // modificacion: cambio la i al finalizr una iteracion antes de entrar a la siguiente
        System.out.println("Incrimentando de 1 en 1");
        for (int i = 0; i < 10; i++) { // si solo hay una instruccion, puede no haber llaves
            // aqui metemos el codigo que queremos que se repita n veces
            System.out.print(i + " ");

            }


        System.out.println("\n\nDecrementando de 1 o en 1");
        for (int i = 10; i >= 0; i--) { // si solo hay una instruccion, puede no haber llaves
            // aqui metemos el codigo que queremos que se repita n veces
            System.out.print(i + " ");


        }
        System.out.println("\n\nSaltando de n en n");
        for (int i = 0; i <= 100; i+=20) { // si solo hay una instruccion, puede no haber llaves
            // aqui metemos el codigo que queremos que se repita n veces
            System.out.print(i + " ");

        }
        System.out.println("\n\nSaltando de n en n");
        for (int i = 100; i >= 50; i-=5) { // si solo hay una instruccion, puede no haber llaves
            // aqui metemos el codigo que queremos que se repita n veces
            System.out.print(i + " ");

        }
    }
}