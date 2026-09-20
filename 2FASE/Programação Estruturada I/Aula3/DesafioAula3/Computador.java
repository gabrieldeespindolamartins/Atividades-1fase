public class Computador
{
    private String modelo;
    private double capacidadeProcessador;
    private int memoria;
    private int hd;

    public Computador(String modelo, double capacidadeProcessador, int memoria, int hd)
    {
        this.modelo = modelo;
        this.capacidadeProcessador = capacidadeProcessador;
        this.memoria = memoria;
        this.hd = hd;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public double getCapacidadeProcessador()
    {
        return capacidadeProcessador;
    }

    public void setCapacidadeProcessador(double capacidadeProcessador)
    {
        this.capacidadeProcessador = capacidadeProcessador;
    }

    public int getMemoria()
    {
        return memoria;
    }

    public void setMemoria(int memoria)
    {
        this.memoria = memoria;
    }

    public int getHd()
    {
        return hd;
    }

    public void setHd(int hd)
    {
        this.hd = hd;
    }
}
