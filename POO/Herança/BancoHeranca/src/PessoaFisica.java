public class PessoaFisica extends Pessoa{
    public String cpf;

    public PessoaFisica(String nome, String cpf){
        super(nome, cpf);
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(){
        this.cpf = cpf;
    }
}