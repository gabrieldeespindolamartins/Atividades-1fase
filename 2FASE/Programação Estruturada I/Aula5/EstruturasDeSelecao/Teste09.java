public class Teste09
{
    public static void main (String args[])
    {
        int idade= Teclado.leInt("Digite a idade do Atleta: ");
        double peso;
        peso = 0;
        //String categoria;
        exibirMensagem(idade, peso);
    }
    public static void exibirMensagem(int idade,double peso){
        if(idade<=14)
            System.out.printf(" %d anos a Categoria eh Infantil\n",idade);

        else if(idade>=15 && idade<=17){
            peso = Teclado.leDouble("Digite o peso do Atleta : ");
            if (peso<=50 )
                System.out.printf(" %d anos a Categoria eh Juvenil Leve\n", idade);
            if(peso>50 && peso<=60)
                System.out.printf(" %d anos a Categoria eh Juvenil Pesado\n", idade);
        }

        else if(idade>=18 && idade<=25){
            peso = Teclado.leDouble("Digite o peso do Atleta : ");
            if (peso<=60)
                System.out.printf(" %d anos a Categoria eh Senior Leve\n", idade);
            if(peso>60)
                System.out.printf(" %d anos a Categoria eh Senior Pesado\n", idade);
        }

        else if (idade>25)
            System.out.printf(" %d anos a Categoria eh Veterano\n", idade);
    }
}
