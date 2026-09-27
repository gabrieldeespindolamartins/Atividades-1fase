/**
 * Questao 1 - Arrays unidimensionais.
 * Considere o array a, de inteiros:
 * indice:  0    1    2     3    4    5   6    7    8   9
 * valor: 507  -15  147  2194  300   27  888 -110    0  675
 */
public class Questao01
{
    public static void main(String[] args)
    {
        // Criar o array e atribuir-lhe valores a partir de uma lista de inicializacao
        int[] a = { 507, -15, 147, 2194, 300, 27, 888, -110, 0, 675 }; // length tamanho eh 10

        // a) Qual eh o indice do terceiro elemento do array a?
        int i = 2; // necessitamos de uma variavel i, para termos como referencia o indice 2
        System.out.println("a) Indice " + i + " contem o elemento " + a[i]); // 147

        // b) Qual eh o conteudo do terceiro elemento do array a?
        System.out.println("b) Terceiro elemento do array a eh " + a[2]); // 147

        // c) Qual eh o indice do primeiro elemento do array a?
        System.out.println("c) Indice do primeiro elemento do array a eh 0");

        // d) Qual eh o conteudo do primeiro elemento do array a?
        System.out.println("d) Elemento zero do array a eh " + a[0]); // 507

        // e) Qual eh o indice do elemento onde esta armazenado o valor 888?
        System.out.println("e) O valor 888 esta no indice 6, que eh " + a[6]);

        // f) Qual eh o valor exibido por System.out.println(a[5])?
        System.out.println("f) a[5] = " + a[5]); // 27

        // g) Qual eh o valor exibido por System.out.println(a[5] + 2)?
        System.out.println("g) a[5] + 2 = " + (a[5] + 2)); // 29

        // h) Qual eh o valor exibido por System.out.println(a[5 + 2])?
        System.out.println("h) a[5 + 2] = " + a[5 + 2]); // -110

        // i) Apos int x = 2; int y = 4; qual o valor de a[x] + a[y] + 1?
        int x = 2;
        int y = 4;
        System.out.println("i) a[x] + a[y] + 1 = " + (a[x] + a[y] + 1)); // 147 + 300 + 1 = 448

        // j) Qual o valor de a[x + y + 1]?
        System.out.println("j) a[x + y + 1] = " + a[x + y + 1]); // a[7] = -110

        // k) Qual o valor de a.length?
        System.out.println("k) a.length = " + a.length); // 10

        // l) Qual o valor de a[a.length - 1]?
        System.out.println("l) a[a.length - 1] = " + a[a.length - 1]); // 675

        // Substituindo o valor da posicao 1 do array a pelo teclado
        a[1] = Teclado.leInt("Informe um numero inteiro: ");
        System.out.println("Agora o elemento 1 eh o que vc digitou. E igual a " + a[1]);
    }
}
