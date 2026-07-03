package Model;

public class Mago extends Personagem{




    public Mago(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public int atacar() {
        return 0;
    }
}
