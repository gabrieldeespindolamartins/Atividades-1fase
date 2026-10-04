public class Aluno
{
    // variaveis
    private int codigo;
    private String nome;
    private String dataNascimento;
    private String email;
    private String senha;

    // notas (parte 04)
    private double[] notas = new double[3];       // array unidimensional obrigatorio
    private boolean[] lancada = new boolean[3];   // controle de quais notas ja foram lancadas

    // financeiro (parte 05)
    private Mensalidade[] mensalidades;           // array unidimensional obrigatorio
    private int numParcelas;

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
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public int getNumParcelas(){
        return this.numParcelas;
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

    // ===== PARTE 04: NOTAS =====

    //lanca uma nota na posicao indicada (0, 1 ou 2)
    public void lancarNotas(int indice, double nota){
        if (indice < 0 || indice >= notas.length){
            System.out.println("Nota invalida! Escolha a nota 1, 2 ou 3.");
        } else if (nota < 0 || nota > 10){
            System.out.println("A nota deve estar entre 0 e 10.");
        } else {
            notas[indice] = nota;
            lancada[indice] = true;
            System.out.println("Nota " + (indice + 1) + " lancada com sucesso!");
        }
    }

    //retorna a media aritmetica das 3 notas
    public double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma = soma + notas[i];
        }
        return soma / notas.length;
    }

    //mostra as notas e a media
    public void exibirNotas(){
        System.out.println("Notas de " + nome + ":");
        for (int i = 0; i < notas.length; i++){
            if (lancada[i]){
                System.out.printf("Nota %d: %.2f\n", i + 1, notas[i]);
            } else {
                System.out.printf("Nota %d: nao lancada\n", i + 1);
            }
        }
        System.out.printf("Media: %.2f\n", calcularMedia());
    }

    // ===== PARTE 05: FINANCEIRO =====

    //cria uma mensalidade para cada valor recebido
    public void adicionarMensalidades(double[] valores){
        this.numParcelas = valores.length;
        this.mensalidades = new Mensalidade[numParcelas];
        for (int i = 0; i < numParcelas; i++){
            mensalidades[i] = new Mensalidade(valores[i]);
        }
    }

    //mostra o valor e o status de cada parcela
    public void exibirMensalidades(){
        if (numParcelas == 0){
            System.out.println("Nenhuma mensalidade cadastrada para " + nome + ".");
            return;
        }

        System.out.println("Mensalidades de " + nome + ":");
        for (int i = 0; i < numParcelas; i++){
            String status;
            if (mensalidades[i].isPago()){
                status = "PAGO";
            } else {
                status = "PENDENTE";
            }
            System.out.printf("Parcela %d: R$ %.2f - %s\n", i + 1, mensalidades[i].getValor(), status);
        }
    }

    //da baixa na parcela da posicao indicada
    public void pagarMensalidade(int indice){
        if (indice < 0 || indice >= numParcelas){
            System.out.println("Parcela invalida!");
        } else if (mensalidades[indice].isPago()){
            System.out.println("Essa parcela ja esta paga.");
        } else {
            mensalidades[indice].darBaixa();
            System.out.println("Parcela " + (indice + 1) + " paga com sucesso!");
        }
    }
}