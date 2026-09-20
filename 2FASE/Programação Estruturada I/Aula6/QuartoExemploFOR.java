//classe de teste
public class QuartoExemploFOR
{
    //método main da classe de teste
    //responsável pela execução dos comandos
    public static void main(String args[])
    {
        //criando a variável emprestimo e lendo o valor do teclado
        double emprestimo = Teclado.leDouble("Informe um valor para o emprestimo: ");

        //criando a variavel parcelas e lendo o valor do teclado
        double parcelas = Teclado.leInt("Informe a qtde de parcelas para o emprestimo (1-12): ");

        //criando a variavel valor da parcela
        double valorParcela = emprestimo/parcelas;

        //utilizando o for para calcular o valor das parcelas com 5% de acrescimo e apresentar para o usuário
        for(int contador = 1; contador <= parcelas; contador++){
            valorParcela += valorParcela*0.05;
            System.out.printf("O valor da parcela %d é: %4.2f \n", contador, valorParcela);
        }
    }
}
