import java.util.Scanner;

public class Media{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double nota1, nota2, media;
    System.out.print("Digite a primeira nota: ");
    nota1 = scanner.nextDouble();
    System.out.print("Digite a segunda nota: ");
    nota2 = scanner.nextDouble();
    media = (nota1 + nota2) / 2;
    if (media >= 6){
       System.out.println("Aprovado! com media " + media);
    }
    else {
       System.out.println("Reprovado! com media " + media);
    }
    
scanner.close();
}
}