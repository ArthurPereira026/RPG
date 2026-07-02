package Model;

public abstract class Personagem {

    private String nome;
    private int vida;
    private String corCabelo;
    private String corPele;
    private double altura;
    private double peso;
    private String arma;


    public Personagem(String nome, int vida, String corCabelo, String corPele, double altura, double peso, String arma) {
        this.nome = nome;
        this.vida = vida;
        this.corCabelo = corCabelo;
        this.corPele = corPele;
        this.altura = altura;
        this.peso = peso;
        this.arma = arma;
    }

    public String getNome(){
        return this.nome;
    }

    public int getVida(){
        return this.vida;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public double getAltura() {
        return altura;
    }

    public String getCorPele() {
        return corPele;
    }

    public double getPeso() {
        return peso;
    }

    public String getArma() {
        return arma;
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
