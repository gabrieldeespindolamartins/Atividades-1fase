public class Teste02
{
    public static void main(String args[])
    {
        int a = Teclado.leInt("Digite a: ");
        int b = Teclado.leInt("Digite b: ");
        int c = Teclado.leInt("Digite c: ");
        int guarda;

        System.out.println("Valores iniciais -> a: " + a + ", b: " + b + ", c: " + c);

        if (a < b)                                     //if 1
        {
            guarda = a;  a = b;  b = guarda;
            System.out.println("if 1 executado (a < b) -> a: " + a + ", b: " + b);
        }
        else
        {
            System.out.println("if 1 nao executado (a < b é false)");
        }

        if (b < c)                                     //if 2
        {
            guarda = b;  b = c;  c = guarda;
            System.out.println("if 2 executado (b < c) -> b: " + b + ", c: " + c);

            if (a < b)                                  //if 3
            {
                guarda = a;  a = b;  b = guarda;
                System.out.println("if 3 executado (a < b) -> a: " + a + ", b: " + b);
            }
            else
            {
                System.out.println("if 3 nao executado (a < b é false)");
            }
        }
        else
        {
            System.out.println("if 2 nao executado (b < c é false) -> if 3 tambem nao executa");
        }

        System.out.println("Valores finais -> a: " + a + ", b: " + b + ", c: " + c);

        // ==================== RESPOSTAS ====================
        // Quais if's sao executados e quais dao resultado true:
        // i.   a=3, b=7, c=5 -> if 1 true (troca a,b => 7,3,5)
        //                      if 2 true (troca b,c => 7,5,3)
        //                      if 3 executado, porem false (7 < 5 e falso)
        //                      Final: a=7, b=5, c=3
        // ii.  a=3, b=5, c=7 -> if 1 true (=> 5,3,7)
        //                      if 2 true (=> 5,7,3)
        //                      if 3 true (=> 7,5,3)
        //                      Final: a=7, b=5, c=3
        // iii. a=5, b=3, c=7 -> if 1 executado, porem false (5 < 3 e falso)
        //                      if 2 true (=> 5,7,3)
        //                      if 3 true (=> 7,5,3)
        //                      Final: a=7, b=5, c=3
        // iv.  a=5, b=7, c=3 -> if 1 true (=> 7,5,3)
        //                      if 2 executado, porem false (5 < 3 e falso)
        //                      if 3 nao e executado (esta dentro do if 2)
        //                      Final: a=7, b=5, c=3
        // Conclusao: o trecho sempre deixa os tres valores em ordem decrescente.
        // ===================================================
    }
}
