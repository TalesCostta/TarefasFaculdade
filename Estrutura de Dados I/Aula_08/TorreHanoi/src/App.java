import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double discos = Double.parseDouble(JOptionPane.showInputDialog("Quantidade discos: "));
        double contador = Math.pow(2, discos)-1;
        long tempoInicial = System.currentTimeMillis();
        hanoi(discos, 'A', 'B', 'C');
        JOptionPane.showMessageDialog(null, "Quantidade de movimentos totais: " +  contador);
        long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo total de execução foi %.3f s%n" , (tempoFinal - tempoInicial)/1000d);
    }

    private static void hanoi(double discos, char pInicial, char pAux, char pFinal){
        if(discos > 0){
            hanoi(discos-1, pInicial, pFinal, pAux);
            System.out.printf("Movendo de %s para %s\n" , pInicial, pFinal);
            hanoi(discos-1, pAux, pInicial, pFinal);
        }
    }
}


//Tempo:
//10 discos: 10.594s = 2,94×10-3 Horas
//20 Discos: 541.132s = 0,15 horas
//30 Discos: 16,243.96s = 4,51×10-3 horas
//40 Discos: 649,758.4s = 0,18 horas
//41 Discos: 6,497,584s = 1,8×10-3 horas