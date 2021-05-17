import java.util.Scanner;

public class Qst2 {
    public void resolucao(){
        Scanner leitor = new Scanner(System.in);
        int saque;
                    
        int quantidadeNotas50;
        int quantidadeNotas10;
        int quantidadeNotas5;
        int quantidadeNotas1;

        System.out.println("Valor do saque: ");
        saque = leitor.nextInt();

        quantidadeNotas50 = saque/50;
        saque -= quantidadeNotas50*50;
        quantidadeNotas10 = saque/10;
        saque -= quantidadeNotas10*10;
        quantidadeNotas5 = saque/5;
        saque -= quantidadeNotas5*5;
        quantidadeNotas1 = saque;

        System.out.println("Numero de notas de 50: " + quantidadeNotas50 + "\nNotas de 10: " + quantidadeNotas10 + "\nNotas de 5: " + quantidadeNotas5 + "\n Notas de 1: " + quantidadeNotas1);
                    
    }
}
