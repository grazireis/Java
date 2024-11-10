package app;

import Entidades.Conta;
import Entidades.ContaEspecial;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            Conta conta;
            
            System.out.print("Informe o número da conta: ");
            int numero = sc.nextInt();
            
            System.out.print("Informe o nome do titular da conta: ");
            sc.nextLine();  // Consumir nova linha
            String titular = sc.nextLine();
            
            System.out.print("Informe se há depósito inicial (y/n)? ");
            char resposta = sc.next().charAt(0);
            
            if (resposta == 'y') {
                System.out.print("Informe o valor do depósito inicial: ");
                double depositoInicial = sc.nextDouble();
                System.out.print("Conta Especial (y/n)? ");
                char especial = sc.next().charAt(0);
                if (especial == 'y') {
                    System.out.print("Informe o limite de empréstimo: ");
                    double limiteEmprestimo = sc.nextDouble();
                    conta = new ContaEspecial(numero, titular, depositoInicial, limiteEmprestimo);
                } else {
                    conta = new Conta(numero, titular, depositoInicial);
                }
            } else {
                conta = new Conta(numero, titular);
            }

            System.out.println();
            System.out.println("Dados da conta: ");
            System.out.println(conta);
            
            System.out.println();
            System.out.print("Informe o valor do depósito: ");
            double valorDeposito = sc.nextDouble();
            conta.deposito(valorDeposito);
            System.out.println("Dados da conta atualizados: ");
            System.out.println(conta);
            
            System.out.println();
            System.out.print("Informe o valor do saque: ");
            double valorSaque = sc.nextDouble();
            conta.saque(valorSaque);
            System.out.println("Dados da conta atualizados: ");
            System.out.println(conta);
            
            if (conta instanceof ContaEspecial contaEspecial) {
                System.out.println();
                System.out.print("Deseja realizar um empréstimo (y/n)? ");
                char emprestimo = sc.next().charAt(0);
                if (emprestimo == 'y') {
                    System.out.print("Informe o valor do empréstimo: ");
                    double valorEmprestimo = sc.nextDouble();
                    contaEspecial.emprestimo(valorEmprestimo);
                    System.out.println("Dados da conta após empréstimo: ");
                    System.out.println(contaEspecial);
                }
            }
        }
    }
}
