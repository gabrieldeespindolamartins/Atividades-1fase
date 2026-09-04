public class VerificarIdade_if_else
{
    public static void main(String args[])
    {
        int idade = Teclado.leInt("Digite a idade: ");

        System.out.println(faixaEtaria(idade));
    }

    // Método que recebe a idade de uma pessoa, e classifica-a da seguinte forma:
    // até 12 anos, "Infantil"; de 13 a 18, "Adolescente"; de 19 a 24, "Jovem";
    // de 25 a 70, "Adulto"; mais de 70 anos, "Terceira idade".
    public static String faixaEtaria(int idade)
    {
        String msg = "Terceira idade";
        if (idade <= 12)
            msg = "Infantil";
        else if (idade <= 18)
            msg = "Adolescente";
        else if (idade < 25)
            msg = "Jovem";
        else if (idade <= 70)
            msg = "Adulto";
        return msg;
    }
}
