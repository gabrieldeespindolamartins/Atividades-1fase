public class ContaBancaria {
    // Atributo protegido para armazenar o saldo da conta
    protected double saldo;

    // Construtor que recebe um saldo inicial e o atribui ao saldo da conta
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar um valor na conta, adicionando ao saldo
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Método para sacar um valor da conta, subtraindo do saldo
    // Retorna true se o saque foi bem-sucedido, false caso contrário
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
        return this.saldo;
    }

    // Método para imprimir o saldo da conta
    public void imprimirSaldo() {
        System.out.println("Saldo da conta: " + this.saldo);
    }
}
