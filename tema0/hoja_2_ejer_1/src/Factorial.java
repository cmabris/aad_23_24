import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int factorial = 1;

        int numero = 0;

        System.out.println("Introduce un número");

        numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial es " + factorial);
    }
}