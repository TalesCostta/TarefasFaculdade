import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        NumeroMax Maximo = new NumeroMax();

        Maximo.num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1o numero"));
        Maximo.num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 2o numero"));
        Maximo.num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 3o numero"));

        switch(Maximo.num1 + Maximo.num2 + Maximo.num3){
            case (Maximo.max < Maximo.num1 == true):
                Maximo.max = Maximo.num1;
            break;
        }

        JOptionPane.showMessageDialog(null, "Max = " + Maximo.max);
    }
}
