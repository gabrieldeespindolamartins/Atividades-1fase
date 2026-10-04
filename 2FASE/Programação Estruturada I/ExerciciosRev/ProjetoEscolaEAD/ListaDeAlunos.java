public class ListaDeAlunos
{
    // variaveis
    private Aluno[] alunos; // array unidimensional obrigatorio
    private int totalAlunos;

    //construtor
    public ListaDeAlunos(int capacidade)
    {
        this.alunos = new Aluno[capacidade];
        this.totalAlunos = 0;
    }

    //adiciona um aluno, verificando se a lista esta cheia e se o codigo ja existe
    public boolean adicionarAluno(Aluno a){
        if (totalAlunos >= alunos.length){
            System.out.println("Lista cheia! Nao e possivel adicionar mais alunos.");
            return false;
        }

        // verifica duplicidade por codigo
        for (int i = 0; i < totalAlunos; i++){
            if (alunos[i].getCodigo() == a.getCodigo()){
                System.out.println("Ja existe um aluno com o codigo " + a.getCodigo() + "!");
                return false;
            }
        }

        alunos[totalAlunos] = a;
        totalAlunos++;
        return true;
    }

    //procura um aluno pelo codigo; retorna null se nao encontrar
    public Aluno buscarAluno(int codigo){
        for (int i = 0; i < totalAlunos; i++){
            if (alunos[i].getCodigo() == codigo){
                return alunos[i];
            }
        }
        return null;
    }

    //percorre o vetor e chama exibeDados() de cada aluno
    public void exibirLista(){
        if (totalAlunos == 0){
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (int i = 0; i < totalAlunos; i++){
            System.out.println("----------------------------");
            // polimorfismo: se o aluno for bolsista, roda o exibeDados() do AlunoBolsista
            alunos[i].exibeDados();
        }
        System.out.println("----------------------------");
    }

    public int getTotalAlunos(){
        return this.totalAlunos;
    }
}
