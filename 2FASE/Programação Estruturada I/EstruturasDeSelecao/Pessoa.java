public class Pessoa
{
    private String nome;
    private int idade;
    // Constructor for objects of class Pessoa
    public Pessoa(String nome, int idade)
    {
        // initialise instance variables
        this.nome = nome;
        this.idade = idade;
    }
    //Metodos Get/Set
    public String getNome ()
    {
        return this.nome;
    }
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    public int getIdade ()
    {
        return this.idade;
    }
    public void setIdade (int idade)
    {
        this.idade = idade;
    }
    public void exibeDados() //exibe dados
    {
        System.out.println("Nome: "+nome); //println - nova linha antes de imprimir
        System.out.println("Idade : "+idade); //\n - nova linha apos imprimir
    }
}
