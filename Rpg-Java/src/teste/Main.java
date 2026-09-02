package teste;

import dominio.Arma;
import dominio.Personagem;
import dominio.Guerreiro;
import dominio.Mago;
import dominio.Arqueiro;
import interfaces.Atacante;
import servico.SistemaBatalha;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Arma> armas = new ArrayList<>();
        armas.add(new Arma("Espada do Caos", 10));
        armas.add(new Arma("Cajado Místico", 7));
        armas.add(new Arma("Arco Élfico", 9));

        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(new Guerreiro("Arthur", 100, 30,armas.get(0),2));
        personagens.add(new Mago("Jones", 70,10,armas.get(1),2));
        personagens.add(new Arqueiro("Lanos", 100,20,armas.get(2),3));


        for (Personagem personagem : personagens){
            personagem.exibirStatus();
            System.out.println();

        }

        Personagem guerreiro = personagens.get(0);
        Personagem mago = personagens.get(1);
        Personagem arqueiro = personagens.get(2);

        SistemaBatalha sistemaBatalha = new SistemaBatalha();

        //sistemaBatalha.atacar(guerreiro, mago);
        //sistemaBatalha.atacar(mago, guerreiro);
       // sistemaBatalha.atacar(arqueiro, guerreiro);
        System.out.println();

        sistemaBatalha.iniciarBatalha(guerreiro,mago);
    }


    static void exibirMenu(){
        System.out.println("1 - Criar Personagem");
        System.out.println("2 - Listar Personagens");
        System.out.println("3 - Iniciar Batalha");
        System.out.println("4 - Adicionar Item");
        System.out.println("5 - Sair");
    }
}
