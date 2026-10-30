package Model;

public class Servico {

    // Atributos encapsulados (private = só a própria classe acessa diretamente)
    private int id;
    private String descricao;
    private float valor;

    // Construtor com os 3 parâmetros
    public Servico(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    // Getters e setters (exceto para o id, conforme o enunciado)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    // Extra: facilita imprimir o objeto com System.out.println(servico)
    @Override
    public String toString() {
        return "Servico{id=" + id + ", descricao=" + descricao + ", valor=R$ " + valor + "}";
    }
}