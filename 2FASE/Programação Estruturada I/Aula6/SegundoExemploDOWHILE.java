//classe de teste
public class SegundoExemploDOWHILE
{
    //método main da classe de teste
    //responsável pela execução dos comandos
    public static void main(String args[])
    {
        //criando a variavel saldo
        double saldo = 600.00;

        //criando a variável retirada e lendo o valor do teclado
        double retirada = Teclado.leDouble("Informe um valor para retirada: ");

        //enquanto o valor da retirada for superior ao saldo
        //será solicitado para o usuário informar um novo valor para retirada
        do{
            System.out.println("Saldo indisponível para este valor de retirada.");
            retirada = Teclado.leDouble("Informe um novo valor para retirada: ");
        }while(retirada>saldo);

        //calcula novo saldo
        saldo = saldo - retirada;

        //apresenta novo saldo
        System.out.println("Seu novo saldo é: " + saldo);
    }
}
