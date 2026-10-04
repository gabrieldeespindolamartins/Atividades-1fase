import java.util.Scanner;

public class SistemaEscolaEAD
{
    // limites do sistema
    private final int MAX_ALUNOS = 50;
    private final int MAX_CURSOS = 10;
    private final int MAX_ALUNOS_POR_CURSO = 10;

    // cria a variavel scanner para salvar o que o usuario escreveu
    private Scanner sc = new Scanner(System.in);

    // parte 03: lista de alunos (usa o array unidimensional Aluno[])
    private ListaDeAlunos lista = new ListaDeAlunos(MAX_ALUNOS);

    // parte 02: cursos cadastrados
    private Curso[] cursos = new Curso[MAX_CURSOS];
    private int totalCursos = 0;

    // parte 02: array bidimensional obrigatorio
    // cada linha = um curso | cada coluna = uma vaga de aluno naquele curso
    private Aluno[][] matriculas = new Aluno[MAX_CURSOS][MAX_ALUNOS_POR_CURSO];

    // guarda quantos alunos ja foram matriculados em cada curso
    private int[] totalMatriculados = new int[MAX_CURSOS];

    public static void main(String[] args) {
        SistemaEscolaEAD sistema = new SistemaEscolaEAD();
        sistema.executar();
    }

