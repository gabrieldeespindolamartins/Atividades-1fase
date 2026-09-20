//classe de teste
public class CaixaEletronico
{
    //método main
    public static void main(String args[])
    {
        //instanciando a ContaCorrente e inicializando o saldo com 600.00
        ContaCorrente conta = new ContaCorrente(600.00);

        //criando a variavel opcao
        int opcao;

        //utilizando do...while para apresentar as opções para o usuário no mínimo uma vez
        do{
            //apresenta as opcoes do caixa eletronico
            conta.opcoes();

            //lendo a opção do teclado
            opcao = Teclado.leInt("Informe a opção desejada: ");

            //validando a opção informada com o while
            //enquanto o usuário não informar uma opção correta, o programa solicitará a opção novamente
            while(opcao<0 && opcao>4)
                opcao = Teclado.leInt("Opção inválida!  Informe a opção desejada: ");

            //criando as varivaveis auxiliares
            double valor;
            int parcelas;

            //utilizando o switch (estrutura de seleção) para verificar qual foi a opção selecionada
            switch(opcao){
                case 1: //retirada
                    valor = Teclado.leDouble("Informe um valor para retirada: ");
                    conta.retirada(valor);
                    break;
                case 2: // depósito
                    valor = Teclado.leDouble("Informe um valor para depósito: ");
                    conta.deposito(valor);
                    break;
                case 3: // emprestimo
                    valor = Teclado.leDouble("Informe um valor para empréstimo: ");
                    parcelas = Teclado.leInt("Informe a qtde de parcelas: ");
                    conta.emprestimo(valor,parcelas);
                    break;
                case 4: //consulta saldo
                    conta.consultaSaldo();
                default:
                    System.out.println("Encerrando o sistema!");
            }

        }while(opcao!=0); // nas opções o 0 está sendo utilizado para encerrar o programa
    }
}
