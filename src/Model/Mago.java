package Model;

public class Mago extends Personagem{

    private String corCabelo;
    private String arma;
    private int nivelPoderMagico;
    private String magiaDano;
    private String magiaSuport;



    public Mago(String nome, int vida, String corCabelo, String arma, int nivelPoderMagico, String magiaDano, String magiaSuport) {
        super(nome, vida);
        this.corCabelo = corCabelo;
        this.arma = arma;
        this.nivelPoderMagico = nivelPoderMagico;
        this.magiaDano = magiaDano;
        this.magiaSuport = magiaSuport;
    }


    @Override
    public int atacar() {
        return 0;
    }
}
