import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        //Cirar um algoritmo que imprima o horospoco de várias pessoas, a partir de sua data de nascimento (ddmm). O Fim é determinado quando se digita 9999 para dara; considere que a data foi digitada corretamente.

        Variaveis var = new Variaveis();

        for(int i=0; i<12; i++){
            var.signo[i] = JOptionPane.showInputDialog("Digite Signo");
            var.ultDia[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite ultimo dia"));
        }
        var.data = Integer.parseInt(JOptionPane.showInputDialog("Data no formato ddmm ou 9999 para terminar: "));
        while(var.data != 9999){
            var.dia = var.data/100;
            var.mes = var.data%100;
            var.mes--;
            if(var.dia > var.ultDia[var.mes]){
                var.mes = (var.mes + 1) % 12;
            }
            JOptionPane.showMessageDialog(null, "Signo: " + var.signo[var.mes] + "\n");
            var.data = Integer.parseInt(JOptionPane.showInputDialog("Data no formato ddmm ou 9999 para terminar: "));
        }
    }
}