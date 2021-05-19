import javax.swing.JOptionPane;

public class ContaCorrente {
   String nomeUsuario[] = new String[2];
   String cpf[] =  new String[2];
   String cep[] = new String[2];
   String sexo[] = new String[2];
   String email[] = new String[2];
   double saldo[] = new double[2];
   double saldoInicial;
   String nomeLogin;
   double valor = 0;

   public void Saque(int controle){
      saldo[controle] -= valor;
   }

   public void Tranferencia(int controle){
      if(controle == 0){
         saldo[0] -= valor;
         saldo[1] += valor;
      }else{
         saldo[1] -= valor;
         saldo[0] += valor;
      }
   }

   public void Deposito(int controle){
      saldo[controle] += valor;
   }
}
