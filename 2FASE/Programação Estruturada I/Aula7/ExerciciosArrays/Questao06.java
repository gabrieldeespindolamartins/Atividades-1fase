/**
 * Questao 6 - Declaracao de matrizes.
 */
public class Questao06
{
    public static void main(String[] args)
    {
        // a) Declare uma matriz de inteiros, de nome matriz
        int[][] matriz;

        // b) Instancie uma matriz de inteiros, de 6 linhas e 4 colunas
        matriz = new int[6][4];

        // c) Apos a instanciacao, qual eh o valor de matriz[1][3]?
        // O conteudo do array eh zerado quando da sua instanciacao.
        System.out.println("c) matriz[1][3] = " + matriz[1][3]); // 0

        // d) Declare uma matriz de double, de nome notas
        double[][] notas;
        System.out.println("d) Matriz notas declarada (double[][])");

        // e) Declare uma matriz de caracteres de nome letras
        char[][] letras;
        System.out.println("e) Matriz letras declarada (char[][])");
    }
}
