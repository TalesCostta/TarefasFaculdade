public class ContaEmpresarial extends Conta{
    public ContaEmpresarial(int nroConta, int agencia, Pessoa titular){
        super(nroConta, agencia, titular);
        this.saldo = 0.0;
    }
}
