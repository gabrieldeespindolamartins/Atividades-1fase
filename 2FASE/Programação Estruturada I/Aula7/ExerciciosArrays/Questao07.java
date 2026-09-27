/**
 * Questao 7 - Preenchimento de uma matriz ja instanciada.
 */
public class Questao07
{
    public static void main(String[] args)
    {
        // a) Armazenar, na matriz m, os numeros impares a partir de 1
        int[][] m = new int[5][5];
        int qtdImpares = armazenaImpares(m);
        System.out.println("\na) Qtd de impares armazenados: " + qtdImpares);

        // b) Armazenar, na matriz m, numeros aleatorios (gerados pelo metodo random),
        // no intervalo [10, 51)
        int[][] m2 = new int[4][4];
        int qtdAleatorios = armazenaAleatorios(m2);
        System.out.println("\nb) Qtd de numeros aleatorios armazenados: " + qtdAleatorios);
    }

    public static int armazenaImpares(int[][] matrix)
    {
        int count = 0;
        int x = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (x % 2 == 1)
                {
                    matrix[i][j] = x;
                    System.out.println(" " + matrix[i][j]);
                    count++;
                }
                x++;
            }
        }
        return count;
    }

    public static int armazenaAleatorios(int[][] matrix)
    {
        int count = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                // intervalo [10, 51): 10 + numero de 0 a 40
                matrix[i][j] = 10 + (int) (Math.random() * 41);
                System.out.println("" + matrix[i][j]);
                count++;
            }
        }
        return count;
    }
}
