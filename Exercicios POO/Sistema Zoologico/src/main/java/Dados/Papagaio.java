package Dados;

public class Papagaio extends Animal{
    
    public Papagaio(String nome){
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Quero café! ");
    }
    
}
