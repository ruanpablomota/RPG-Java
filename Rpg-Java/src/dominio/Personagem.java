package dominio;

public abstract class Personagem  {
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

    public Arma getArma() {
        return arma;
    }

    public int getNivel() {
        return nivel;
    }


}
