import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       Scanner numberfat = new Scanner(System.in);
        System.out.print("Me informe um numero " +
                "para realizar a fatoração: ");
        int x = numberfat.nextInt();
        double f = x;
        while (x > 1){
            f=f*(x-1);x--;
        }
        System.out.println("A fatoração do numero informado" +
                " é " +f);
    }
};