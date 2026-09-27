/**
 * Questao 5 - Arrays bidimensionais (matrizes).
 * Considere a matriz mat, de inteiros:
 *      col0 col1 col2 col3
 * lin0:  13   45   12   19
 * lin1:  67   -5   88   37
 * lin2:  11   43   13    0
 * lin3:  64   52   29   18
 * lin4:  71   14   19   62
 */
public class Questao05
{
    public static void main(String[] args)
    {
        int[][] mat = {
            { 13, 45, 12, 19 },
            { 67, -5, 88, 37 },
            { 11, 43, 13,  0 },
            { 64, 52, 29, 18 },
            { 71, 14, 19, 62 }
        };

        // a) Quantas linhas tem a matriz?
        System.out.println("a) Linhas = " + mat.length); // 5

        // b) Quantas colunas tem a matriz?
        System.out.println("b) Colunas = " + mat[0].length); // 4

        // c) Qual eh o elemento onde esta armazenado o valor 19?
        System.out.println("c) O valor 19 esta em mat[0][3] = " + mat[0][3]
            + " e tambem em mat[4][2] = " + mat[4][2]);

        // d) Qual eh o valor exibido por System.out.println(mat[1][1])?
        System.out.println("d) mat[1][1] = " + mat[1][1]); // -5

        // e) Qual eh o valor exibido por System.out.println(mat[2][0] + 1)?
        System.out.println("e) mat[2][0] + 1 = " + (mat[2][0] + 1)); // 12

        // f) Qual eh o valor exibido por System.out.println(mat[3+1][3-1])?
        System.out.println("f) mat[3+1][3-1] = " + mat[3 + 1][3 - 1]); // mat[4][2] = 19

        int x = 2;

        // g) Apos int x = 2, qual eh o valor de mat[x][x]?
        System.out.println("g) mat[x][x] = " + mat[x][x]); // mat[2][2] = 13

        // h) Apos int x = 2, qual eh o valor de mat[x+1][x]?
        System.out.println("h) mat[x+1][x] = " + mat[x + 1][x]); // mat[3][2] = 29

        // i) Apos int x = 2, qual eh o valor de mat[x][x] + 1?
        System.out.println("i) mat[x][x] + 1 = " + (mat[x][x] + 1)); // 14

        // j) Qual eh o valor exibido por System.out.println(mat.length)?
        System.out.println("j) mat.length = " + mat.length); // 5 - sao as linhas

        // k) Qual eh o valor exibido por mat[mat.length-1][1]?
        System.out.println("k) mat[mat.length-1][1] = " + mat[mat.length - 1][1]); // mat[4][1] = 14

        // l) A matriz tem quantos numeros armazenados?
        System.out.println("l) Total de numeros armazenados = " + (mat.length * mat[0].length)); // 20
    }
}
