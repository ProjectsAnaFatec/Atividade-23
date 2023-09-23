import java.util.Scanner;

public class MediaComP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media < 2) {
            System.out.print("Reprovado! com media %.2f " + media);
        } else if (media < 6) {
            System.out.print("Fazer P3, media final %.2f " + media);
        } else {
            System.out.print("Aprovado! com media %.2f " + media);
        }

        scanner.close();
    }
}
