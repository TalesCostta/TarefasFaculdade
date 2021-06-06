import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
      //Imprimir toda matriz
      Variaveis var = new Variaveis();

      JOptionPane.showMessageDialog(null, "Laço For");
      for(var.linha = 0; var.linha <= 9; var.linha++){
        for(var.coluna = 0; var.coluna <= 9; var.coluna++){
          var.tabela[var.linha][var.coluna] = var.coluna + 1;
        }
      };

      JOptionPane.showMessageDialog(null, "Todos!");
      for(var.linha = 0; var.linha <= 9; var.linha++){
        for(var.coluna = 0; var.coluna <= 9; var.coluna++){
          System.out.print((var.linha+1) + "-" + var.tabela[var.linha][var.coluna] + " ");
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

      var.linha = 0;
      var.coluna = 0;
      JOptionPane.showMessageDialog(null, "Todos!");
      while(var.linha<=9){
        while(var.coluna<=9){
          System.out.print((var.linha+1) + "-" + var.tabela[var.linha][var.coluna] + " ");
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

      var.linha = 0;
      var.coluna = 0;
      JOptionPane.showMessageDialog(null, "Todos!");
      do{
        do{
          System.out.print((var.linha+1) + "-" + var.tabela[var.linha][var.coluna] + " ");
          var.coluna+=1;
        }while(var.coluna<=9);
        var.linha+=1;
        var.coluna=1;
        System.out.print("\n");
      }while(var.linha<=9);
    }
}
