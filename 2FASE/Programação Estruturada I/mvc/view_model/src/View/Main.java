package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        // Converte texto "dd/MM/yyyy" em objeto Date
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        // ===== Servico =====
        Servico corte = new Servico(1, "Corte de cabelo", 40.0f);
        Servico barba = new Servico(2, "Barba", 25.0f);

        // ===== Cliente =====
        Cliente cliente1 = new Cliente(1, "João Silva", 'M', formato.parse("15/03/1998"),
                "(48) 99999-1111", "joao@email.com", "1234567",
                "Rua das Flores, 100", "88000-000");            // construtor completo
        Cliente cliente2 = new Cliente(2, "Maria Souza", 'F',
                "(48) 99999-2222", "Av. Central, 50");           // construtor reduzido

        // ===== Usuario (barbeiros/funcionários) =====
        Usuario barbeiro1 = new Usuario(1, "Carlos Barbeiro", "123", "admin", 'M',
                formato.parse("10/07/1990"), "(48) 98888-3333", "carlos@barbearia.com",
                "7654321", "Rua do Comércio, 20");               // construtor completo
        Usuario barbeiro2 = new Usuario(2, "Pedro Lima", "abc"); // construtor reduzido

        // ===== Impressão no console =====
        System.out.println("=== SERVIÇOS ===");
        System.out.println(corte);
        System.out.println(barba);

        System.out.println("\n=== CLIENTES ===");
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println("\n=== USUÁRIOS ===");
        System.out.println(barbeiro1);
        System.out.println(barbeiro2);

        // ===== Teste de getter/setter =====
        // Coloque o BREAKPOINT na linha abaixo para ver o valor mudar no Debug
        corte.setValor(40.0f);
        System.out.println("\nNovo valor do corte: R$ " + corte.getValor());
        System.out.println("Nome do cliente 2 via getter: " + cliente2.getNome());
    }
}