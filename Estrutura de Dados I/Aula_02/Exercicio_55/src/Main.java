import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        AreaLosango calcLosango = new AreaLosango();

        calcLosango.diagMaior = Float.parseFloat(JOptionPane.showInputDialog(null, "Medida da diagonal maior"));
        calcLosango.diagMenor = Float.parseFloat(JOptionPane.showInputDialog(null, "Medida da diagonal menor"));
        calcLosango.area = (calcLosango.diagMaior * calcLosango.diagMenor)/2;
        JOptionPane.showMessageDialog(null, "Area = " + calcLosango.area);
    }
}
