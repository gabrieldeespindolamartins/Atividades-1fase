public class TesteCofrinho{

    public static void main(String args[]){
        //Declarar 3 variáveis do tipo Cofrinho
        Cofrinho c1, c2, c3;

        //Declarar uma variável do tipo Pessoa
        Pessoa p;

        //Instanciar o dono do primeiro cofrinho com dados lidos do teclado
        //e armazenar a referência em uma variável adequada
        p = new Pessoa(Teclado.leString("Nome do dono do primeiro cofrinho: "),
                        Teclado.leInt("idade: "));

        //Instanciar o primeiro cofrinho vazio com o dono já instanciado
        //e armazenar a referência em uma variável adequada
        c1 = new Cofrinho(p);

        //Depositar 5 moedas de 50 centavos no primeiro cofrinho
        c1.depositaUmaMoedaCincoentaCentavos();
        c1.depositaUmaMoedaCincoentaCentavos();
        c1.depositaUmaMoedaCincoentaCentavos();
        c1.depositaUmaMoedaCincoentaCentavos();
        c1.depositaUmaMoedaCincoentaCentavos();

        //Depositar 2 moedas de 25 centavos no primeiro cofrinho
        c1.depositaUmaMoedaVinteCincoCentavos();
        c1.depositaUmaMoedaVinteCincoCentavos();

        //Depositar 2 moedas de 10 centavos no primeiro cofrinho
        c1.depositaUmaMoedaDezCentavos();
        c1.depositaUmaMoedaDezCentavos();

        //Instanciar o segundo cofrinho com o nome e a idade do dono lidos do teclado
        //e armazenar a referência em uma variável adequada
        c2 = new Cofrinho(Teclado.leString("Nome do dono do segundo cofrinho: "),
                           Teclado.leInt("idade: "));

        //Depositar 2 moedas de 50 centavos no segundo cofrinho
        c2.depositaUmaMoedaCincoentaCentavos();
        c2.depositaUmaMoedaCincoentaCentavos();

        //Instanciar o terceiro cofrinho para o mesmo dono do segundo
        c3 = new Cofrinho(c2.getDono());

        //Depositar 3 moedas de 10 centavos no terceiro cofrinho
        c3.depositaUmaMoedaDezCentavos();
        c3.depositaUmaMoedaDezCentavos();
        c3.depositaUmaMoedaDezCentavos();

        //Exibir o nome do dono e o valor total de cada cofrinho:
        System.out.println("\f----------------------------------------------------------------------");
        System.out.println(c1.informaTotal());
        System.out.println(c2.informaTotal());
        System.out.println(c3.informaTotal());
        System.out.println("----------------------------------------------------------------------");

        //Calcular e exibir o total dos três cofrinhos:
        double total;
        total = c1.calculaTotal()+c2.calculaTotal()+c3.calculaTotal();
        System.out.println("Valor total dos tres cofrinhos: "+total);
    }//fim do main
}//fim da classe
