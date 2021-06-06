import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
      //Criar um algoritmo que entre com cinco números e imprimir o quadrado de cada número

      Variaveis var = new Variaveis();

      JOptionPane.showMessageDialog(null, "Laço For");
      for(int i = 1; i<=5; i++){
        var.numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Numero " + i));
        System.out.println("Numero " + var.numero + " | Ao quadrado: " + Math.pow(var.numero, 2));
      }

      JOptionPane.showMessageDialog(null, "Laço While");
      int contador=1;
      while(contador<=5){
        var.numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Numero " + contador));
        System.out.println("Numero " + var.numero + " | Ao quadrado: " + Math.pow(var.numero, 2));
        contador += 1;
      }

      JOptionPane.showMessageDialog(null, "Laço Do While");
      contador=1;
      do{
        var.numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Numero " + contador));
        System.out.println("Numero " + var.numero + " | Ao quadrado: " + Math.pow(var.numero, 2));
        contador += 1;
      }while(contador!=6);
    }
}
