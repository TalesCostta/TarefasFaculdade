import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada listap0 = new ListaLigada();
        ListaLigada listap1 = new ListaLigada();
        ListaLigada listap2 = new ListaLigada();
        ListaLigada listap3 = new ListaLigada(); 
        Pessoa pessoa = new Pessoa();
        for(int i = 1; i < 11 ; i++){
            pessoa.id = i;
            pessoa.sexo = JOptionPane.showInputDialog("Sexo");
            pessoa.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
            int prioridade = Integer.parseInt(JOptionPane.showInputDialog("0 - Normal\n1 - Acima de 60 anos\n2 - Necessidades Especiais\n3 Gestante/lactante"));
            if(prioridade == 0){
                listap0.AdicionarNoComeco(pessoa);
            }else if(prioridade == 1){
                listap1.AdicionarNoComeco(pessoa);
            }else if(prioridade == 2){
                listap2.AdicionarNoComeco(pessoa);
            }else if(prioridade == 3){
                listap3.AdicionarNoComeco(pessoa);
            }
        }
        System.out.println("Iniciando atendimento\n------------------------------------------");
        while(listap0.tamanho()!= 0 || listap1.tamanho()!= 0 || listap2.tamanho()!= 0 || listap3.tamanho()!= 0){
            if(listap3.tamanho()!= 0){
                System.out.println("Atendendo gestantes/lactantes");
                listap3.removeDoComeco();
            }
            if(listap2.tamanho()!= 0){
                System.out.println("Atendendo Necessidades Especiais");
                listap2.removeDoComeco();
            }
            if(listap1.tamanho()!=0){
                for(int i = 0; i<3; i++){
                    System.out.println("Atendendo Acima de 60 anos");
                    listap1.removeDoComeco();
                }
            }
            if(listap0.tamanho()!=0){
                for(int i = 0; i<5; i++){
                    System.out.println("Atendendo Normal");
                    listap0.removeDoComeco();
                }
            }
        }
    }
}
