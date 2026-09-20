public class Cofrinho{
    private Pessoa dono;
    private int qt50;
    private int qt25;
    private int qt10;

    //Construtor que passa um parametro do tipo pessoa
    public Cofrinho (Pessoa umaPessoa){
        dono = umaPessoa;
    }

    //Construtor que passa dois parametros e instancia no mesmo método
    public Cofrinho (String umNome, int umaIdade){
        dono = new Pessoa(umNome, umaIdade);
        //new instancia objeto e atribui a dono
    }

    public void setDono (Pessoa novoDono){
        dono = novoDono;
    }

    public Pessoa getDono (){
        return dono;
    }

    public void depositaUmaMoedaCincoentaCentavos ( ){
        qt50 = qt50 +1;
    }

    public void depositaUmaMoedaDezCentavos ( ){
        qt10 = qt10 +1;
    }

    public void depositaUmaMoedaVinteCincoCentavos ( ){
        qt25 = qt25 +1;
    }

    public double calculaTotal ( ){
        double total;
        total =qt50*0.5+ qt25*0.25+ qt10*0.10;
        return total;
    }

    public String informaTotal(){
        return dono.getNome()+" tem um total de " +calculaTotal()+ " reais";
    }
}
