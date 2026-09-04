import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Peça ao usuário para inserir seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Leitura de uma linha (string)

        // Peça ao usuário para inserir sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Leitura de um número inteiro

        // Exiba as informações inseridas pelo usuário
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        // Feche o objeto Scanner para liberar recursos
        scanner.close();
    }
}
