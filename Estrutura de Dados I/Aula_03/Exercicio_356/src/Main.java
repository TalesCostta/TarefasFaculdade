import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        //Armazenar nomes e notas das PR1 e PR2 de 15 alunos e fazer o cálculo da média, caso aprovado AP ou reprovado RP.

        Variaveis var = new Variaveis();

        for(var.linha=0; var.linha<=14; var.linha++){
            var.nomes[var.linha] = JOptionPane.showInputDialog(null, "Digite " + (var.linha+1) + " nome:");
            if(var.nomes[var.linha].length()>=30){
                JOptionPane.showMessageDialog(null, "Nomes com ate 30 caracteres");
                var.nomes[var.linha] = JOptionPane.showInputDialog(null, "Digite " + (var.linha+1) + "nome:");
            }
        }
        for(var.contador=0; var.contador<=14; var.contador++){
            var.pr1[var.contador] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 1 - Aluno(a):  " + var.nomes[var.contador]));
            var.pr2[var.contador] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota 2"));
            var.media[var.contador] = ((var.pr1[var.contador] + var.pr2[var.contador])/2);
            if(var.media[var.contador]>=5){
                var.sit[var.contador] = "AP";
            }else{
                var.sit[var.contador] = "RP";
            }
        }
        JOptionPane.showMessageDialog(null, "RELACAO FINAL");
        for(var.linha= 0;var.linha<=14; var.linha++ ){
            System.out.println((var.linha+1) + " - " + var.nomes[var.linha] + "\t" + var.pr1[var.linha] + "\t" + var.pr2[var.linha] + "\t" + var.media[var.linha] + "\t" + var.sit[var.linha]);
        }
    }
}
