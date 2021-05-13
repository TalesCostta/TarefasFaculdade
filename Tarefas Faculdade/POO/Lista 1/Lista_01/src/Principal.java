import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {        
        Scanner leitor = new Scanner(System.in);
        int op;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da Questão (0 para sair): "));
            switch(op){
                case 1:
                    Qst1 preco = new Qst1();
                    preco.resolucao();
                break;
                case 2:
                    Qst2 notas = new Qst2();
                    notas.resolucao();
                break;
                case 3:
                    Qst3 fibo = new Qst3();
                    fibo.resolucao();
                break;
                case 4:
                    Qst4 vetor = new Qst4();
                    vetor.resolucao();
                break;
                case 5:
                    Qst5 numeros = new Qst5();
                    numeros.resolucao();
                break;
            }
        }while(op!=0);
    }
}
