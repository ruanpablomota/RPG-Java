package teste;

import dominio.Arma;
import dominio.Personagem;
import dominio.Guerreiro;
import dominio.Mago;
import dominio.Arqueiro;
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
        SistemaBatalha sistemaBatalha = new SistemaBatalha();
        System.out.println();

        while (true) {
            exibirMenu();

            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n=== CRIAÇÃO DE PERSONAGEM ===");

                    System.out.println("Nome do personagem:");
                    String nome = input.nextLine();

                    System.out.println("Vida:");
                    int vida = input.nextInt();

                    System.out.println("Ataque Base:");
                    int ataqueBase = input.nextInt();

                    System.out.println("Nível:");
                    int nivel = input.nextInt();

                    System.out.println("Escolha a arma:");
                    System.out.println("1 - Espada do Caos");
                    System.out.println("2- Cajado místico");
                    System.out.println("3 - Arco Elfico");

                    int escolha = input.nextInt();
                    Arma armaEscolhida = armas.get(escolha - 1);


                    System.out.println("Escolha a classe:");
                    System.out.println("1 - Guerreiro");
                    System.out.println("2 - Mago");
                    System.out.println("3 - Arqueiro");

                    int classe = input.nextInt();

                    switch (classe) {
                        case 1:
                            personagens.add(new Guerreiro(nome, vida, ataqueBase, armaEscolhida, nivel));
                            break;

                        case 2:
                            personagens.add(new Mago(nome, vida, ataqueBase, armaEscolhida, nivel));
                            break;

                        case 3:
                            personagens.add(new Arqueiro(nome, vida, ataqueBase, armaEscolhida, nivel));
                            break;

                        default:
                            System.out.println("Classe inválida!");
                    }

                    break;

                case 2:
                    for (Personagem personagem : personagens) {
                        personagem.exibirStatus();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("=== PERSONAGENS ===");
                    for (int i = 0; i < personagens.size(); i++) {
                        System.out.println((i + 1) + " - " + personagens.get(i).getNome());
                    }
                    System.out.println("Escolha o primeiro personagem:");
                    int escolha1 = input.nextInt();

                    System.out.println("Escolha o segundo personagem:");
                    int escolha2 = input.nextInt();

                    if (escolha1 < 1 || escolha1 > personagens.size()) {
                        System.out.println("Personagem não encontrado");

                    }
                    else if (escolha2 < 1 || escolha2 > personagens.size()) {
                        System.out.println("Personagem não encontrado");

                    } else if (escolha1 == escolha2) {
                        System.out.println("Você não pode escolher o mesmo personagem.");
                        
                    } else {
                        Personagem personagem1 = personagens.get(escolha1 - 1);
                        Personagem personagem2 = personagens.get(escolha2 - 1);

                        sistemaBatalha.iniciarBatalha(personagem1,personagem2);
                    }


               break;
            }


        }

    }


    static void exibirMenu() {
        System.out.println("===== RPG JAVA =====");
        System.out.println("1 - Criar Personagem");
        System.out.println("2 - Listar Personagens");
        System.out.println("3 - Iniciar Batalha");
        System.out.println("4 - Adicionar Item");
        System.out.println("5 - Sair");
    }
}
