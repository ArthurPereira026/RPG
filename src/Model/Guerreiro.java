package Model;

public class Guerreiro extends  Personagem{

    private String corCabelo;
    private String armaCorpoCorpo;
    private String armaRange;
    private int forcaFisica;
    private int pontaria;


    public Guerreiro(String nome, int vida, String corCabelo, String armaCorpoCorpo, String armaRange, int forcaFisica, int pontaria) {
        super(nome, vida);
        this.corCabelo =  corCabelo;
        this.armaCorpoCorpo = armaCorpoCorpo;
        this.armaRange = armaRange;
        this.forcaFisica = forcaFisica;
        this.pontaria = pontaria;
    }

    @Override
    public int atacar() {
        int atacar = d20.nextInt(1,21);
        if (atacar <= 5){
            System.out.printf("Você errou o golpe!");
        }
        else if (atacar <= 10  && atacar > 5) {
            System.out.printf("Você acertou o alvo de raspão seu dano foi de " +(this.forcaFisica+d6.nextInt(1,7))/2+"com sua "+this.armaCorpoCorpo);
        } else if (atacar > 10 && atacar <= 17) {
            System.out.printf("Você acertou o ataca seu dano foi de" +(this.forcaFisica+d6.nextInt(1,7))+ "com sua "+this.armaCorpoCorpo);
        } else if (atacar > 17) {
            System.out.printf("Você acertou um ataque critico seu dano foi de"+(this.forcaFisica+d6.nextInt(1,7)*2)+"com sua "+this.armaCorpoCorpo);

        }
        return atacar;
    }
}
