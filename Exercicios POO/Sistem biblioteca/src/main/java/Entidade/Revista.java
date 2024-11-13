
package Entidade;

public class Revista extends ItemBiblioteca {
    
    protected int mesPublicacao;
    protected int edicao;
    
    public Revista(String titulo, int codigo, int mesPublicacao, int edicao) {
        super(titulo, codigo);
        this.mesPublicacao = mesPublicacao;
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
            System.out.println("MÊs da publicação: \n" + mesPublicacao + "Edição: \n");
        
    }
    
}
