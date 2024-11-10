package app;

import entidades.Funcionario;
import entidades.FuncionarioPropio;
import entidades.FuncionarioTercerizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Funcionario> funcionarios = new ArrayList<>();
            
            System.out.println("Digite o número de funcionários:");
            int N = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer
            
            for (int i = 0; i < N; i++) {
                System.out.print("Tipo de funcionário (Próprio/Tercerizado): ");
                String tipo = scanner.nextLine();
                
                System.out.print("Nome do funcionário: ");
                String nome = scanner.nextLine();
                
                System.out.print("Digite suas horas trabalhadas: ");
                double horasTrabalhadas = scanner.nextDouble();
                
                System.out.print("Digite o valor por hora: ");
                double valorHora = scanner.nextDouble();
                scanner.nextLine();  // Limpar o buffer
                
                if (tipo.equalsIgnoreCase("próprio")) {
                    funcionarios.add(new FuncionarioPropio(nome, horasTrabalhadas, valorHora));
                } else if (tipo.equalsIgnoreCase("tercerizado")) {
                    System.out.print("Despesa Adicional: ");
                    double despesaAdicional = scanner.nextDouble();
                    funcionarios.add(new FuncionarioTercerizado(nome, horasTrabalhadas, valorHora, despesaAdicional));
                } else {
                    System.out.println("Tipo de funcionário inválido!");
                    i--;  // Decrementar para tentar novamente
                }
                scanner.nextLine();  // Limpar o buffer
            }
            
            System.out.println("\nPagamentos dos Funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.printf("Nome: %s, Pagamento: R$ %.2f%n", funcionario.getNome(), funcionario.caucularPagamento());
            }
            scanner.close();
        }
    }
}
