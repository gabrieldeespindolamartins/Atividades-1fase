public class Teste10
{
    public static void main(String args[])
    {
        System.out.println("-----Retorna pessoa mais velha-----");
        System.out.println("-----Digite os dados da Pessoas-----");

        Pessoa p1 = new Pessoa((Teclado.leString("Digite o nome da 1 Pessoa: ")),
                                (Teclado.leInt("Digite a idade da 1 Pessoa: ")));

        Pessoa p2 = new Pessoa((Teclado.leString("Digite o nome da 2 Pessoa: ")),
                                (Teclado.leInt("Digite a idade da 2 Pessoa: ")));

        System.out.println(compararIdades(p1, p2));
    }

    //Metodo que retorna o nome da pessoa mais velha - ou mesma idade caso for igual
    public static String compararIdades(Pessoa pessoa1, Pessoa pessoa2)
    {
        if (pessoa1.getIdade() > pessoa2.getIdade()) {
            return pessoa1.getNome();
        }
        else if (pessoa1.getIdade() < pessoa2.getIdade()) {
            return pessoa2.getNome();
        }
        else {
            return "Mesma idade";
        }
    }
}
