import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int opcao;
      ArrayList<ContaCorrente> contaCC = new ArrayList<ContaCorrente>();
      ArrayList<ContaPoupanca> contaCP = new ArrayList<ContaPoupanca>();
      ArrayList<ContaEmpresarial> contaPJ = new ArrayList<ContaEmpresarial>();
      ArrayList<ContaEspecial> contaESP = new ArrayList<ContaEspecial>();


      while(true){
         System.out.println("----- Menu -----\n1 - Criar Conta Corrente\n2 - Criar conta Especial\n3 - Criar Conta Poupanca\n4 - Criar Conta Empresarial\n5 - Extrato\n6 - Sacar\n7 - Depositar\n8 - Transferir\n0 - Sair");
         
         System.out.print("opcao: ");
         opcao = scan.nextInt();

         if(opcao == 0){
             break;
         }

            if(opcao == 1){
                //Criar conta
                System.out.println("Digite o nome do titular :");
                String nome = scan.next();
    
                System.out.println("Digite o CPF do titular: ");
                String cpf = scan.next();
    
                PessoaFisica titular = new PessoaFisica(nome, cpf);
    
                System.out.println("Digite o número da conta: ");
                int nroConta = scan.nextInt();
    
                System.out.println("Digite o número da agência: ");
                int agencia = scan.nextInt();
    
                ContaCorrente conta = new ContaCorrente(nroConta, agencia, titular);
                contaCC.add(conta);
                System.out.println("Conta Corrente criada com sucesso!\n");
            }else if(opcao == 2){
                System.out.println("Digite o nome do titular :");
                String nome = scan.next();
                System.out.println("Digite o CPF do titular: ");
                String cpf = scan.next();
                PessoaFisica titular = new PessoaFisica(nome, cpf);
    
                System.out.println("Digite o número da conta: ");
                int nroConta = scan.nextInt();
    
                System.out.println("Digite o número da agência: ");
                int agencia = scan.nextInt();
    
                ContaEspecial conta = new ContaEspecial(nroConta, agencia, titular);
                contaESP.add(conta);
                System.out.println("Conta Especial criada com sucesso!\n");
            }else if(opcao == 3){
                System.out.println("Digite o nome do titular :");
                String nome = scan.next();
                System.out.println("Digite o CPF do titular: ");
                String cpf = scan.next();
                PessoaFisica titular = new PessoaFisica(nome, cpf);

                System.out.println("Digite o número da conta: ");
                int nroConta = scan.nextInt();
    
                System.out.println("Digite o número da agência: ");
                int agencia = scan.nextInt();
    
                ContaPoupanca conta = new ContaPoupanca(nroConta, agencia, titular);
                contaCP.add(conta);
            }else if(opcao == 4){
                System.out.println("Digite o nome da Empresa :");
                String nome = scan.next();
                System.out.println("Digite o CNPJ da Empresa: ");
                String cnpj = scan.next();
                PessoaJuridica titular = new PessoaJuridica(nome, cnpj);

                System.out.println("Digite o número da conta: ");
                int nroConta = scan.nextInt();
    
                System.out.println("Digite o número da agência: ");
                int agencia = scan.nextInt();
    
                ContaEmpresarial conta = new ContaEmpresarial(nroConta, agencia, titular);
            }else if(opcao == 5){
                System.out.println("1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupanca\n4 - Conta Empresarial\n0 - Sair:");
                int op2 = scan.nextInt();
                if(op2 == 1){
                    Conta contaSelecionada = selecionarContaCC(contaCC);
	                if(contaSelecionada != null){
                        System.out.println("-- Dados da Conta --");
                        System.out.println("Nome titular: "+contaSelecionada.getTitular().getNome());
                        System.out.println("Numero conta: "+contaSelecionada.getNroConta());
                        System.out.println("Saldo R$"+contaSelecionada.getSaldo());
                        System.out.println("-------------------------------\n\n");
                    }else{
                        System.out.println("Conta nao encontrada. Tente novamente!");
                    }
                }else if(op2 == 2){
                    Conta contaSelecionada = selecionarContaESP(contaESP);
	                if(contaSelecionada != null){
                        System.out.println("-- Dados da Conta --");
                        System.out.println("Nome Empresa: "+contaSelecionada.getTitular().getNome());
                        System.out.println("Numero conta: "+contaSelecionada.getNroConta());
                        System.out.println("Saldo R$"+contaSelecionada.getSaldo());
                        System.out.println("-------------------------------\n\n");
                    }else{
                        System.out.println("Conta nao encontrada. Tente novamente!");
                    }
                }else if(op2 == 3){
                    Conta contaSelecionada = selecionarContaCP(contaCP);
	                if(contaSelecionada != null){
                        System.out.println("-- Dados da Conta --");
                        System.out.println("Nome titular: "+contaSelecionada.getTitular().getNome());
                        System.out.println("Numero conta: "+contaSelecionada.getNroConta());
                        System.out.println("Saldo R$"+contaSelecionada.getSaldo());
                        System.out.println("-------------------------------\n\n");
                    }else{
                        System.out.println("Conta nao encontrada. Tente novamente!");
                    }
                }else if(op2 == 4){
                    Conta contaSelecionada = selecionarContaPJ(contaPJ);
	                if(contaSelecionada != null){
                        System.out.println("-- Dados da Conta --");
                        System.out.println("Nome titular: "+contaSelecionada.getTitular().getNome());
                        System.out.println("Numero conta: "+contaSelecionada.getNroConta());
                        System.out.println("Saldo R$"+contaSelecionada.getSaldo());
                        System.out.println("-------------------------------\n\n");
                    }else{
                        System.out.println("Conta nao encontrada. Tente novamente!");
                    }
                }else{
                    break;
                }
            }else if(opcao == 6){
                System.out.println("1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupanca\n4 - Conta Empresarial\n0 - Sair:");
                int op2 = scan.nextInt();
                if(op2 == 1){
                    Conta contaSelecionada = selecionarContaCC(contaCC);
	                if(contaSelecionada != null){
                        System.out.println("Digite o valor do saque: ");
                        double valor = scan.nextDouble();
                        boolean retorno = contaSelecionada.sacar(valor);
                        if(retorno){
                           System.out.println("Saque realizado com sucesso!");
                        }else{
                           System.out.println("Erro ao realizar o saque.");
                        }
                    }else{
                        System.out.println("Conta não encontrada. Tente novamente!");
                    }
                }else if(op2 == 2){
                    Conta contaSelecionada = selecionarContaESP(contaESP);
	                if(contaSelecionada != null){
                        System.out.println("Digite o valor do saque: ");
                        double valor = scan.nextDouble();
                        boolean retorno = contaSelecionada.sacar(valor);
                        if(retorno){
                           System.out.println("Saque realizado com sucesso!");
                        }else{
                           System.out.println("Erro ao realizar o saque.");
                        }
                    }else{
                        System.out.println("Conta não encontrada. Tente novamente!");
                    }
                }else if(op2 == 3){
                    Conta contaSelecionada = selecionarContaCP(contaCP);
	                if(contaSelecionada != null){
                        System.out.println("Digite o valor do saque: ");
                        double valor = scan.nextDouble();
                        boolean retorno = contaSelecionada.sacar(valor);
                        if(retorno){
                           System.out.println("Saque realizado com sucesso!");
                        }else{
                           System.out.println("Erro ao realizar o saque.");
                        }
                    }else{
                        System.out.println("Conta não encontrada. Tente novamente!");
                    }
                }else if(op2 == 4){
                    Conta contaSelecionada = selecionarContaPJ(contaPJ);
	                if(contaSelecionada != null){
                        System.out.println("Digite o valor do saque: ");
                        double valor = scan.nextDouble();
                        boolean retorno = contaSelecionada.sacar(valor);
                        if(retorno){
                           System.out.println("Saque realizado com sucesso!");
                        }else{
                           System.out.println("Erro ao realizar o saque.");
                        }
                    }else{
                        System.out.println("Conta não encontrada. Tente novamente!");
                    }
                }else{
                    break;
                }
            }else if(opcao == 7){
                System.out.println("1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupanca\n4 - Conta Empresarial\n0 - Sair:");
                int op2 = scan.nextInt();
                if(op2 == 1){
                    Conta contaSelecionada = selecionarContaCC(contaCC);
	                if(contaSelecionada != null){
                        System.out.println("Digite o valor do deposito: ");
                        double valor = scan.nextDouble();
                        boolean retorno = contaSelecionada.depositar(valor);
                        if(retorno){
                           System.out.println("Deposito realizado com sucesso!");
                        }else{
                           System.out.println("Erro ao realizar o deposito.");
                        }
                    }else{
                        System.out.println("Conta não encontrada. Tente novamente!");
                    }
                }else if(op2 == 2){
                    Conta contaSelecionada = selecionarContaESP(contaESP);
	                if(contaSelecionada != null){
                        System.out.println("Digite o valor do deposito: ");
                        double valor = scan.nextDouble();
                        boolean retorno = contaSelecionada.depositar(valor);
                        if(retorno){
                           System.out.println("Deposito realizado com sucesso!");
                        }else{
                           System.out.println("Erro ao realizar o deposito.");
                        }
                    }else{
                        System.out.println("Conta não encontrada. Tente novamente!");
                    }
                }else if(op2 == 3){
                    Conta contaSelecionada = selecionarContaCP(contaCP);
	                if(contaSelecionada != null){
                        System.out.println("Digite o valor do deposito: ");
                        double valor = scan.nextDouble();
                        boolean retorno = contaSelecionada.depositar(valor);
                        if(retorno){
                           System.out.println("Deposito realizado com sucesso!");
                        }else{
                           System.out.println("Erro ao realizar o deposito.");
                        }
                    }else{
                        System.out.println("Conta não encontrada. Tente novamente!");
                    }
                }else if(op2 == 4){
                    Conta contaSelecionada = selecionarContaPJ(contaPJ);
	                if(contaSelecionada != null){
                        System.out.println("Digite o valor do deposito: ");
                        double valor = scan.nextDouble();
                        boolean retorno = contaSelecionada.depositar(valor);
                        if(retorno){
                           System.out.println("Deposito realizado com sucesso!");
                        }else{
                           System.out.println("Erro ao realizar o deposito.");
                        }
                    }else{
                        System.out.println("Conta não encontrada. Tente novamente!");
                    }
                }else{
                    break;
                }
            }else if(opcao == 8){
                System.out.println("1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupanca\n4 - Conta Empresarial\n0 - Sair:");
                int op2 = scan.nextInt();
                if(op2 == 1){
                    Conta c1 = selecionarContaCC(contaCC);
                    if(c1 != null){
                        System.out.println("Qual tipo de conta para transferir?\n1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupanca\n4 - Conta Empresarial\n0 - Sair:");
                        int op3 = scan.nextInt();
                        if(op3 == 1){
                            Conta c2 = selecionarContaCC(contaCC);
                            if(c2 != null){
                                System.out.println("Digite o valor da transferência: ");
                                double valor = scan.nextDouble();
              
                                boolean retorno = c1.transferir(valor, c2);
                                
                                if(retorno){
                                   System.out.println("Transferência realizada com sucesso.");
                                }else{
                                   System.out.println("Erro ao realizar a transferência. Tente novamente.");
                                }
                            }else{
                                System.out.println("Conta C2 não encontrada. Tente novamente.");
                            }
                        }else if(op3 == 2){
                            Conta c2 = selecionarContaESP(contaESP);
                            if(c2 != null){
                                System.out.println("Digite o valor da transferência: ");
                                double valor = scan.nextDouble();
              
                                boolean retorno = c1.transferir(valor, c2);
                                
                                if(retorno){
                                   System.out.println("Transferência realizada com sucesso.");
                                }else{
                                   System.out.println("Erro ao realizar a transferência. Tente novamente.");
                                }
                            }else{
                                System.out.println("Conta C2 não encontrada. Tente novamente.");
                            }
                        }else if(op3 == 3){
                            Conta c2 = selecionarContaCP(contaCP);
                            if(c2 != null){
                                System.out.println("Digite o valor da transferência: ");
                                double valor = scan.nextDouble();
              
                                boolean retorno = c1.transferir(valor, c2);
                                
                                if(retorno){
                                   System.out.println("Transferência realizada com sucesso.");
                                }else{
                                   System.out.println("Erro ao realizar a transferência. Tente novamente.");
                                }
                            }else{
                                System.out.println("Conta C2 não encontrada. Tente novamente.");
                            }
                        }else if(op3 == 4){
                            Conta c2 = selecionarContaPJ(contaPJ);
                            if(c2 != null){
                                System.out.println("Digite o valor da transferência: ");
                                double valor = scan.nextDouble();
              
                                boolean retorno = c1.transferir(valor, c2);
                                
                                if(retorno){
                                   System.out.println("Transferência realizada com sucesso.");
                                }else{
                                   System.out.println("Erro ao realizar a transferência. Tente novamente.");
                                }
                            }else{
                                System.out.println("Conta C2 não encontrada. Tente novamente.");
                            }
                        }else{
                            break;
                        }
                    }else{
                        System.out.println("Conta c1 não encontrada!");
                    }
                }else if(op2 == 2){
                    Conta c1 = selecionarContaESP(contaESP);
	                if(c1 != null){
                        System.out.println("Qual tipo de conta para transferir?\n1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupanca\n4 - Conta Empresarial\n0 - Sair:");
                        int op3 = scan.nextInt();
                        if(op3 == 1){
                            
                        }else if(op3 == 2){

                        }else if(op3 == 3){

                        }else if(op3 == 4){

                        }else{
                            break;
                        }
                    }else{
                        System.out.println("Conta c1 não encontrada!");
                    }
                }else if(op2 == 3){
                    Conta c1 = selecionarContaCP(contaCP);
	                if(c1 != null){
                        System.out.println("Qual tipo de conta para transferir?\n1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupanca\n4 - Conta Empresarial\n0 - Sair:");
                        int op3 = scan.nextInt();
                        if(op3 == 1){
                            
                        }else if(op3 == 2){

                        }else if(op3 == 3){

                        }else if(op3 == 4){

                        }else{
                            break;
                        }
                    }else{
                        System.out.println("Conta c1 não encontrada!");
                    }
                }else if(op2 == 4){
                    Conta c1 = selecionarContaPJ(contaPJ);
	                if(c1 != null){
                        System.out.println("Qual tipo de conta para transferir?\n1 - Conta Corrente\n2 - Conta Especial\n3 - Conta Poupanca\n4 - Conta Empresarial\n0 - Sair:");
                        int op3 = scan.nextInt();
                        if(op3 == 1){
                            
                        }else if(op3 == 2){

                        }else if(op3 == 3){

                        }else if(op3 == 4){

                        }else if(op3 == 5){

                        }else{
                            break;
                        }
                    }else{
                        System.out.println("Conta c1 não encontrada!");
                    }
                }else{
                    break;
                }
            }
        }   
    System.out.println("Sistema finalizando...");
    scan.close();
   }

   private static Conta selecionarContaCC(ArrayList<ContaCorrente> contaCC){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o número da conta: ");
    int nroConta = scan.nextInt();
    scan.close();
    for(int i=0; i<contaCC.size(); i++){
       Conta c = contaCC.get(i);
       if(c.getNroConta() == nroConta){
          return c;
       }
    }
    return null;
 }

   private static Conta selecionarContaCP(ArrayList<ContaPoupanca> contaCP){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o número da conta: ");
    int nroConta = scan.nextInt();
    scan.close();
    for(int i=0; i<contaCP.size(); i++){
         Conta c = contaCP.get(i);
         if(c.getNroConta() == nroConta){
            return c;
         }
    }  
    return null;
   }

    

 private static Conta selecionarContaPJ(ArrayList<ContaEmpresarial> contaPJ){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o número da conta: ");
    int nroConta = scan.nextInt();
    scan.close();
    for(int i=0; i<contaPJ.size(); i++){
       Conta c = contaPJ.get(i);
       if(c.getNroConta() == nroConta){
          return c;
       }
    }
    return null;
 }

 private static Conta selecionarContaESP(ArrayList<ContaEspecial> contaESP){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o número da conta: ");
    int nroConta = scan.nextInt();
    scan.close();
    for(int i=0; i<contaESP.size(); i++){
       Conta c = contaESP.get(i);
       if(c.getNroConta() == nroConta){
          return c;
       }
    }
    return null;
 }
}