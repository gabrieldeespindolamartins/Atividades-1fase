/**
 * Questao 8 - Calculos sobre uma matriz ja instanciada.
 */
public class Questao08
{
    public static void main(String[] args)
    {
        int[][] matriz = {
            {  5,  6,  7,  8 },
            {  3, 10, 15, 30 },
            { 45, 60, 75, 90 },
            {  1,  2,  4,  9 }
        };

        // a) Calcular a media aritmetica dos numeros armazenados na matriz
        double media = calculaMedia(matriz);
        System.out.println("a) Media aritmetica da matriz: " + media);

        // c) Contar os multiplos comuns de 3 e 5
        int qtdMultiplos = contaMultiplos(matriz);
        System.out.println("c) Quantidade de multiplos comuns de 3 e 5: " + qtdMultiplos);
    }

    public static double calculaMedia(int[][] matrix)
    {
        double soma = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                soma = soma + matrix[i][j];
                count++;
            }
        }
        return soma / count;
    }

    public static int contaMultiplos(int[][] matrix)
    {
        int count = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] % 3 == 0 && matrix[i][j] % 5 == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
