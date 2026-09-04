public class Teste06
{
    public static void main(String args[])
    {
        char turno;
        turno = Teclado.leChar("Digite o turno [M-manhã ou T-tarde ou N-Noite]: ");
        if (turno == 'M' || turno == 'm')
            System.out.println("bom dia");
        else if (turno == 'T' || turno == 't')
            System.out.println("boa tarde");
        else if (turno == 'N' || turno == 'n')
            System.out.println("boa noite");
        else
            System.out.println("turno inválido");
    }
}
