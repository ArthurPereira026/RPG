import Model.Guerreiro;

public class Arena {
    static void main() {
        Guerreiro thur = new Guerreiro("Thur",150,"Preto", "Machado",10);
        Guerreiro pedro = new Guerreiro("Pedro",150,"Preto", "Machado",10);


        int danoThur = thur.atacar();
        pedro.receberDano(danoThur);
        System.out.println();
        int danoGuerreiro =  pedro.atacar();
        thur.receberDano(danoGuerreiro);
        System.out.println();
    }
}