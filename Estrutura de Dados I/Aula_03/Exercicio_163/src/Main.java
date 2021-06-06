import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        //A cada uma volta ao lago fazer 5 abdominais
        Variaveis var = new Variaveis();

        JOptionPane.showMessageDialog(null, "Laço For");
        for(var.voltaLagoa = 1; var.voltaLagoa <= 3; var.voltaLagoa++){
          JOptionPane.showMessageDialog(null, var.voltaLagoa + " a volta na Lagoa");
          for(var.abdominais = 1; var.abdominais <= 5; var.abdominais++){
            JOptionPane.showMessageDialog(null, var.abdominais + " o Abdominal");
          }
        }
        
        JOptionPane.showMessageDialog(null, "Laço While");
        var.voltaLagoa=1;
        var.abdominais=1;
        while(var.voltaLagoa<=3){
          JOptionPane.showMessageDialog(null, var.voltaLagoa + " a volta na Lagoa");
          while(var.abdominais<=5){
            JOptionPane.showMessageDialog(null, var.abdominais + " o Abdominal");
            var.abdominais+=1;
          }
          var.abdominais=1;
          var.voltaLagoa+=1;
        }

        JOptionPane.showMessageDialog(null, "Laço Do-While");
        do{
          JOptionPane.showMessageDialog(null, var.voltaLagoa + " a volta na Lagoa");
          do{
            JOptionPane.showMessageDialog(null, var.abdominais + " o Abdominal");
            var.abdominais+=1;
          }while(var.abdominais<=5);
          var.abdominais=1;
          var.voltaLagoa+=1;
        }while(var.voltaLagoa<=3);
    }
}
