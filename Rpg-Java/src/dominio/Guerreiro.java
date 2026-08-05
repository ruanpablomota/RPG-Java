package dominio;

import interfaces.Atacante;

public class Guerreiro extends Personagem implements Atacante {
    public Guerreiro(String nome, int vida, int ataque, int nivel) {
        super(nome, vida, ataque, nivel);
    }

    @Override
    public void exibirStatus() {
        System.out.println("=== Guerreiro ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Ataque: " + getAtaque());
        System.out.println("Nível: " + getNivel());
    }

    @Override
    public void atacar(Personagem alvo) {
        alvo.setVida(alvo.getVida() - getAtaque());
        System.out.println(getNome() + " atacou " + alvo.getNome());
    }
}
