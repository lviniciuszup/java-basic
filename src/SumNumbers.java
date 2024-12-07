import java.sql.SQLOutput;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner numberscr = new Scanner(System.in);
        System.out.print("Me informe um numero para calcular a soma: ");
        int n = numberscr.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
            System.out.println("A soma de 1 até " + n + " é: " + soma);
        }
    }
}