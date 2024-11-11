package Programa;

public class Programa {

    public static void main(String[] args) {
        Veiculo carro = new Carro("BMW", "X1");
        Veiculo moto = new Moto("BMW", "S1000RR");

        carro.dirigir();
        moto.dirigir();
    }
}
