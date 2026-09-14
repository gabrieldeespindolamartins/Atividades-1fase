public class Teste12
{
    public static void main(String args[])
    {
        double nota1 = Teclado.leDouble("Digite a primeira nota: ");
        double nota2 = Teclado.leDouble("Digite a segunda nota: ");
        double nota3 = Teclado.leDouble("Digite a terceira nota: ");

        exibirMedia(nota1, nota2, nota3);
    }

    // Recebe as 3 notas via parametro, calcula a media e exibe o conceito
    public static void exibirMedia(double nota1, double nota2, double nota3)
    {
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media: " + media);

        // mostra a nota do aluno
        if ( (media >= 0) && (media < 4) ){
            System.out.println("Nota E");
        } else if (media < 5){
            System.out.println("Nota D");
        } else if (media < 7){
            System.out.println("Nota C");
        } else if (media < 8){
            System.out.println("Nota B");
        } else if (media <= 10){
            System.out.println("Nota A");
        } else {
            System.out.println("Media invalida");
        }
    }
}
