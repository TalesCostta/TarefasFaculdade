import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
      //Simular uma pausa usando for
      Variaveis var = new Variaveis();

      JOptionPane.showMessageDialog(null, "Laço For");
      JOptionPane.showMessageDialog(null, "Iniciando!");
      for(var.contador = 1; var.contador <= 50000; var.contador++){
        System.out.print(" ");
      }
      JOptionPane.showMessageDialog(null, "Fim!");

      JOptionPane.showMessageDialog(null, "Laço While");
      var.contador=1;
      while(var.contador<=50000){
        System.out.print(" ");
        var.contador+=1;
      }
      JOptionPane.showMessageDialog(null, "Fim!");
      
      JOptionPane.showMessageDialog(null, "Laço Do-While");
      do{
        System.out.print(" ");
        var.contador+=1;
      }while(var.contador<=50000);
      JOptionPane.showMessageDialog(null, "Fim!");
    }
}
