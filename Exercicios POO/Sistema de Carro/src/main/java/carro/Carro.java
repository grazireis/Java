/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package carro;

/**
 *
 * @author nicol
 */
// Classe Singleton Carro
public class Carro {

    // Instância única do Singleton
    private static Carro instanciaUnica;

    // Atributos do carro
    private String modelo;
    private String cor;

    // Construtor privado para impedir que seja instanciado externamente
    private Carro() {
        this.modelo = "Modelo Padrão";
        this.cor = "Cor Padrão";
    }

    // Método público estático para obter a instância única
    public static Carro getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Carro();
        }
        return instanciaUnica;
    }

    // Métodos para modificar as propriedades do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Métodos para exibir as propriedades do carro
    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    // Método para exibir as informações do carro
    public void exibirInfo() {
        System.out.println("Modelo: " + this.modelo + ", Cor: " + this.cor);
    }
}
