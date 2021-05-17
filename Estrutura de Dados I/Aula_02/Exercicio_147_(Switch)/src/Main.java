import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        ContadorCalorias Calorias = new ContadorCalorias();

        Calorias.op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 - Vegetariano \n2 - Peixe\n3 - Frango\n4 - Carne"));

        switch(Calorias.op){
            case 1:
                Calorias.calorias += 180;
            break;
            case 2:
                Calorias.calorias += 230;
            break;
            case 3:
                Calorias.calorias += 250;
            break;
            case 4:
                Calorias.calorias += 350;
            break;
        }

        Calorias.op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 - Abacaxi \n2 - Sorvete Diet\n3 - Suco Melão\n4 - Refrigerante Diet"));

        switch(Calorias.op){
            case 1:
                Calorias.calorias += 75;
            break;
            case 2:
                Calorias.calorias += 110;
            break;
            case 3:
                Calorias.calorias += 170;
            break;
            case 4:
                Calorias.calorias += 200;
            break;
        }

        Calorias.op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 - Chá \n2 - Suco de Laranja\n3 - Mousse Diet\n4 - Mousse de Chocolate"));

        switch(Calorias.op){
            case 1:
                Calorias.calorias += 20;
            break;
            case 2:
                Calorias.calorias += 70;
            break;
            case 3:
                Calorias.calorias += 100;
            break;
            case 4:
                Calorias.calorias += 65;
            break;
        }

        JOptionPane.showMessageDialog(null, "Total de Calorias: " + Calorias.calorias);
    }
}
