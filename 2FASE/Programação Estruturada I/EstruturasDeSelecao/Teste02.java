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
    }
}
