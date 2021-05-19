import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaCorrente banco = new ContaCorrente();
        int op = 0;
        int id = 0;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "--- BANCO ---\n1 - Cadastrar\n2 - Logar\n3 - Sair"));
            switch(op){
                case 1:
                    if(id!=2){
                        banco.nomeUsuario[id] = JOptionPane.showInputDialog(null, "Nome: ");
                        banco.cpf[id] = JOptionPane.showInputDialog(null, "CPF");
                        banco.cep[id] = JOptionPane.showInputDialog(null, "CEP:");
                        banco.sexo[id] = JOptionPane.showInputDialog(null, "Sexo:");
                        banco.email[id] = JOptionPane.showInputDialog(null, "Email:");
                        banco.saldo[id] = 0;
                        JOptionPane.showMessageDialog(null, "Conta cadastrada!\nSaldo Inicial = " + banco.saldoInicial);
                        id += 1;
                    }else{
                        JOptionPane.showMessageDialog(null, "Numero máximo de contas cadastradas!");
                    }
                break;
                case 2:
                    banco.nomeLogin = JOptionPane.showInputDialog(null, "Nome:");
                    if(banco.nomeLogin.equals(banco.nomeUsuario[0])){
                        int controle = 0;
                        do{
                            op = Integer.parseInt(JOptionPane.showInputDialog(null, "--- BANCO ---\nNome: "+ banco.nomeUsuario[controle] + " | Saldo: " + banco.saldo[controle] + "\n 1 - Saque \n2 - Tranferencia \n3 - Deposito \n4 - Sair"));
                            switch(op){
                                case 1:
                                    banco.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor para saque:"));
                                    if(banco.valor > 0 && banco.saldo[controle] > banco.valor){
                                        banco.Saque(controle);
                                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Saque inválido!");
                                    }
                                break;
                                case 2:
                                    String cpfDestino = JOptionPane.showInputDialog(null, "Digite o CPF destino:");
                                    if(cpfDestino == banco.cpf[controle]){
                                        JOptionPane.showMessageDialog(null, "CPF inválido!");
                                    }else{
                                        banco.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor transferência:"));
                                        if(banco.valor > 0 && banco.valor <= banco.saldo[controle]){
                                            banco.Tranferencia(controle);
                                            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
                                        }else{
                                            JOptionPane.showMessageDialog(null, "Valor Inválido!");
                                        }
                                    }
                                break;
                                case 3:
                                    banco.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor para depósito:"));
                                    if(banco.valor <=0){
                                        JOptionPane.showMessageDialog(null, "Valor Inválido!");
                                    }else{
                                        banco.Deposito(controle);
                                        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                                    }
                                break;
                            }
                        }while(op != 4);
                    }else if(banco.nomeLogin.equals(banco.nomeUsuario[1])){
                        int controle = 1;
                        do{
                            op = Integer.parseInt(JOptionPane.showInputDialog(null, "--- BANCO ---\nNome: "+ banco.nomeUsuario[controle] + " | Saldo: " + banco.saldo[controle] + "\n 1 - Saque \n2 - Tranferencia \n3 - Deposito \n4 - Sair"));
                            switch(op){
                                case 1:
                                    banco.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor para saque:"));
                                    if(banco.valor > 0 && banco.saldo[controle] > banco.valor){
                                        banco.Saque(controle);
                                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Saque inválido!");
                                    }
                                break;
                                case 2:
                                    String cpfDestino = JOptionPane.showInputDialog(null, "Digite o CPF destino:");
                                    if(cpfDestino == banco.cpf[controle]){
                                        JOptionPane.showMessageDialog(null, "CPF inválido!");
                                    }else{
                                        banco.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor transferência:"));
                                        if(banco.valor > 0 && banco.valor <= banco.saldo[controle]){
                                            banco.Tranferencia(controle);
                                            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso!");
                                        }else{
                                            JOptionPane.showMessageDialog(null, "Valor Inválido!");
                                        }
                                    }
                                break;
                                case 3:
                                    banco.valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor para depósito:"));
                                    if(banco.valor <=0){
                                        JOptionPane.showMessageDialog(null, "Valor Inválido!");
                                    }else{
                                        banco.Deposito(controle);
                                        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                                    }
                                break;
                            }
                        }while(op != 4);
                    }else{
                        JOptionPane.showMessageDialog(null, "Usuario não cadastrado!");
                    }
                break;
            }
        }while(op!=3);
    }
}
