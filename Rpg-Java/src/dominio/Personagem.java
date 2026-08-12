package dominio;

import interfaces.Atacante;

public abstract class Personagem implements Atacante {
    private String nome;
    private int vida;
    private int ataqueBase;
    private Arma arma;
    private int nivel;

    public Personagem(String nome, int vida, int ataqueBase, Arma arma, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
        this.arma = arma;
        this.nivel = nivel;
    }

    public Personagem(String nome, int vida, int ataqueBase , int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.ataqueBase = ataqueBase;
        this.nivel = nivel;
    }

    public abstract void exibirStatus();

    @Override
    public void atacar(Personagem alvo) {

    }

    public int getAtaqueTotal() {
        if (arma == null){
            return ataqueBase;
        }

        return  ataqueBase + arma.getDano();
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaqueBase() {
        return ataqueBase;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public int getNivel() {
        return nivel;
    }


}
