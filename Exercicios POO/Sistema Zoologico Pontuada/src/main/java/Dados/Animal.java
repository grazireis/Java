package Dados;

public abstract class Animal {
    
    //Variavel dos animais que é o nome.
    protected String nome;
    
    
    public Animal(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public abstract void emitirSom();
}
