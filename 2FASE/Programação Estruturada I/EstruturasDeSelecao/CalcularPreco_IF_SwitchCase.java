public class CalcularPreco_IF_SwitchCase
{
    public static void main(String args[])
    {
        int idade = Teclado.leInt("Digite a idade: ");

        // IF: determina a categoria do ingresso a partir da idade
        int categoria;
        if (idade <= 12)
            categoria = 1; // Criança
        else if (idade <= 59)
            categoria = 2; // Adulto
        else
            categoria = 3; // Idoso (60+)

        // SWITCH: determina o preço a partir da categoria
        double preco;
        switch (categoria)
        {
            case 1:
                preco = 10.0;
                System.out.println("Categoria: Criança");
                break;
            case 2:
                preco = 30.0;
                System.out.println("Categoria: Adulto");
                break;
            case 3:
                preco = 15.0;
                System.out.println("Categoria: Idoso");
                break;
            default:
                preco = 0.0;
                System.out.println("Categoria inválida");
        }

        System.out.println("Preço do ingresso: R$ " + preco);
    }
}
