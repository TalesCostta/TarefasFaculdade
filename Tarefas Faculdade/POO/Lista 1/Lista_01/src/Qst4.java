import java.util.Scanner;

public class Qst4 {
   static void resolucao(){
      int numero;
      int contador = 0;
      int contador2 = 0;
      int vetor[] = new int[5];
      int vetorInvertido[] = new int[5];

      Scanner leitor = new Scanner(System.in);

      for(contador = 0; contador<5; contador++){
         System.out.println("Digite o numero " + (contador) + ":");
         numero = leitor.nextInt();
         vetor[contador] = numero;
      }

      for(contador = 0, contador2 = 4; contador<5 && contador2 >= 0; contador++, contador2--){
         vetorInvertido[contador] = vetor[contador2];
      }

      for(int i = 0; i<5; i++){
         System.out.println("Vetor Normal: " + vetor[i] + " | Vetor invertido: " + vetorInvertido[i]);
      }
   }
}