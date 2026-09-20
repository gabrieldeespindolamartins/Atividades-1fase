public class ContaCorrente
{
    //atributos da classe
    private double saldo;

    //construtor da Classe
    public ContaCorrente(double s)
    {
        saldo = s;
    }

    //método retirada
    public void retirada(double valor)
    {
        //utilizando o while para validar o valor, deve ser inferior ao saldo
        while(valor>saldo){
            System.out.print("Saldo indisponível para retirada.");
            valor = Teclado.leDouble("Informe um novo valor para retirada: ");
        }
        saldo-=valor;
    }

    //método deposito
    public void deposito(double valor)
    {
        //utilizando o while para validar o valor, deve ser superior a zero (0)
        while(valor<=0){
            System.out.print("Valor incorreto para depósito.");
            valor = Teclado.leDouble("Informe um novo valor para depósito: ");
        }
        saldo+=valor;
    }

    //método emprestimo
    public void emprestimo(double valor, int parcelas)
    {
        //utilizando o while para validar a qtde de parcelas, deve ser superior a zero (0)
        while(parcelas<=0){
            System.out.print("Valor incorreto para parcelas.");
            parcelas = Teclado.leInt("Informe a qtde de parcelas (1-12): ");
        }

        //criando a variável valorParcela para utilizar no cálculo das parcelas
        double valorParcela = valor/parcelas;

        //utilizando o for para calcular o valor das parcelas com 5% de acrescimo e apresentar para o usuário
        for(int contador = 1; contador <= parcelas; contador++){
            valorParcela += valorParcela*0.05;
            System.out.printf("O valor da parcela %d é: %4.2f \n", contador, valorParcela);
        }

        saldo+=valor;
    }

    //método consulta saldo
    public void consultaSaldo()
    {
        System.out.printf("Seu saldo é: %4.2f /n ",saldo);
    }

    //método opções do caixa eletrônico
    public void opcoes()
    {
        System.out.println("Bem-vindo ao Caixa Eletrônico!");
        System.out.println("As opções disponíveis são:");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Empréstimo");
        System.out.println("4 - Consulta Saldo");
        System.out.println("0 - Encerrar");
    }
}
