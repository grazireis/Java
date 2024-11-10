/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class ContaEspecial extends Conta {
    private double limiteEmprestimo;

    public ContaEspecial(int numero, String titular, double saldoInicial, double limiteEmprestimo) {
        super(numero, titular, saldoInicial);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void realizarEmprestimo(double quantia) {
        double taxa = 10.0;
        if (quantia <= limiteEmprestimo) {
            saldo += quantia - taxa;
            System.out.println("Empréstimo de " + quantia + " realizado com sucesso. Taxa de " + taxa + " foi aplicada.");
        } else {
            System.out.println("Valor do empréstimo excede o limite.");
        }
    }

    public void definirLimite(double novoLimite) {
        this.limiteEmprestimo = novoLimite;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void emprestimo(double valorEmprestimo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
