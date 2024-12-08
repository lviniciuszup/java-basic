import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int invertido = 0;

        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }

        System.out.println("Número invertido: " + invertido);

        scanner.close();
    }
}
