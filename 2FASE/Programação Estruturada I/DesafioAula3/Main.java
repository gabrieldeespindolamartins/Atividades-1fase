public class Main
{
    public static void main(String[] args)
    {
        //Recebendo atributos do Cliente
        int codigoCliente = Teclado.leInt("Digite o codigo do cliente: ");
        String nomeCliente = Teclado.leString("Digite o nome do cliente: ");
        String telefoneCliente = Teclado.leString("Digite o telefone do cliente: ");
        //Instanciando objeto com o que foi digitado acima
        Cliente cliente = new Cliente(codigoCliente, nomeCliente, telefoneCliente);

        //Recebendo atributos do Imovel
        int codigoImovel = Teclado.leInt("Digite o codigo do imovel: ");
        String descricaoImovel = Teclado.leString("Digite a descricao do imovel: ");
        double precoAluguel = Teclado.leDouble("Digite o preco do aluguel do imovel: ");
        int qtMinMeses = Teclado.leInt("Digite a quantidade minima de meses para aluguel: ");
        //Instanciando objeto com o que foi digitado acima
        Imovel imovel = new Imovel(codigoImovel, descricaoImovel, precoAluguel, qtMinMeses);

        //Recebendo atributos do Aluguel
        int codigoAluguel = Teclado.leInt("Digite o codigo do aluguel: ");
        String dataInicio = Teclado.leString("Digite a data de inicio do aluguel: ");
        String dataFim = Teclado.leString("Digite a data de termino do aluguel: ");
        //Instanciando objeto com o que foi digitado acima
        Aluguel aluguel = new Aluguel(codigoAluguel, dataInicio, dataFim, imovel, cliente);

        //Exibindo os dados do Aluguel
        System.out.println("Dados do aluguel:");
        aluguel.exibeDados();
    }
}
