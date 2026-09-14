public class Teste11
{
    public static void main(String args[])
    {
        int a = Teclado.leInt("Digite o primeiro numero: ");
        int b = Teclado.leInt("Digite o segundo numero: ");
        realizaCalculo(a, b);
    }

    public static void realizaCalculo(int a, int b)
    {
        int resultado;
        System.out.println("=========MENU=========");
        System.out.println(" 1- Adição");
        System.out.println(" 2- Subtração");
        System.out.println(" 3- Multiplicação");
        System.out.println(" 4- Divisão");
        int op = Teclado.leInt("Qual destas operações você deseja realizar? ");
        switch (op) {
            case 1:
                resultado = a + b;
                System.out.println("O resultado da adição eh: " + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println("O resultado da subtração eh: " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("O resultado da multiplicação eh: " + resultado);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    resultado = a / b;
                    System.out.println("O resultado da divisão eh: " + resultado);
                }
                break;
            default:
                System.out.println("Opção inválida! ");
        }
    }
}
