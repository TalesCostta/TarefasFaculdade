import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        Sigla VerificarSigla = new Sigla();
        
        VerificarSigla.sigla = JOptionPane.showInputDialog(null, "Digite a Sigla");
        
        if(VerificarSigla.sigla.equals("RJ") || VerificarSigla.sigla.equals("rj")){
            JOptionPane.showMessageDialog(null, "Carioca");
        }else if(VerificarSigla.sigla.equals("SP") || VerificarSigla.sigla.equals("sp")){
            JOptionPane.showMessageDialog(null, "Paulista");
        }else if(VerificarSigla.sigla.equals("MG") || VerificarSigla.sigla.equals("mg")){
            JOptionPane.showMessageDialog(null, "Mineiro");
        }else{
            JOptionPane.showMessageDialog(null, "Outros Estados");
        }
    }   
}

//Objetos primitivos ficam fora do Heap, assim pode ser usado ==, como String não é primitivo, se usa equals.

//Exercício 85, 105