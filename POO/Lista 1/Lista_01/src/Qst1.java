import java.util.Scanner;

public class Qst1 {
    public void resolucao(){
        Scanner leitor = new Scanner(System.in);
        
        float valorGasolina;
        float valorEtanol;
            
        System.out.println("Digite o valor da Gasolina: ");
        valorGasolina = leitor.nextFloat();
        System.out.println("Valor do Etanol: ");
        valorEtanol = leitor.nextFloat();
            
        if(valorEtanol/valorGasolina <= 0.7){
            System.out.println("Abasteça com Etanol!!");
        }else{
        System.out.println("Abasteça com Gasolina!!");
    }                
    }
}
