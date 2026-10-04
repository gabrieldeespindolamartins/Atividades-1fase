public class Mensalidade
{
    // variaveis
    private double valor;
    private boolean pago;

    //construtor
    public Mensalidade(double valor)
    {
        this.valor = valor;
        this.pago = false; // toda mensalidade comeca como nao paga
    }

    //getters e setters
    public double getValor(){
        return this.valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public boolean isPago(){
        return this.pago;
    }
    public void setPago(boolean pago){
        this.pago = pago;
    }

    //marca a mensalidade como paga
    public void darBaixa(){
        this.pago = true;
    }
}
