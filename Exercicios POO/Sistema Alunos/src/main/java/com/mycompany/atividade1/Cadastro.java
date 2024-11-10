package com.mycompany.atividade1;

public class Cadastro {

    public static void main(String[] args) {
        //Objeto com dados ficticios
        Aluno aluno = new Aluno("Vinicius", 20, 10.0);
        
        //Exibir a informação do aluno
        aluno.exibirinformacoes();

        //Uma condicional para ver se o aluno esta aprovado ou não
        if (aluno.verificarAprovacao()) {
            System.out.println("O aluno esta aprovado!");
        } else {
            System.out.println("O aluno essta reprovado!");
        }
    }
}
