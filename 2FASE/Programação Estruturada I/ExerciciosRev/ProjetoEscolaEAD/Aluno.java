public class Aluno
{
    // variaveis
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;

    //construtor
    public Aluno(int codigo, String nome, String dataNascimento, String email, String senha)
    {
        // inicializa variáveis de instância
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
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
    
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    public void getDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    
    //metodo exibe dados
    public void exibeDados(){
        System.out.println("Dados do aluno");
        System.out.printf("Codigo: %d\n", codigo);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Data de nascimento: %s\n", dataNascimento);
        System.out.printf("Email: %s\n", email);
        System.out.printf("Senha: @%s\n", senha);
    }
}