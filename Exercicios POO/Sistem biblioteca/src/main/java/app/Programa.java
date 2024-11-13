package app;

import Entidade.ItemBiblioteca;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ItemBiblioteca> Item = new ArrayList<>();
        
        int totalPaginasLivro = 0;

        System.out.print("Quantos itens deseja cadastrar na biblioteca: ");
        int numItem = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numItem; i++) {
            
            System.out.print("Digite o tipo de item (Livro/Revista): ");
            String tipoItem = scanner.nextLine();

            System.out.print("Digite o título do item: ");
            String titulo = scanner.nextLine();
            
            
            System.out.print("Digite o código do item: ");
            String codigo = scanner.nextLine();
        }
        
        if(tipoItem.equalsIgnoreCase("Livro")){
            System.out.print("Informe o nome do autor:");
            String autor = scanner.nextLine();
            
            System.out.print("Informe o numero de paginas:");
        }

    }
}
