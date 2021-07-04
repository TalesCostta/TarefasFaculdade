import javax.swing.JOptionPane;//Importação da biblioteca presente o JOptionPane, para usar como entrada de dados.

public class Principal{//Início Classe
    static int [][] transicao = {{0,1},{1,0}}; // Declaração de dados estáticos transicao
    
    static int estadoInicial = 0; //Declaração de estadoInicial igual a 0
    static int[] estadoFinal = {1};//Declaração de estadoFinal igual a 1

    public static void main(){//Início main
        //Entrada de Dados
        Sting cadeia = JOptionPane.showInputDialog("Digite a cadeia para verificar: "); //Entrada de dados na variável cadeia para verificar

        //Processamento
        int estado = estadoInicial; //Declaração de estado, iniciando com estadoInicial, que é = 0;
        int posicao = 0; //Declarando a variável posição em 0;
        while (posicao < cadeia.length()){//Laço de repetição enquanto posicao for menor que cadeia
            //Pre Processamento
            char elemento = cadeia.charAt(posicao);//Está sendo salvo na variavel elemento, a posicao na cadeia em que é declarada pela variável posicao.
            System.out.println(elemento);//Saída de dados para o Usuário da var elemento.
            //Processamento (Atualização estado Atual)
            int elementoInt = Integer.parseInt(elemento + "");//Convertendo char em integer para a variavel elementoInt
            estado_atual = transicao[estado_inicial][elementoInt];//Pegando dados da var estática transicao e salvando em estado_atual
            //Pos Processamento
            posicao++; //Posicao sendo somada o valor dela mais 1
        }//Fim laço while
        //Saída de Dados
        boolean aceita = false;//Declaracao da var boolean aceita igual a false
        for(int i:estadosFinal){//Inicio do laço for
            if(estado_atual == i){//Se estado_atual for igual a i, a var boolean aceita irá mudar para true
                aceita = true;//Mudança de false para true
            }
        }//Fim laço for
        if(aceita==ture){//Se aceita for igual a true, a cadeia é válida
            System.out.println("Cadeia aceita!");//Saída de dados para o usuário dizendo que é válida
        }else{//Se não for igual a true
            System.out.println("Cadeia invalida!");//Saída de dados para o usuário dizendo que não é válida
        }//Fim IF
    }//Fim main
}//Fim classe 