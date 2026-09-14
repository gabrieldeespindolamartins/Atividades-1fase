public class Teste05 //Testando if / else if
{
    public static void main (String args[])
    {
        int tempa1= Teclado.leInt("Digite a1=");
        int tempa2= Teclado.leInt("Digite a2=");
        int tempb1= Teclado.leInt("Digite b1=");
        int tempb2= Teclado.leInt("Digite b2=");
        int tempc1= Teclado.leInt("Digite c1=");
        int tempc2= Teclado.leInt("Digite c2=");
        int tempd1= Teclado.leInt("Digite d1=");
        int tempd2= Teclado.leInt("Digite d2=");
        boolean a = tempa1 == tempa2;
        boolean b = tempb1 == tempb2;
        boolean c = tempc1 == tempc2;
        boolean d = tempd1 == tempd2;
        System.out.println(a +" "+ b +" "+ c +" "+ d);

        if (a) {
            System.out.println("C1");
            if (b)
                System.out.println("C2");
            else if (c)
                System.out.println("C3");
            else if (d) {
                System.out.println("C4");
                System.out.println("C5");
            }
            else
                System.out.println("C6");
        }

        // ==================== RESPOSTAS ====================
        // Comandos executados em cada situacao:
        // v)    A, B, C e D true                     -> C1 e C2
        // vi)   A=false, B=true, C=false, D=true     -> nenhum comando
        //                                              (o if externo e false)
        // vii)  A=true, B=false, C=false, D=true     -> C1, C4 e C5
        // viii) A=true, B=false, C=true, D=true      -> C1 e C3
        // Observacao: na cascata else-if apenas o primeiro teste verdadeiro
        // e executado; os demais sao ignorados.
        // ===================================================
    }
}
