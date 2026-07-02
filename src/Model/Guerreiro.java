package Model;

public class Guerreiro extends Personagem{

    private int forcaFisica;


    public Guerreiro(String nome, int vida, String corCabelo, String corPele, double altura, double peso, String arma, int forcaFisica) {
        super(nome, vida, corCabelo, corPele, altura, peso, arma);
        this.forcaFisica =  forcaFisica;
    }

    @Override
    public int atacar() {
        System.out.println("O Guerreiro " + getNome() + "ataca com sua " + getArma()+ "e da " + this.forcaFisica+ "de dano");
        return this.forcaFisica;
    }
}
