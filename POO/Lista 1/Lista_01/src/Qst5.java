import java.util.Scanner;

public class Qst5 {
   static void resolucao(){
      int numero;
      int qtdNumeros;
      int maiorN = 0;
      int menorN = 0;
      int somaN = 0;

      Scanner leitor = new Scanner(System.in);

      for(qtdNumeros =0;;qtdNumeros++){
         System.out.println("Numero: ");
         numero = leitor.nextInt();
         if(numero != -1){
            somaN += numero;
            if(qtdNumeros == 0){
               maiorN = numero;
               menorN = numero;
            }else if(maiorN < numero){
               maiorN = numero;
            }else if(menorN > numero){
               menorN = numero;
            }
         }else{
            break;
         }
      }

      System.out.println("Quantidade de números: " + qtdNumeros + "\nMaior numero: " + maiorN + "\nMenor numero: " + menorN + "\nMédia: " + (somaN/qtdNumeros));

   }
}
