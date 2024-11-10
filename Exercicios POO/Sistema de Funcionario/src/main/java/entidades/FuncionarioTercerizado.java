package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioTercerizado extends Funcionario {

    protected double despesaAdicional;

    public FuncionarioTercerizado(String nome, double horasTrabalhadas, double valorHora, double despesaAdicional) {
        super(nome, horasTrabalhadas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double caucularPagamento() {
        double pagamentoBase = horasTrabalhadas * valorHora;
        double bonus = despesaAdicional * 1.1;
        return pagamentoBase + bonus;
    }

    Scanner scanner = new Scanner(System.in);
    List<Funcionario> funcionarios = new ArrayList<>();

}
