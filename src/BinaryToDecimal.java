import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String binario = scanner.next();

        int decimal = Integer.parseInt(binario, 2);

        System.out.println("Número decimal: " + decimal);

        scanner.close();
    }
}
