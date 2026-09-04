public class Teste01
{
    // classe auxiliar apenas para demonstrar o item (e) - alu.getMedia()
    static class Aluno
    {
        private double media;
        public Aluno(double media) { this.media = media; }
        public double getMedia() { return media; }
    }

    public static void main(String args[])
    {
        // a) se n > 0 então raiz = sqrt(n); escreva raiz
        double n = Teclado.leDouble("Digite n: ");
        if (n > 0)
        {
            double raiz = Math.sqrt(n);
            System.out.println("Raiz: " + raiz);
        }

        // b) se media >= 6,0 então escreva "Aprovado" senão escreva "Precisa de grau C"
        double media = Teclado.leDouble("Digite a media: ");
        if (media >= 6.0)
            System.out.println("Aprovado");
        else
            System.out.println("Precisa de grau C");

        // c) r = 0; se x>y então se x>z então se y!=z então r = 1;
        int r = 0;
        double x = Teclado.leDouble("Digite x: ");
        double y = Teclado.leDouble("Digite y: ");
        double z = Teclado.leDouble("Digite z: ");
        if (x > y)
            if (x > z)
                if (y != z)
                    r = 1;
        System.out.println("(c) r = " + r);

        // d) mesma estrutura do item c, porem com senao r = 2 no if mais interno
        r = 0;
        if (x > y)
            if (x > z)
                if (y != z)
                    r = 1;
                else
                    r = 2;
        System.out.println("(d) r = " + r);

        // e) se alu.getMedia() >= 6,0 então mensagem = "Aprovado" senão mensagem = "Precisa de grau C"
        Aluno alu = new Aluno(media);
        String mensagem;
        if (alu.getMedia() >= 6.0)
            mensagem = "Aprovado";
        else
            mensagem = "Precisa de grau C";
        System.out.println("(e) mensagem = " + mensagem);

        // f) classificacao da media em Otimo/Bom/Aprovado/Em recuperacao
        System.out.println("(f) " + classificaMedia(media));
    }

    public static String classificaMedia(double media)
    {
        if (media >= 9.3)
            return "Otimo";
        else if (media >= 8.5)
            return "Bom";
        else if (media >= 6.0)
            return "Aprovado";
        else
            return "Em recuperação";
    }
}
