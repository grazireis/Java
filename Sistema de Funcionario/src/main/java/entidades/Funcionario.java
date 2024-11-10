package entidades;

public abstract class Funcionario {

    protected String nome;
    protected double horasTrabalhadas;
    protected double valorHora;

    public Funcionario(String nome, double horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public abstract double caucularPagamento();
}
