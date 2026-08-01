package dominio;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int nivel;

    public Personagem(String nome, int vida, int ataque, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.nivel = nivel;
    }

    public abstract void exibirStatus();

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getNivel() {
        return nivel;
    }
}
