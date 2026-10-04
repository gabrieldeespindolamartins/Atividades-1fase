// heranca: AlunoBolsista "e um" Aluno, entao herda todos os atributos e metodos dele
public class AlunoBolsista extends Aluno
{
    // atributo exclusivo do bolsista
    private String tipoBolsa;

    //construtor
    public AlunoBolsista(int codigo, String nome, String dataNascimento, String email, String senha, String tipoBolsa)
    {
        // super chama o construtor da classe pai (Aluno)
        super(codigo, nome, dataNascimento, email, senha);
        this.tipoBolsa = tipoBolsa;
    }

    //getters e setters
    public String getTipoBolsa(){
        return this.tipoBolsa;
    }
    public void setTipoBolsa(String tipoBolsa){
        this.tipoBolsa = tipoBolsa;
    }

    //sobrescrita: reaproveita o exibeDados do Aluno e acrescenta o tipo de bolsa
    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.printf("Tipo de bolsa: %s\n", tipoBolsa);
    }
}
