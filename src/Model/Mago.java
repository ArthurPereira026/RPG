package Model;

public class Mago extends Personagem{

    private int poderMagico;

    public Mago(String nome, int vida, String corCabelo, String corPele, double altura, double peso, String arma, int poderMagico) {
        super(nome, vida, corCabelo, corPele, altura, peso, arma);
        this.poderMagico = poderMagico;
    }

    @Override
    public int atacar() {
        System.out.println("🧙 O Mago" + getNome()+ "ataca o inimigo com usando seu" + getArma()+ "e lança uma bola de fogo");
        return this.poderMagico;
    }
}
