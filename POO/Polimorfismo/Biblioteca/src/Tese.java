public class Tese extends Publicacao{
    private int numeroPaginas;
    private String resumo;
    private String dataDefesa;

    public Tese(String titulo, String dataPublicacao, Autor autor, int numeroPaginas, String resumo, String dataDefesa, double valorMulta) {
        super(titulo, dataPublicacao, valorMulta);
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        super.adicionarAutor(autor);
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }
  
    public void setNumeroPaginas(int nroPaginas) {
        this.numeroPaginas = nroPaginas;
    }
  
    public String getResumo() {
        return this.resumo;
    }
  
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
  
    public String getDataDefesa() {
        return this.dataDefesa;
    }

    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }
}
