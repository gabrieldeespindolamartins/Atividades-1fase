public class Curso
{
    // variaveis
    private int codigo;
    private String nome;
    private int duracao;
    //construtor
    public Curso(int codigo, String nome, int duracao)
    {
        // inicializa variáveis de instância
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
    }

    //getters e setters
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    
    
    //metodo exibe dados
    public void exibeDados(){
        System.out.println("Dados do curso");
        System.out.printf("Codigo: %d\n", codigo);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Duracao do curso: %d\n", duracao);
    }
}