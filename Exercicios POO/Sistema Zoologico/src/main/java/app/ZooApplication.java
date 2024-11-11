package app;

import Dados.Elefante;
import Dados.Leao;
import Dados.Papagaio;
import Dados.ZooManager;
import java.util.Scanner;

public class ZooApplication {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ZooManager zooManager = new ZooManager();
            int opcao;

            do {
                System.out.println("\nSistema de Gerenciamento de Zoológico");
                System.out.println("1. Adicionar Animal");
                System.out.println("2. Listar Animais");
                System.out.println("3. Ouvir Som dos Animais");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();  // Consumir a nova linha

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Escolha o tipo de animal:");
                        System.out.println("1. Leão");
                        System.out.println("2. Elefante");
                        System.out.println("3. Papagaio");
                        System.out.print("Escolha uma opção: ");
                        int tipoAnimal = scanner.nextInt();
                        scanner.nextLine();  // Consumir a nova linha

                        System.out.print("Digite o nome do animal: ");
                        String nomeAnimal = scanner.nextLine();

                        switch (tipoAnimal) {
                            case 1 ->
                                zooManager.adicionarAnimal(new Leao(nomeAnimal));
                            case 2 ->
                                zooManager.adicionarAnimal(new Elefante(nomeAnimal));
                            case 3 ->
                                zooManager.adicionarAnimal(new Papagaio(nomeAnimal));
                            default ->
                                System.out.println("Opção inválida!");
                        }
                    }

                    case 2 ->
                        zooManager.listarAnimais();

                    case 3 ->
                        zooManager.emitirSons();

                    case 4 ->
                        System.out.println("Saindo do sistema...");

                    default ->
                        System.out.println("Opção inválida. Tente novamente.");
                }

            } while (opcao != 4);
        }
    }
}
