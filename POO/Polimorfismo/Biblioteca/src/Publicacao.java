import java.util.ArrayList;

public abstract class Publicacao {
    private String titulo;
    private String dataPublicacao;
    private ArrayList<Autor> autor;
    private ArrayList<Publicacao> referencia;
    private boolean disponivel;
    private double valorMulta;
 
    public Publicacao(String titulo, String dataPublicacao, double valorMulta) {
       this.titulo = titulo;
       this.dataPublicacao = dataPublicacao;
       this.autor = new ArrayList<Autor>();
       this.referencia = new ArrayList<Publicacao>();
       this.disponivel = true;
       this.valorMulta = valorMulta;
    }
 
    public String getTitulo() {
       return this.titulo;
    }
 
    public void setTitulo(String titulo) {
       this.titulo = titulo;
    }
 
    public String getDataPublicacao() {
       return this.dataPublicacao;
    }
 
    public void setDataPublicacao(String dataPublicacao) {
       this.dataPublicacao = dataPublicacao;
    }
 
    public boolean adicionarReferencia(Publicacao publicacao){
       this.referencia.add(publicacao);
       return true;
    }
 
    public boolean removerReferencia(Publicacao publicacao){
       this.referencia.remove(publicacao);
       return true;
    }
 
    public ArrayList<Autor> getAutor() {
       return this.autor;
    }
 
    public void setAutor(ArrayList<Autor> autor) {
       this.autor = autor;
    }
 
    public boolean adicionarAutor(Autor autor){
       this.autor.add(autor);
       return true;
    }
 
    public boolean removerAutor(Autor autor){
       this.autor.remove(autor);
       return true;
    }
 
    public boolean isDisponivel(){
       return this.disponivel;
    }
 
    public void emprestar(){
       this.disponivel = false;
    }
 
    public void devolver(){
       this.disponivel = true;
    }
 
    public double getValorMulta() {
       return this.valorMulta;
    }
 
    public void setValorMulta(double valorMulta) {
       this.valorMulta = valorMulta;
    }
}