public class Aluguel
{
    private int codigo;
    private String dataInicio;
    private String dataFim;
    private Imovel imovel;
    private Cliente cliente;

    public Aluguel(int codigo, String dataInicio, String dataFim, Imovel imovel, Cliente cliente)
    {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.imovel = imovel;
        this.cliente = cliente;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getDataInicio()
    {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio)
    {
        this.dataInicio = dataInicio;
    }

    public String getDataFim()
    {
        return dataFim;
    }

    public void setDataFim(String dataFim)
    {
        this.dataFim = dataFim;
    }

    public Imovel getImovel()
    {
        return imovel;
    }

    public void setImovel(Imovel imovel)
    {
        this.imovel = imovel;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public void exibeDados(){
        System.out.println("Aluguel: "+ codigo);
        System.out.println("Data Inicio: "+ dataInicio);
        System.out.println("Data Fim: "+ dataFim);
        imovel.exibeDados();//imprime dados da classe imovel...
        //...Codigo/Descricao/Preco do Aluguel/Qtde. Min. Meses
        System.out.println("Nome Cliente: " + cliente.getNome());
    }
}
