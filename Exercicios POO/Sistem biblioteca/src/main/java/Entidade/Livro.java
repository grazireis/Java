package Entidade;

public class Livro extends ItemBiblioteca{

    protected String autor;
    protected int numPag;
    
    public Livro(String titulo, int codigo, String autor, int numPag) {
        super(titulo, codigo);
        this.autor = autor;
        this.numPag = numPag;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Autor do livro: \n" + autor + "Número de pág: \n");
    }
    
    public int getNumPag(){
        return numPag;
    }
}
