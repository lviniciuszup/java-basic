import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número n: ");
        int n = scanner.nextInt();
        System.out.print("Digite o limite m: ");
        int m = scanner.nextInt();

        for (int i = n; i <= m; i += n) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