    //laco principal do menu
    public void executar(){
        int opcao;
        do {
            exibirMenu();
            opcao = lerInt("Escolha uma opcao: ");
            System.out.println();

            switch (opcao) {
                case 1:
                    lista.exibirLista();
                    break;
                case 2:
                    adicionarAluno();
                    break;
                case 3:
                    System.out.println("Saindo do sistema!");
                    break;
                case 4:
                    verificarNotas();
                    break;
                case 5:
                    verificarFinanceiro();
                    break;
                case 6:
                    cadastrarCursos();
                    break;
                case 7:
                    matricularAluno();
                    break;
                case 8:
                    exibirCursos();
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        } while (opcao != 3);
        // o Scanner nao e fechado de proposito: no BlueJ, fechar o System.in quebra a proxima execucao do main
    }

    private void exibirMenu(){
        System.out.println();
        System.out.println("=== MENU ===");
        System.out.println("1 - Visualizar Lista de Alunos");
        System.out.println("2 - Adicionar Aluno");
        System.out.println("3 - Sair");
        System.out.println("4 - Verificar Notas do Aluno");
        System.out.println("5 - Verificar Financeiro do Aluno");
        System.out.println("6 - Cadastrar Cursos");
        System.out.println("7 - Matricular Aluno em Curso");
        System.out.println("8 - Exibir Cursos e Alunos Matriculados");
    }

    // ===== OPCAO 2: ADICIONAR ALUNO (PARTES 03 E 05) =====
    private void adicionarAluno(){
        System.out.println("--- Cadastro de aluno ---");

        int codigo = lerInt("Codigo: ");
        if (lista.buscarAluno(codigo) != null){
            System.out.println("Ja existe um aluno com o codigo " + codigo + "!");
            return;
        }

        String nome = lerTexto("Nome: ");
        String dataNascimento = lerTexto("Data de nascimento: ");
        String email = lerTexto("Email: ");
        String senha = lerTexto("Senha: ");

        // polimorfismo: a variavel e do tipo Aluno, mas pode guardar um AlunoBolsista
        Aluno aluno;
        int bolsista = lerInt("O aluno e bolsista? (1 - Sim / 2 - Nao): ");
        if (bolsista == 1){
            String tipoBolsa = lerTexto("Tipo de bolsa: ");
            aluno = new AlunoBolsista(codigo, nome, dataNascimento, email, senha, tipoBolsa);
        } else {
            aluno = new Aluno(codigo, nome, dataNascimento, email, senha);
        }

        // parte 05: gera as mensalidades do aluno
        int parcelas;
        do {
            parcelas = lerInt("Numero de parcelas da mensalidade (1 a 12): ");
        } while (parcelas < 1 || parcelas > 12);

        double valor;
        do {
            valor = lerDouble("Valor de cada parcela: R$ ");
        } while (valor <= 0);

        double[] valores = new double[parcelas];
        for (int i = 0; i < parcelas; i++){
            valores[i] = valor;
        }
        aluno.adicionarMensalidades(valores);

        if (lista.adicionarAluno(aluno)){
            System.out.println(nome + " cadastrado com sucesso!");
        }
    }

    // ===== OPCAO 4: VERIFICAR NOTAS (PARTE 04) =====
    private void verificarNotas(){
        int codigo = lerInt("Codigo do aluno: ");
        Aluno aluno = lista.buscarAluno(codigo);

        // valida se o aluno existe antes de exibir as notas
        if (aluno == null){
            System.out.println("Aluno nao encontrado!");
            return;
        }

        aluno.exibirNotas();

        int resposta = lerInt("Deseja lancar uma nota? (1 - Sim / 2 - Nao): ");
        while (resposta == 1){
            int numeroNota = lerInt("Qual nota (1, 2 ou 3)? ");
            double nota = lerDouble("Valor da nota (0 a 10): ");
            aluno.lancarNotas(numeroNota - 1, nota);
            aluno.exibirNotas();
            resposta = lerInt("Deseja lancar outra nota? (1 - Sim / 2 - Nao): ");
        }
    }

    // ===== OPCAO 5: VERIFICAR FINANCEIRO (PARTE 05) =====
    private void verificarFinanceiro(){
        int codigo = lerInt("Codigo do aluno: ");
        Aluno aluno = lista.buscarAluno(codigo);

        if (aluno == null){
            System.out.println("Aluno nao encontrado!");
            return;
        }

        aluno.exibirMensalidades();
        if (aluno.getNumParcelas() == 0){
            return;
        }

        int parcela = lerInt("Digite o numero da parcela para pagar (0 para voltar): ");
        if (parcela != 0){
            aluno.pagarMensalidade(parcela - 1); // usuario digita 1, 2, 3... e o array comeca em 0
            aluno.exibirMensalidades();
        }
    }

    // ===== OPCAO 6: CADASTRAR CURSOS (PARTE 02) =====
    private void cadastrarCursos(){
        int vagas = MAX_CURSOS - totalCursos;
        if (vagas == 0){
            System.out.println("Limite de cursos atingido!");
            return;
        }

        int quantidade = lerInt("Quantos cursos deseja cadastrar? (maximo " + vagas + "): ");
        if (quantidade < 1 || quantidade > vagas){
            System.out.println("Quantidade invalida!");
            return;
        }

        for (int i = 0; i < quantidade; i++){
            System.out.println("--- Cadastro do curso " + (totalCursos + 1) + " ---");
            int codigo = lerInt("Codigo: ");
            String nome = lerTexto("Nome: ");
            int duracao = lerInt("Duracao (horas): ");

            cursos[totalCursos] = new Curso(codigo, nome, duracao);
            totalCursos++;
        }
        System.out.println(quantidade + " curso(s) cadastrado(s)!");
    }

    // ===== OPCAO 7: MATRICULAR ALUNO EM CURSO (PARTE 02) =====
    private void matricularAluno(){
        if (totalCursos == 0){
            System.out.println("Nenhum curso cadastrado. Use a opcao 6 primeiro.");
            return;
        }

        int codigo = lerInt("Codigo do aluno: ");
        Aluno aluno = lista.buscarAluno(codigo);
        if (aluno == null){
            System.out.println("Aluno nao encontrado! Cadastre-o na opcao 2.");
            return;
        }

        // do-while: repete a pergunta ate o usuario escolher um curso valido
        int cursoEscolhido;
        do {
            System.out.println("Em qual curso deseja matricular " + aluno.getNome() + "?");
            for (int c = 0; c < totalCursos; c++){
                System.out.println((c + 1) + " - " + cursos[c].getNome());
            }
            cursoEscolhido = lerInt("Opcao: ") - 1; // usuario digita 1, 2, 3... e o array comeca em 0

            if (cursoEscolhido < 0 || cursoEscolhido >= totalCursos){
                System.out.println("Opcao invalida! Tente novamente.");
            }
        } while (cursoEscolhido < 0 || cursoEscolhido >= totalCursos);

        // verifica se o aluno ja esta nesse curso
        for (int a = 0; a < totalMatriculados[cursoEscolhido]; a++){
            if (matriculas[cursoEscolhido][a].getCodigo() == codigo){
                System.out.println(aluno.getNome() + " ja esta matriculado nesse curso!");
                return;
            }
        }

        // coloca o aluno na proxima vaga livre do curso escolhido
        if (totalMatriculados[cursoEscolhido] < MAX_ALUNOS_POR_CURSO){
            matriculas[cursoEscolhido][totalMatriculados[cursoEscolhido]] = aluno;
            totalMatriculados[cursoEscolhido]++;
            System.out.println(aluno.getNome() + " matriculado em " + cursos[cursoEscolhido].getNome() + "!");
        } else {
            System.out.println("Curso lotado! " + aluno.getNome() + " nao foi matriculado.");
        }
    }

    // ===== OPCAO 8: EXIBIR CURSOS E ALUNOS (PARTE 02) =====
    private void exibirCursos(){
        if (totalCursos == 0){
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        System.out.println("===== CURSOS E ALUNOS MATRICULADOS =====");
        for (int c = 0; c < totalCursos; c++){
            System.out.println("Curso: " + cursos[c].getNome() + " | Duracao: " + cursos[c].getDuracao() + "h");
            System.out.println("Alunos matriculados:");

            if (totalMatriculados[c] == 0){
                System.out.println("- Nenhum aluno matriculado");
            } else {
                for (int a = 0; a < totalMatriculados[c]; a++){
                    Aluno aluno = matriculas[c][a];
                    System.out.println("- " + aluno.getNome() + " (codigo " + aluno.getCodigo() + ")");
                }
            }
            System.out.println();
        }
    }

    // ===== LEITURA DE DADOS COM VALIDACAO =====

    private String lerTexto(String mensagem){
        System.out.print(mensagem);
        return sc.nextLine();
    }

    //repete a pergunta ate o usuario digitar um numero inteiro
    private int lerInt(String mensagem){
        while (true){
            System.out.print(mensagem);
            String texto = sc.nextLine().trim();
            try {
                return Integer.parseInt(texto);
            } catch (NumberFormatException e){
                System.out.println("Digite um numero inteiro valido!");
            }
        }
    }

    //repete a pergunta ate o usuario digitar um numero (aceita 7,5 ou 7.5)
    private double lerDouble(String mensagem){
        while (true){
            System.out.print(mensagem);
            String texto = sc.nextLine().trim().replace(",", ".");
            try {
                return Double.parseDouble(texto);
            } catch (NumberFormatException e){
                System.out.println("Digite um numero valido!");
            }
        }
    }
}
