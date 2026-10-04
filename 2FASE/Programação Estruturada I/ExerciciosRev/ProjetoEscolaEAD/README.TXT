------------------------------------------------------------------------
TÍTULO DO PROJETO: ProjetoEscolaEAD
------------------------------------------------------------------------

OBJETIVO DO PROJETO:
Sistema de console para uma escola de Educação a Distância (EAD), feito em
Java aplicando Programação Orientada a Objetos. Permite cadastrar alunos
(comuns e bolsistas), lançar notas e calcular a média, controlar
mensalidades e matricular alunos em cursos.

Conceitos aplicados:
- Encapsulamento: atributos private com getters e setters
- Herança e polimorfismo: Aluno -> AlunoBolsista (super, @Override)
- Array unidimensional: alunos[], notas[], mensalidades[]
- Array bidimensional: Aluno[][] matriculas (cursos x vagas)
- Estruturas de repetição: for, while, do-while
- Estruturas de seleção: if, switch

VERSÃO ou DATA: 1.0 - 04/10/2026

COMO INICIAR O PROJETO:
1. Abra a pasta ProjetoEscolaEAD no BlueJ e clique em "Compilar".
2. Clique com o botão direito na classe SistemaEscolaEAD.
3. Escolha "void main(String[] args)" e clique em OK.

AUTORES: Gabriel de Espindola Martins

Disciplina: Linguagem de Programação II - Java
Professor: Rafael N.R. - FMP (Faculdade Municipal de Palhoça)

INSTRUÇÕES PARA O USUÁRIO:
O sistema mostra um menu no terminal. Digite o número da opção e Enter.

  1 - Visualizar Lista de Alunos
  2 - Adicionar Aluno (pergunta se é bolsista e quantas parcelas)
  3 - Sair
  4 - Verificar Notas do Aluno (mostra notas e média; permite lançar notas)
  5 - Verificar Financeiro do Aluno (mostra parcelas; permite pagar uma)
  6 - Cadastrar Cursos
  7 - Matricular Aluno em Curso
  8 - Exibir Cursos e Alunos Matriculados

Ordem sugerida para testar: 2 (cadastrar alunos) -> 6 (cadastrar cursos)
-> 7 (matricular) -> 8 (ver matrículas) -> 4 (notas) -> 5 (financeiro).

Notas e valores aceitam vírgula ou ponto (ex: 7,5 ou 7.5).
