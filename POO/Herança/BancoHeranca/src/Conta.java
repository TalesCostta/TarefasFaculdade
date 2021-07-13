public class Conta implements Comparable<Conta>{
   protected int nroConta;
    protected int agencia;
    protected Pessoa titular;
    protected double saldo;
 
    public Conta(int nroConta, int agencia, Pessoa titular){
       this.nroConta = nroConta;
       this.agencia = agencia;
       this.titular = titular;
       this.saldo = 0.0;
    }
 
    public double getSaldo(){
       return this.saldo;
    }
 
    public int getNroConta() {
       return this.nroConta;
    }
 
    public void setNroConta(int nroConta) {
       this.nroConta = nroConta;
    }
 
    public int getAgencia() {
       return this.agencia;
    }
 
    public void setAgencia(int agencia) {
       this.agencia = agencia;
    }
 
    public Pessoa getTitular() {
       return this.titular;
    }
 
    public void setTitular(Pessoa titular) {
       this.titular = titular;
    }
 
 
    public boolean depositar(double valor){
       if(valor > 0){
          this.saldo += valor;
          return true;
       }
       return false;
    }
    
    public boolean sacar(double valor){
       if(valor > 0 && valor <= this.saldo){
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
 
    @Override
    public String toString() {
       return "NroConta: "+this.nroConta+" , Titular: "+this.titular.getNome()+", Saldo: R$"+this.saldo;
    }
 
    @Override
    public boolean equals(Object obj) {
       if(obj.getClass() == Conta.class){
          Conta conta = (Conta) obj;
          if(conta.getNroConta() == this.nroConta){
             return true;
          }
       }
       return false;
    }
 
    @Override
    public int compareTo(Conta c) {
       if(this.nroConta > c.getNroConta()) return 1;
       if(this.nroConta < c.getNroConta()) return -1;
       return 0;
    }
 
 }
 