public class TestePedido
{
    public static void main(String[] args)
    {
        Cliente cliente = new Cliente("Gabriel", "gabriel@email.com");
        Computador computador = new Computador("Dell", "Inspiron", 16);
        Monitor monitor = new Monitor("LG", "UltraWide", 29.0);

        Pedido pedido = new Pedido(1, cliente, computador, monitor);

        pedido.exibeDados();
    }
}
