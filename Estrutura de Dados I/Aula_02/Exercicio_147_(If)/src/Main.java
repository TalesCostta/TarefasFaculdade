import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        ContadorCalorias Calorias = new ContadorCalorias();

        Calorias.op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 - Vegetariano \n2 - Peixe\n3 - Frango\n4 - Carne"));

        if(Calorias.op == 1){
            Calorias.calorias += 180;
        }else if(Calorias.op == 2){
            Calorias.calorias += 230;
        }else if(Calorias.op == 3){
            Calorias.calorias += 250;
        }else if(Calorias.op == 4){
            Calorias.calorias += 350;
        }

        Calorias.op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 - Abacaxi \n2 - Sorvete Diet\n3 - Suco Melão\n4 - Refrigerante Diet"));

        if(Calorias.op == 1){
            Calorias.calorias += 75;
        }else if(Calorias.op == 2){
            Calorias.calorias += 110;
        }else if(Calorias.op == 3){
            Calorias.calorias += 170;
        }else if(Calorias.op == 4){
            Calorias.calorias += 200;
        }

        Calorias.op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 - Chá \n2 - Suco de Laranja\n3 - Mousse Diet\n4 - Mousse de Chocolate"));

        if(Calorias.op == 1){
            Calorias.calorias += 20;
        }else if(Calorias.op == 2){
            Calorias.calorias += 70;
        }else if(Calorias.op == 3){
            Calorias.calorias += 100;
        }else if(Calorias.op == 4){
            Calorias.calorias += 65;
        }

        JOptionPane.showMessageDialog(null, "Total de Calorias: " + Calorias.calorias);
    }
}
