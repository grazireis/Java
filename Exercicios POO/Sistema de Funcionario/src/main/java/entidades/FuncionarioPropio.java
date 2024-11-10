package entidades;

public class FuncionarioPropio extends Funcionario {

    public FuncionarioPropio(String nome, double horasTrabalhadas, double valorHora) {
        super(nome, horasTrabalhadas, valorHora);
    }

    @Override
    public double caucularPagamento() {
        return horasTrabalhadas * valorHora;
    }
}
