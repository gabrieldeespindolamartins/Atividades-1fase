public class Professor extends Usuario
{
    // atributos especificos para o Professor
    private String areaAtuacao;

    // método construtor Professor = recebe todos os parametros do construtor da superclasse = construtor da classe: Usuario
    public Professor(int mat, String nom, String log, String sen)
    {
        // encaminha os parametros para o construtor da superclasse = construtor da classe: Usuario
        super(mat, nom, log, sen);
    }

    // método de acesso ao atributo: areaAtuacao
    public String getAreaAtuacao()
    {
        return areaAtuacao;
    }

    // método de configuração do atributo: areaAtuacao
    public void setAreaAtuacao(String are)
    {
        areaAtuacao = are;
    }
}
