/**
 * Questao 2 - Declaracao e instanciacao de arrays.
 */
public class Questao02
{
    // a) Declare um array de inteiros, de nome vet
    static int[] vet;

    public static void main(String[] args)
    {
        // b) Apos a declaracao, qual eh o valor da variavel vet, na memoria?
        // null - a declaracao apenas aloca a variavel-objeto na memoria e garante
        // que a variavel tem a capacidade de referenciar um objeto do tipo declarado.
        System.out.println("b) Valor de vet antes da instanciacao: " + vet); // null

        // c) Instancie um array de inteiros, de tamanho 15 e atribua para a variavel vet
        vet = new int[15];

        // d) Apos a instanciacao, qual eh o valor de vet[5]?
        System.out.println("d) vet[5] apos instanciar = " + vet[5]); // 0 (conteudo zerado)

        // e) int tam = vet.length; qual eh o valor de tam?
        int tam = vet.length;
        System.out.println("e) tam = vet.length = " + tam); // 15

        // f) Qual eh o ultimo elemento do array vet?
        System.out.println("f) Ultimo elemento (indice 14) = " + vet[vet.length - 1]); // 0

        // g) Qual eh o indice do primeiro elemento do array vet?
        System.out.println("g) Indice do primeiro elemento = 0");

        // h) Declare e instancie um array de nome medias para armazenar as medias de 20 alunos
        double[] medias = new double[20];
        System.out.println("h) Array medias criado com tamanho " + medias.length);
    }
}
