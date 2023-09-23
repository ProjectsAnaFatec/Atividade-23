import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero: ");
        n1 = scanner.nextInt();
        if (n1 % 2 == 0) {
            System.out.println(n1 + "É par");
        } else {
            System.out.println(n1 + "É impar");

        }
        scanner.close();
    }
}
