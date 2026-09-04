public class Teste08
{
    public static void main (String args[])
    {
        int num1= Teclado.leInt("Digite o primeiro numero: ");
        int num2= Teclado.leInt("Digite o segundo numero: ");
        int num3= Teclado.leInt("Digite o terceiro numero: ");
        exibirMensagem(num1, num2, num3);
    }
    public static void exibirMensagem(int num1,int num2,int num3){
        int menor = num1;
        if (num2 < menor)
            menor = num2;
        if (num3 < menor)
            menor = num3;
        System.out.println("O menor dos tres numeros e: " + menor);
    }
}
