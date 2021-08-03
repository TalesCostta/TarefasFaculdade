public class Emprestimo {
   private int id;
   private Usuario user;
   private Publicacao publicacao;
   private String dataEmprestimo;
   private String dataDevolucao;
   private double valorMulta;
   private int quantidadeRenovacoes;

   public Emprestimo(Usuario user, Publicacao publicacao){
        this.id+=1;
        this.user = user;
        this.publicacao = publicacao;
        this.quantidadeRenovacoes = 0;
        this.valorMulta = 0.00;    
   }

   public void calcularMulta() {
        this.valorMulta = (this.quantidadeRenovacoes - this.user.getMaxRenovacao()) * this.publicacao.getValorMulta();
   }

   public int getId(){
        return this.id;
    }

    public Usuario getUsuario() {
        return this.user;
    }

    public Publicacao getPublicacao() {
        return this.publicacao;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorMulta() {
        return this.valorMulta;
    }

    public int getQuantidadeRenovacoes() {
        return this.quantidadeRenovacoes;
    }
}
