import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int contador = 0;
        int temp = Math.abs(numero);

        do {
            temp /= 10;
            contador++;
        } while (temp > 0);
        System.out.println("O número possui " + contador + " dígitos.");

        scanner.close();
    }
}