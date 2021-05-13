import java.util.Scanner;

public class Qst3{

    static int fibo(int numero){
        if(numero < 2){
            return numero;
        }else{
            return fibo(numero - 1) + fibo(numero - 2);
        }
    }

    public void resolucao(){
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero: ");
        numero = leitor.nextInt();
        for(int i = 0; i<numero; i++){
            System.out.println("Numero ( " + i + " ): " + Qst3.fibo(i) + "\t");
        }

    }
}