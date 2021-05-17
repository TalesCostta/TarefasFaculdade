import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        NumeroMax Maximo = new NumeroMax();

        Maximo.num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1o numero"));
        Maximo.num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 2o numero"));
        Maximo.num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 3o numero"));

        if(Maximo.num1 > Maximo.num2){
            if(Maximo.num1 > Maximo.num3){
                Maximo.max = Maximo.num1;
            }
        }else{
            if(Maximo.num2 > Maximo.num3){
                Maximo.max = Maximo.num2;
            }else{
                Maximo.max = Maximo.num3;
            }
        }

        JOptionPane.showMessageDialog(null, "Max = " + Maximo.max);
    }
}
