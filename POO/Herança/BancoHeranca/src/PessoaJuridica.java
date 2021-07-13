public class PessoaJuridica extends Pessoa{
    public String cnpj;

    public PessoaJuridica(String nome, String cnpj){
        super(nome, cnpj);
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}