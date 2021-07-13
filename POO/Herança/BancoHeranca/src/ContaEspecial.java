public class ContaEspecial extends Conta {
    private double chequeEspecial;

    public ContaEspecial(int nroConta, int agencia, Pessoa titular){
        super(nroConta, agencia, titular);
        this.saldo = chequeEspecial+saldo;
    }

    public double getChequeEspecial(){
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial){
        this.chequeEspecial = chequeEspecial;
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= this.saldo && valor - this.saldo >= chequeEspecial){
           this.saldo -= valor;
           return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta conta){
        if(this.sacar(valor)){
           conta.depositar(valor);
           return true;
        }
        return false;
     }
}
