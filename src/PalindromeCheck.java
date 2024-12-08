import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }

        boolean isPalindrome = original == invertido;

        System.out.println("O número " + original + " é palíndromo? " + isPalindrome);

        scanner.close();
    }
}
