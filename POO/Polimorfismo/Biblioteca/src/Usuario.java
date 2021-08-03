public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private int maximoEmprestimos;
    private int maximoRenovacao;
    private int quantidadeEmprestimos;

    public Usuario(String nome, String telefone, String email, int maximoEmprestimos, int maximoRenovacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.maximoEmprestimos = maximoEmprestimos;
        this.maximoRenovacao = maximoRenovacao;
        this.quantidadeEmprestimos = 0;
    }
  
    public String getNome() {
        return this.nome;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public String getTelefone() {
       return this.telefone;
    }
  
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
  
    public String getEmail() {
        return this.email;
    }
  
    public void setEmail(String email) {
        this.email = email;
    }
  
    public boolean realizarEmprestimo(){
        if(this.quantidadeEmprestimos == 3){
            return false;
        }else{
            this.quantidadeEmprestimos++;
            return true;
        }
    }

    public boolean devolverEmprestimo(){
        this.quantidadeEmprestimos--;
        return true;
    }
  
    public int getMaxEmprestimos() {
        return this.maximoEmprestimos;
    }
  
    public int getMaxRenovacao() {
        return this.maximoRenovacao;
    }
}
