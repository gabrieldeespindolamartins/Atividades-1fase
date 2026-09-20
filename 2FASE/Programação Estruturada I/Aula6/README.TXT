----------------------------------------------------------------------------
Este é o arquivo README do projeto.
----------------------------------------------------------------------------

TÍTULO DO PROJETO: EstruturasDeRepeticao (Aula 6 - While / Do..While / For)

OBJETIVO DO PROJETO: Praticar as estruturas de repetição while, do...while e
for em Java, tanto diretamente no método main quanto aplicadas dentro dos
métodos de uma classe, conforme os exemplos do pdf da Aula 6. Toda a entrada
de dados é feita pelo teclado, usando a classe Teclado.

VERSÃO ou DATA: 2026-09-20

COMO INICIAR O PROJETO: Abrir esta pasta no BlueJ (arquivo package.bluej) ou
compilar pela linha de comando com "javac -encoding UTF-8 *.java" e executar
"java NomeDaClasse".

CLASSES DE EXEMPLO (pdf 01):
- PrimeiroExemploWHILE (item 1.1): while - solicita o valor de retirada do
  caixa eletrônico enquanto ele for maior que o saldo disponível
- SegundoExemploDOWHILE (item 2.2): mesmo cenário do PrimeiroExemploWHILE,
  porém usando do...while, para comparar o comportamento das duas estruturas
- TerceiroExemploDOWHILE (item 2.3): usa do...while (estrutura aninhada com
  while) para permitir novas retiradas enquanto o usuário responder 's'
- QuartoExemploFOR (item 3.1): usa for para calcular o valor de cada parcela
  de um empréstimo, com acréscimo de 5% por parcela

CLASSES DE PRÁTICA (item 4 - Classes, Classes de Teste e Estruturas de
Repetição):
- ContaCorrente: classe com atributo saldo e os métodos retirada, depósito,
  empréstimo, consultaSaldo e opcoes, usando while e for para validar valores
- CaixaEletronico: classe de teste que instancia uma ContaCorrente (saldo
  inicial de 600,00) e usa do...while + switch/case para apresentar um menu
  de operações (Saque, Depósito, Empréstimo, Consulta Saldo, Encerrar)

CLASSES AUXILIARES:
- Teclado: leitura de dados do teclado (leInt, leDouble, leString, leChar)

AUTORES: Gabriel

INSTRUÇÕES PARA O USUÁRIO: Ao executar qualquer classe, digite no console os
dados solicitados conforme as mensagens exibidas. No CaixaEletronico, digite
0 para encerrar o menu de operações.
