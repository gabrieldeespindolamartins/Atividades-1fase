public class Imovel
{
    private int codigo;
    private String descricao;
    private double precoAluguel;
    private int qtMinMeses;

    public Imovel(int codigo, String descricao, double precoAluguel, int qtMinMeses)
    {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoAluguel = precoAluguel;
        this.qtMinMeses = qtMinMeses;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public double getPrecoAluguel()
    {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel)
    {
        this.precoAluguel = precoAluguel;
    }

    public int getQtMinMeses()
    {
        return qtMinMeses;
    }

    public void setQtMinMeses(int qtMinMeses)
    {
        this.qtMinMeses = qtMinMeses;
    }

    public void exibeDados(){
        System.out.println("Dados do Imovel");
        System.out.println("Codigo: "+ codigo);
        System.out.println("Descricao: "+ descricao);
        System.out.println("Preco do Aluguel: " + precoAluguel);
        System.out.println("Qtde. Min. Meses: "+ qtMinMeses);
    }
}
