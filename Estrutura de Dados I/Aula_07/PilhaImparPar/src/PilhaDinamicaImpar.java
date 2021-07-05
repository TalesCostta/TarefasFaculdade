public class PilhaDinamicaImpar {
    No topo;
    int tamanho;

    PilhaDinamicaImpar(){
        tamanho = 0;
        topo = null;
    }

    boolean vazia(){
        return topo == null;
    }

    void inserir(Object info){
        No no = new No();
        no.info = info;
        no.proximo = topo;
        topo = no;
        tamanho++;
    }

    Object retirar(){
        if(vazia()){
            return null;
        }
        Object info = topo.info;
        topo = topo.proximo;
        tamanho--;
        return info;
    }
}
