package Model;

import java.util.Scanner;

public class Guerreiro extends  Personagem{

    private String corCabelo;
    private String armaCorpoCorpo;
    private String armaRange;
    private int forcaFisica;
    private int pontaria;


    public Guerreiro(String nome, int vida, String corCabelo, String armaCorpoCorpo,String armaRange, int forcaFisica, int pontaria) {
        super(nome, vida);
        this.corCabelo =  corCabelo;
        this.armaCorpoCorpo = armaCorpoCorpo;
        this.armaRange = armaRange;
        this.forcaFisica = forcaFisica;
        this.armaRange = armaRange;
    }

    @Override
    public int atacar() {
        Scanner arma = new Scanner(System.in);
        int opcao = 1;
        System.out.println("1 -> escolha a arma que você quer usar pra atacar");
        System.out.printf(" 2 -> A sua arma corpo a corpo"+this.armaCorpoCorpo+"ou sua arma range"+this.armaRange);
        System.out.printf("0 -> Para pular a ação");
        System.out.println("Escolha a sua opção: ");
        opcao = arma.nextInt();
        do {
            switch (opcao){

                case 0:
                    System.out.println("Você decidiu fugir dessa vez!");
                case 1:
                    int atacar = d20.nextInt(1,21);
                    int dano = 0;
                    if (atacar <= 5){
                        System.out.printf("Você errou o golpe!");
                    }
                    else if (atacar <= 10  && atacar > 5) {
                        dano = this.forcaFisica+d6.nextInt(1,7)/2;
                        System.out.printf("Você acertou o alvo de raspão seu dano foi de " +dano+"com sua "+this.armaCorpoCorpo);
                    } else if (atacar > 10 && atacar <= 17) {
                        dano = this.forcaFisica+d6.nextInt(1,7);
                        System.out.printf("Você acertou o ataca seu dano foi de" +dano+ "com sua "+this.armaCorpoCorpo);
                    } else if (atacar > 17) {
                        dano = this.forcaFisica+d6.nextInt(1,7)*2;
                        System.out.printf("Você acertou um ataque critico seu dano foi de"+dano+"com sua "+this.armaCorpoCorpo);
                    }
                case 2:
                    int atacarR = d20.nextInt(1,21);
                    int danoR = 0;
                    if (atacarR <= 5){
                        System.out.printf("Você errou o golpe!");
                    }
                    else if (atacarR <= 10  && atacarR > 5) {
                        dano = this.forcaFisica+d6.nextInt(1,7)/2;
                        System.out.printf("Você acertou o alvo de raspão seu dano foi de " +danoR+"com sua "+this.armaRange);
                    } else if (atacarR > 10 && atacarR <= 17) {
                        dano = this.forcaFisica+d6.nextInt(1,7);
                        System.out.printf("Você acertou o ataca seu dano foi de" +danoR+ "com sua "+this.armaRange);
                    } else if (atacarR > 17) {
                        dano = this.forcaFisica+d6.nextInt(1,7)*2;
                        System.out.printf("Você acertou um ataque critico seu dano foi de"+danoR+"com sua "+this.armaRange);
                    }
                default:
                    System.out.println("Opção invalida!");
            }
        }while (opcao == 0);


        return opcao;
    }
}
