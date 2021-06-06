import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
      //Imprimir diagonal principal
      Variaveis var = new Variaveis();

      JOptionPane.showMessageDialog(null, "Laço For");
      for(var.linha = 0; var.linha <= 9; var.linha++){
        for(var.coluna = 0; var.coluna <= 9; var.coluna++){
          var.tabela[var.linha][var.coluna] = var.coluna + 1;
        }
      }

      JOptionPane.showMessageDialog(null, "Diagonal Principal!");
      for(var.linha = 0; var.linha <= 9; var.linha++){
        for(var.coluna = 0; var.coluna <= 9; var.coluna++){
          if(var.linha == var.coluna){
            System.out.print((var.linha+1) + "-" + var.tabela[var.linha][var.coluna]);
          }else{
            System.out.print("  ");
          }
        }
        System.out.print("\n");
      }

      JOptionPane.showMessageDialog(null, "Laço While");
      var.linha=0;
      var.coluna=0;
      while(var.linha<=9){
        while(var.coluna<=9){
          var.tabela[var.linha][var.coluna] = var.coluna + 1;
          var.coluna++;
        }
        var.linha++;
        var.coluna=0;
      }

      JOptionPane.showMessageDialog(null, "Diagonal Principal!");
      var.linha=0;
      var.coluna=0;
      while(var.linha<=9){
        while(var.coluna<=9){
          if(var.linha == var.coluna){
            System.out.print((var.linha+1) + "-" + var.tabela[var.linha][var.coluna]);
          }else{
            System.out.print("  ");
          }
          var.coluna++;
        }
        var.linha++;
        var.coluna=0;
        System.out.print("\n");
      }

      JOptionPane.showMessageDialog(null, "Laço Do-While");
      var.linha=0;
      var.coluna=0;
      do{
        do{
          var.tabela[var.linha][var.coluna] = var.coluna + 1;
          var.coluna++;
        }while(var.coluna<=9);
        var.linha++;
        var.coluna=0;
      }while(var.linha<=9);

      JOptionPane.showMessageDialog(null, "Diagonal Principal!");
      var.linha=0;
      var.coluna=0;
      do{
        do{
          if(var.linha == var.coluna){
            System.out.print((var.linha+1) + "-" + var.tabela[var.linha][var.coluna]);
          }else{
            System.out.print("  ");
          }
          var.coluna++;
        }while(var.coluna<=9);
        var.linha++;
        var.coluna=0;
        System.out.print("\n");
      }while(var.linha<=9);
    }
}
