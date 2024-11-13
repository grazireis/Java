package Entidade;

public abstract class ItemBiblioteca {
    
    protected String titulo;
    protected int codigo;
    
    public ItemBiblioteca (String titulo, int codigo){
        this.titulo = titulo;
        this.codigo = codigo;
    }
    
    public abstract void exibirDetalhes();
    
    public void exibirInfoBasica(){
        System.out.println("Titulo: \n" + titulo + "Código: " + codigo);
    }
}
