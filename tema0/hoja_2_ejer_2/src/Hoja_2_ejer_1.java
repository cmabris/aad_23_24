import java.util.Scanner;

public class Hoja_2_ejer_1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;

        System.out.println("Introduce un número");

        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                pares += i;
            } else {
                impares += i;
            }
        }

        System.out.println("Los número pares suman " + pares);
        System.out.println("Los números impares suman " + impares);

    }
}