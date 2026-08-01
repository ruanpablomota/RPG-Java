package dominio;

import interfaces.Atacante;

public class Guerreiro extends Personagem implements Atacante {
    public Guerreiro(String nome, int vida, int ataque, int nivel) {
        super(nome, vida, ataque, nivel);
    }

    @Override
    public void exibirStatus() {
        System.out.println("Nome " + getNome() +
                            "\nVida " + getVida() +
                            "\nAtaque " + getAtaque() +
                            "\nNível " + getNivel());
    }

    @Override
    public void atacar(Personagem alvo) {

    }
}
