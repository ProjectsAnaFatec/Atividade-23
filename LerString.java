
import java.util.Scanner;

public class LerString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero:");
        int num = scanner.nextInt();
        System.out.print("Digite uma palavra:");
        scanner.nextLine(); // Consumir o buffer
        String s1 = scanner.nextLine();
        System.out.println("Numero: " + num);
        System.out.println("Palavra: " + s1 + "tamanho da palavra: " + s1.length());

        System.out.println("Digite uma frase: ");
        String s2 = scanner.next();
        System.out.println("frase: " + s2 + " tamanho da palavra: " + s2.length());
        String s3 = scanner.next();
        System.out.println("Palavra: " + s3 + " tamanho da palavra: " + s3.length());

        scanner.close();

    }

}
