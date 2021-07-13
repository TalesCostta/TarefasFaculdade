public class ContaCorrente extends Conta{

    public ContaCorrente(int nroConta, int agencia, Pessoa titular){
        super(nroConta, agencia, titular);
        this.saldo=0.0;
    }
}