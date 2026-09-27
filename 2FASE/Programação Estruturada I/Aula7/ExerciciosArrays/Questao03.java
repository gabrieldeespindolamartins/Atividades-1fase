/**
 * Questao 3 - Trechos de codigo com arrays.
 */
public class Questao03
{
    public static void main(String[] args)
    {
        // a) Armazenar, no array v (ja instanciado), os numeros impares a partir de 1
        int[] v = new int[10];
        int impar = 1;
        for (int i = 0; i < v.length; i++)
        {
            v[i] = impar;
            impar = impar + 2;
        }

        System.out.println("a) Array v com numeros impares:");
        for (int i = 0; i < v.length; i++)
        {
            System.out.println(v[i]);
        }

        // b) Armazenar no array notas (ja instanciado), as notas lidas do teclado.
        // As notas devem ser validadas, ou seja, nao aceite notas fora do intervalo [0.0, 10.0].
        // Cada vez que for digitada uma nota invalida, leia novamente (do..while dentro do for).
        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++)
        {
            do
            {
                notas[i] = Teclado.leDouble("Digite a nota " + (i + 1) + ": ");
                if (notas[i] < 0.0 || notas[i] > 10.0)
                {
                    System.out.println("Nota invalida!!");
                }
            }
            while (notas[i] < 0.0 || notas[i] > 10.0);
        }

        System.out.println("\nb) Notas digitadas:");
        for (int i = 0; i < notas.length; i++)
        {
            System.out.println(notas[i]);
        }
    }
}
