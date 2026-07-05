package Model;

import java.util.Random;

public abstract class Personagem {

    private String nome;
    private int vida;
    public static Random d20 = new Random();
    public static Random d6 = new Random();


    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome(){
        return this.nome;
    }

    public int getVida(){
        return this.vida;
    }



    public void receberDano(int dano){

        if( this.vida <=0){
            System.out.println("Você está morto");
        }
        else{
            this.vida -= dano;
            System.out.printf(getNome()+"tomou %d de dano! Vida Restante %d", dano, this.vida);
        }
    }

    public abstract int atacar();



}
