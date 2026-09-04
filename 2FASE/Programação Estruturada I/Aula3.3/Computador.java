/**
 * Representa um computador que pode fazer parte de um pedido.
 */
public class Computador
{
    private String marca;
    private String modelo;
    private int memoriaRam;

    public Computador(String marca, String modelo, int memoriaRam)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
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

    public int getMemoria()
    {
        return memoriaRam;
    }

    public void setMemoria(int memoriaRam)
    {
        this.memoriaRam = memoriaRam;
    }

    public void exibeDados()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memoria Ram: " + memoriaRam);
    }
}
