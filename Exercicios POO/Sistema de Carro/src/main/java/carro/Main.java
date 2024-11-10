/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package carro;

/**
 *
 * @author nicol
 */
public class Main {
    public static void main(String[] args) {
        // Obtendo a instância única do Carro
        Carro carro1 = Carro.getInstancia();
        Carro carro2 = Carro.getInstancia();

        // Verificando que ambas as instâncias são as mesmas
        System.out.println("Instâncias são iguais? " + (carro1 == carro2)); // True

        // Modificando as propriedades do carro usando uma instância
        carro1.setModelo("Toyota Corolla");
        carro1.setCor("Rosa");

        // Exibindo informações do carro
        carro1.exibirInfo(); // Modelo: Toyota Corolla, Cor: Preto
        carro2.exibirInfo(); // Mesmo carro com as mesmas informações
    }
}