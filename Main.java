import model.Personagem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Personagem> lista = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Criar personagem");
            System.out.println("2 - Listar personagens");
            System.out.println("3 - Atacar personagem");
            System.out.println("4 - Subir nível");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Classe: ");
                String classe = sc.nextLine();

                Personagem p = new Personagem(nome, 1, 100, classe);
                lista.add(p);

                System.out.println("Personagem criado!");

            } else if (opcao == 2) {

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(i + " - " + lista.get(i));
                }

            } else if (opcao == 3) {

                System.out.print("Índice: ");
                int i = sc.nextInt();

                if (i >= 0 && i < lista.size()) {
                    lista.get(i).atacar();
                } else {
                    System.out.println("Inválido!");
                }

            } else if (opcao == 4) {

                System.out.print("Índice: ");
                int i = sc.nextInt();

                if (i >= 0 && i < lista.size()) {
                    lista.get(i).subirNivel();
                } else {
                    System.out.println("Inválido!");
                }

            } else if (opcao == 0) {

                System.out.println("Saindo...");

            } else {

                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}