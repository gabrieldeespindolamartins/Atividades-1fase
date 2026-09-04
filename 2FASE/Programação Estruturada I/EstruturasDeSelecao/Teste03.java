public class Teste03
{
    public static void main (String args[])
    {
        int x= 2; //declara inteiro x e atribui 2
        int y = 5; //declara inteiro y e atribui 5
        boolean b1 = false; //declara boleano b1 e atribui falso
        boolean b2 = false; //declara boleano b2 e atribui falso

        x++; //incrementa x
        b1 = y != x; // y é diferente(!=) de x? Se Sim, Então, b1 é true verdadeiro
        b2 = (y >=x) && b1;
        // (y é maiorigual a x? Se Sim, então é true) (AND) (b1 pode ser true), então b2 recebe?
        System.out.println(b1 + " - " + x + " - " + b2 + " - " + y);
                    //printa os valores boleanos de b1 e b2
        y = y / x; // y dividido por x , então y é ??
        b1 = ! b1; //valor de b1 é diferente de b1 ?
        b2 = (x == y) || b1 && b2;
        //   (boolean)  OR (b1 é boolean && b2 é boolean)
        //...(boolean)  OR  (boolean) ...então b2 é ??
        System.out.println(b1 + " - " + x + " - " + b2 + " - " + y);

        // Respostas:
        // a) x armazenou sucessivamente: 2 (declaracao) -> 3 (apos x++), permanecendo 3 ate o fim
        // b) y na linha do "y = y / x" recebe 5 / 3 = 1 (divisao inteira)
        // c) saida esperada no console:
        //    true - 3 - true - 5
        //    false - 3 - false - 1
    }
}
