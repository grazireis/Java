package com.mycompany.atividade1;

public class Aluno {

    //Atributos
    private final String nome;
    private final int idade;
    private final double nota;

    //Contrutor
    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    //Metodo get permite que o valor da variável seja retornado mas sem permitir modificações diretamente.
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }
    
    //Metodo para mostar as informações
    public void exibirinformacoes(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Idade:" + this.idade);
        System.out.println("Média:" + this.nota);
    }
    
    //Metodo boolean para verificar aprovação
    public boolean verificarAprovacao(){
    return this.nota >= 7.0;
    }
    
}
