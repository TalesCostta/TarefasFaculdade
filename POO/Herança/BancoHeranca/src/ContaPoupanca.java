public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(int nroConta, int agencia, Pessoa titular){
        super(nroConta, agencia, titular);
        this.saldo *= rendimento;
    }

    public double getRendimento(){
        return rendimento;
    }
    
    public void setRendimento(){
        this.rendimento += 0.5;
    }

}
