import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        Razao PG = new Razao();

        PG.termo = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o 1o Termo"));
        PG.razao = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a razao"));
        PG.quinto = PG.termo * (Math.pow(PG.razao, 4));
        JOptionPane.showMessageDialog(null, "5o termo desta P.G e: " + PG.quinto);
    }
}
