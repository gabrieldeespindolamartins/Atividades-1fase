/**
 * Representa um pedido, que associa um cliente a um computador e um monitor.
 */
public class Pedido
{
    private int numero;
    private Cliente cliente;
    private Computador computador;
    private Monitor monitor;

    public Pedido(int numero, Cliente cliente, Computador computador, Monitor monitor)
    {
        this.numero = numero;
        this.cliente = cliente;
        this.computador = computador;
        this.monitor = monitor;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Computador getComputador()
    {
        return computador;
    }

    public void setComputador(Computador computador)
    {
        this.computador = computador;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    public void setMonitor(Monitor monitor)
    {
        this.monitor = monitor;
    }

    public void exibeDados()
    {
        System.out.println("Pedido numero: " + numero);
        System.out.println("--- Cliente ---");
        cliente.exibeDados();
        System.out.println("--- Computador ---");
        computador.exibeDados();
        System.out.println("--- Monitor ---");
        monitor.exibeDados();
    }
}
