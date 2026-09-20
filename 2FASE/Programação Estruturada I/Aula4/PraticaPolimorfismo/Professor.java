public class Professor extends Usuario
{
    // atributos especificos para o Professor
    private String areaAtuacao;

    public Professor(int mat, String nom, String log, String sen)
    {
        super(mat, nom, log, sen);
    }

    public String getAreaAtuacao()
    {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String are)
    {
        areaAtuacao = are;
    }

    // método sobrescrito = deve possuir a mesma assinatura do método da superclasse: Usuario
    public void exibeDados()
    {
        System.out.println("");
        System.out.println("++++++ Dados do Professor ++++++");

        // vamos reaproveitar as instruções que já existem no método da superclasse, para isso, vamos fazer uso da palavra: super
        super.exibeDados(); // esta instrução chama o método exibeDados() da superclasse

        // se a área de atuação for diferente de null e vazia, vamos apresentá-la também
        if (areaAtuacao != null && !areaAtuacao.isEmpty())
            System.out.println("Área de Atuação: " + areaAtuacao);
    }
}
