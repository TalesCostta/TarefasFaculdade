import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        PilhaDinamicaImpar pilhaImpar = new PilhaDinamicaImpar();
        PilhaDinamicaPar pilhaPar = new PilhaDinamicaPar();
        int valor = 1;
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog("Valor: (0 para sair)"));
            if(valor < -127 || valor > 128){
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }else{
                if(valor%2 == 0 && valor!=0){
                    pilhaPar.inserir(valor);
                }else if(valor%2 != 0 && valor!=0){
                    pilhaImpar.inserir(valor);
                }
            }
        }while(valor != 0);

        while(!pilhaImpar.vazia() || !pilhaPar.vazia()){
            if(!pilhaImpar.vazia()){
                System.out.println("Pilha Impar: " + pilhaImpar.retirar());
                if(!pilhaPar.vazia()){
                    System.out.println("Pilha Par: " + pilhaPar.retirar());
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        
        if(!pilhaImpar.vazia()){
            System.out.println("Soubrou " + pilhaImpar.tamanho + " elementos na pilha Impar");
            while(!pilhaImpar.vazia()){
                System.out.println("Pilha Impar: " + pilhaImpar.retirar());
            }
        }else if(!pilhaPar.vazia()){
            System.out.println("Soubrou " + pilhaPar.tamanho + " elementos na pilha Par");
            while(!pilhaPar.vazia()){
                System.out.println("Pilha Par: " + pilhaPar.retirar());
            }
        }
    }
}
