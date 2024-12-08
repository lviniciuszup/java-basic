import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean isPrime = true;

        if (numero <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println("O número " + numero + " é primo? " + isPrime);

        scanner.close();
    }
}