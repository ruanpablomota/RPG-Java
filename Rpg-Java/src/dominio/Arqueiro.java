package dominio;

public class Arqueiro extends Personagem  {
    public Arqueiro(String nome, int vida, int ataqueBase, Arma arma, int nivel) {
        super(nome, vida, ataqueBase, arma, nivel);
    }

    @Override
    public void exibirStatus() {
        System.out.println("=== Arqueiro ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Ataque: " + getAtaqueBase());
        System.out.println("Ataque Total: " + getAtaqueTotal());
        System.out.println("Nível: " + getNivel());

    }

    @Override
    public void atacar(Personagem alvo) {
        int novaVida = Math.max(0, alvo.getVida() - getAtaqueTotal());
        alvo.setVida(novaVida);

        System.out.println(getNome() + " lançou uma flecha em " + alvo.getNome());
        System.out.println("Vida restante de " + alvo.getNome() + ": " + alvo.getVida());
    }

}