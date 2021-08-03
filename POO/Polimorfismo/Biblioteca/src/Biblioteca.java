import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Publicacao> publicacoes;

    public Biblioteca(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.usuarios = new ArrayList<Usuario>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.publicacoes = new ArrayList<Publicacao>();
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return this.endereco;
    }
  
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public boolean adicionarPublicacao(Publicacao publicacao){
        this.publicacoes.add(publicacao);
        return true;
    }

    public boolean removerPublicacao(Publicacao publicacao){
        this.publicacoes.remove(publicacao);
        return true;
    }

    public Publicacao buscarPublicacao(String titulo){
        for(Publicacao publicacao:this.publicacoes){
            if(publicacao.getTitulo().equals(titulo)){
                return publicacao;
            }
        }
        return null;
    }

    public boolean adicionarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
        return true;
     }
     
    public boolean removerUsuario(Usuario usuario){
        this.usuarios.remove(usuario);
        return true;
     } 
  
    public Usuario buscarUsuario(String nome){
        for(Usuario usuario:this.usuarios){
           if(usuario.getNome().equals(nome)){
              return usuario;
           }
        }
        return null;
    }
  
    public boolean adicionarEmprestimo(Emprestimo emprestimo){
        this.emprestimos.add(emprestimo);
        return true;
    }
     
    public boolean removerEmprestimo(Emprestimo emprestimo){
        this.emprestimos.remove(emprestimo);
        return true;
    }
  
    public Emprestimo buscarEmprestimo(int id){
        for(Emprestimo emprestimo: this.emprestimos){
           if(emprestimo.getId() == id){
              return emprestimo;
           }
        }
        return null;
    }
}
