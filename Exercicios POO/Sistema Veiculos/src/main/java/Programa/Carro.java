package Programa;

class Carro extends Veiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo um carro " + getMarca() + " do modelo " + getModelo() + ".");
    }

    @Override
    public String getModelo() {
        return modelo; 
    }

    @Override
    public String getMarca() {
        return marca;
    }
}

