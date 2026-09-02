package servico;

import dominio.Personagem;

public class SistemaBatalha {

    public void atacar(Personagem atacante, Personagem alvo){
        atacante.atacar(alvo);
    }

    public void iniciarBatalha(Personagem personagem1, Personagem personagem2){
        while (personagem1.getVida() > 0 && personagem2.getVida() > 0){
            personagem1.atacar(personagem2);

            if (personagem2.getVida() <= 0){
                System.out.println(personagem2.getNome() + " foi derrotado!");
                break;
            }

            personagem2.atacar(personagem1);

            if (personagem1.getVida() <= 0){
                System.out.println(personagem1.getNome() + " foi derrotado!");
                break;
            }
        }
    }

}
