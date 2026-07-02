package Model;

public class Guerreiro extends  Personagem{

    private String corCabelo;
    private String corPele;
    private String armaCorpoCorpo;
    private String armaRange;
    private int forcaFisica;
    private int pontaria;


    public Guerreiro(String nome, int vida, String corCabelo, String corPele, String armaCorpoCorpo, String armaRange, int forcaFisica, int pontaria) {
        super(nome, vida);
        this.corCabelo =  corCabelo;
        this.corPele = corPele;
        this.armaCorpoCorpo = armaCorpoCorpo;
        this.armaRange = armaRange;
        this.forcaFisica = forcaFisica;
        this.pontaria = pontaria;
    }

    @Override
    public int atacar() {
        return 0;
    }
}
