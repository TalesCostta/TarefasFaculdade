import java.util.ArrayList;
import java.util.List;

public class FilaLavados {
    List <Object> obj = new ArrayList<>(); //Object = tipo generico de objeto
    
    void insere(Object A){ // (A) objeto generico
        this.obj.add(A);
    }
    Object remove(){
        return this.obj.remove(0);
    }
    
    boolean fila_vazia(){
        return(this.obj.isEmpty());
    }
}
