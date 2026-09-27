/**
 * Questao 4 - Metodos que recebem um array de inteiros por parametro.
 */
public class Questao04
{
    public static void main(String[] args)
    {
        int[] numeros = { 3, 5, 15, 7, 30, 9, 45, 11, 60 };

        // a) Metodo que calcula e retorna a media aritmetica dos numeros do array
        double media = calculaMedia(numeros);
        System.out.println("a) Media aritmetica = " + media);

        // b) Metodo que conta os multiplos comuns de 3 e 5 e exibe a quantidade na tela
        contaMultiplos(numeros);
    }

    public static double calculaMedia(int[] vet)
    {
        int soma = 0;
        for (int i = 0; i < vet.length; i++)
        {
            soma = soma + vet[i];
        }
        return (double) soma / vet.length;
    }

    public static void contaMultiplos(int[] vet)
    {
        int count = 0;
        for (int i = 0; i < vet.length; i++)
        {
            // Se o resto da divisao de num por 3 eh zero e o resto da divisao por 5
            // tambem eh zero, entao num eh um multiplo comum de 3 e 5
            if (vet[i] % 3 == 0 && vet[i] % 5 == 0)
            {
                count++;
            }
        }
        System.out.println("b) Quantidade de multiplos comuns de 3 e 5: " + count);
    }
}
