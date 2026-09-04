/**
 * Representa um monitor que pode fazer parte de um pedido.
 */
public class Monitor
{
    private String marca;
    private String modelo;
    private double tamanhoPolegadas;

    public Monitor(String marca, String modelo, double tamanhoPolegadas)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public double getTamanhoPolegadas()
    {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(double tamanhoPolegadas)
    {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public void exibeDados()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamanho: " + tamanhoPolegadas + " polegadas");
    }
}
