public class Teste04 //Testando if else
{
    public static void main (String args[])
    {
        int a1,a2,b1,b2,c1,c2;
        int tempa1= Teclado.leInt("Digite a1=");
        int tempa2= Teclado.leInt("Digite a2=");
        int tempb1= Teclado.leInt("Digite b1=");
        int tempb2= Teclado.leInt("Digite b2=");
        int tempc1= Teclado.leInt("Digite c1=");
        int tempc2= Teclado.leInt("Digite c2=");
        boolean a = tempa1 == tempa2;
        boolean b = tempb1 == tempb2;
        boolean c = tempc1 == tempc2;
        System.out.println(a +" "+ b +" "+c);
        if (a)
            if (b) {
                    System.out.println("C1");
                    if (c) {
                            System.out.println("C2");
                            System.out.println("C3");
                            }
                    else
                            System.out.println("C4");
                    }
            else
                System.out.println("C5");
        System.out.println("C6");
    }
}
