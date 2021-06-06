import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
      
      Variaveis var = new Variaveis();
      //Imprimir acima da diagonal principal
      JOptionPane.showMessageDialog(null, "Laço For");
      for(var.linha = 0; var.linha <= 9; var.linha++){
        for(var.coluna = 0; var.coluna <= 9; var.coluna++){
          var.tabela[var.linha][var.coluna] = var.coluna + 1;
        }
      };
      
      JOptionPane.showMessageDialog(null, "Acima da Diagonal Principal!");
      for(var.linha = 0; var.linha <= 9; var.linha++){
        for(var.coluna = 0; var.coluna <= 9; var.coluna++){
          if(var.coluna>var.linha){
            System.out.print((var.linha+1) + "-" + var.tabela[var.linha][var.coluna] + " ");
          }else{
              System.out.print("     ");
          }
        }
        System.out.print("\n");
      };

      JOptionPane.showMessageDialog(null, "Laço While");
      var.linha = 0;
      var.coluna = 0;

      while(var.linha<=9){
        while(var.coluna<=9){
          var.tabela[var.linha][var.coluna] = var.coluna + 1;
          var.coluna+=1;
        }
        var.coluna=1;
        var.linha+=1;
      }

      JOptionPane.showMessageDialog(null, "Acima da Diagonal Principal!");
      var.linha = 0;
      var.coluna = 0;
      while(var.linha<=9){
        while(var.coluna<=9){
          if(var.coluna>var.linha){
            System.out.print((var.linha+1) + "-" + var.tabela[var.linha][var.coluna] + " ");
          }else{
            System.out.print("     ");
          }
          var.coluna+=1;
        }
        var.linha+=1;
        var.coluna=1;
        System.out.print("\n");
      }

      JOptionPane.showMessageDialog(null, "Laço Do-While");
      var.linha = 0;
      var.coluna = 0;

      do{
        do{
          var.tabela[var.linha][var.coluna] = var.coluna + 1;
          var.coluna+=1;
        }while(var.coluna<=9);
        var.coluna=1;
        var.linha+=1;
      }while(var.linha<=9);

      JOptionPane.showMessageDialog(null, "Acima da Diagonal Principal!");
      var.linha = 0;
      var.coluna = 0;
      do{
        do{
          if(var.coluna>var.linha){
            System.out.print((var.linha+1) + "-" + var.tabela[var.linha][var.coluna] + " ");
          }else{
            System.out.print("     ");
          }
          var.coluna+=1;
        }while(var.coluna<=9);
        var.linha+=1;
        var.coluna=1;
        System.out.print("\n");
      }while(var.linha<=9);
    }
}
