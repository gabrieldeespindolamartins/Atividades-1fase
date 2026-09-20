public class Pessoa{

    //atributos
    private String nome;
    private int idade;

    //construtor
    public Pessoa (String n, int i){
        nome = n;
        idade = i;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    //método que atualiza a idade quando a pessoa faz aniversário
    public void fazAniversario( ){
        idade = idade + 1;
    }

    //método que exibe os dados da pessoa na tela
    public void exibeDados( ) {
        System.out.println (nome);
        System.out.println (idade);
    }

}//fim da classe
