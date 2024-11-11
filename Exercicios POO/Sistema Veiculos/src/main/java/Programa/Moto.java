package Programa;

class Moto extends Veiculo {

    protected String getModelo;
    protected String getMarca;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void dirigir() {
        System.out.println("Dirigindo uma moto " + getMarca() + " do modelo " + getModelo() +".");
    }

    @Override
    public String getMarca() { 
        return marca; 
    }

    @Override
    public String getModelo() {
        return modelo;
    }

}
