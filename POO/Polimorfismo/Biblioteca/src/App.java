import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca bibli = new Biblioteca("Teste", "Testa A");
        while(true){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("--- CALDAS NOVAS BIBLIOTECA ---\n1 - Cadastro Usuário\n2 - Cadastro Publicação\n3 - Realizar Empréstimo\n0 - Sair"));
            if(opcao == 0){
                JOptionPane.showMessageDialog(null,"Obrigado! Volte sempre!");
                return;
            }else if(opcao == 1){
                Usuario user = cadastrarUsuario();
                if(user == null){
                    System.out.println("Erro ao cadastrar novo usuario!");
                }else{
                    bibli.adicionarUsuario(user);
                    System.out.println("Usuario cadastrado com sucesso!");
                }
            }else if(opcao == 2){
                Publicacao publicacao = cadastrarPublicacao();
                if(publicacao == null){
                    System.out.println("Erro ao cadastrar nova publicacao!");
                }else{
                    bibli.adicionarPublicacao(publicacao);
                }
            }else if(opcao == 3){
                String nomeUser = JOptionPane.showInputDialog("Nome Usuário: ");
                Usuario usuarioEmprestimo = bibli.buscarUsuario(nomeUser);
                if(usuarioEmprestimo == null){
                    System.out.println("Usuario não encontrado!");
                }
                String tituloPubli = JOptionPane.showInputDialog("Titulo da Publicacao: ");
                Publicacao publicacaoEmprestimo = bibli.buscarPublicacao(tituloPubli);
                if(publicacaoEmprestimo == null){
                    System.out.println("Publicacao não encontrada! Realize a operação.");
                    break;
                }
                Emprestimo emprestimo = new Emprestimo(usuarioEmprestimo, publicacaoEmprestimo);
                if(emprestimo.getPublicacao() == null){
                    JOptionPane.showMessageDialog(null, "Erro ao realizar empréstimo. Tente novamente.");
                }else{
                    JOptionPane.showMessageDialog(null,"Emprestimo realizado com sucesso! Emprestimo ID: " + emprestimo.getId());
                    bibli.adicionarEmprestimo(emprestimo);
                }
            }
        }
    }

    public static Usuario cadastrarUsuario(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("--- USUARIO ---\n1 - Normal\n2 - Especial"));
        if(opcao == 1){
            String nome = JOptionPane.showInputDialog("Digite o nome do Usuário:");
            String numeroTelefone = JOptionPane.showInputDialog("Digite o telefone do Usuário:");
            String email = JOptionPane.showInputDialog("Digite o e-mail do Usuário: ");
            return new UsuarioComum(nome, numeroTelefone, email);
        }else{
            String nome = JOptionPane.showInputDialog("Digite o nome do Usuário:");
            String numeroTelefone = JOptionPane.showInputDialog("Digite o telefone do Usuário:");
            String email = JOptionPane.showInputDialog("Digite o e-mail do Usuário: ");
            return new UsuarioEspecial(nome, numeroTelefone, email);
        }
    }

    public static Publicacao cadastrarPublicacao(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo Publicacao:\n1 - Livro\n2 - Artigo\n3 - Tese"));
        if(opcao == 1){
            String titulo = JOptionPane.showInputDialog(null, "Digite o título da publicação: ");
            String dataPubli = JOptionPane.showInputDialog(null, "Digite a data de publicação: "); 
            double multa = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da multa: "));
            int edicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a edição do livro: "));
            String editora = JOptionPane.showInputDialog(null, "Digite a editora do livro: ");
            String isbn = JOptionPane.showInputDialog(null,"Digite o ISBN do livro: ");
            return new Livro(titulo, dataPubli, edicao, editora, isbn, multa);
        }else if(opcao == 2){
            String titulo = JOptionPane.showInputDialog(null, "Digite o título da publicação: ");
            String dataPubli = JOptionPane.showInputDialog(null, "Digite a data de publicação: "); 
            double multa = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da multa: "));
            String resumo = JOptionPane.showInputDialog(null, "Digite o resumo do Artigo: ");
            return new Artigo(titulo, dataPubli, resumo, multa);
        }else{
            String titulo = JOptionPane.showInputDialog(null, "Digite o título da publicação: ");
            String dataPubli = JOptionPane.showInputDialog(null, "Digite a data de publicação: "); 
            double multa = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da multa: "));
            int numeroPaginas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade páginas"));
            String resumo = JOptionPane.showInputDialog(null, "Digite o resumo da Tese: ");
            System.out.println("Digite a data da defesa da Tese: ");
            String dataDefesa = JOptionPane.showInputDialog("Data da defesa");
            Autor autor = cadastrarAutor();
            return new Tese(titulo, dataPubli, autor, numeroPaginas, resumo, dataDefesa, multa);
        }
    }

    public static Autor cadastrarAutor(){
        String nomeAutor = JOptionPane.showInputDialog(null, "Digite o nome do Autor: ");
        String titulacaoAutor = JOptionPane.showInputDialog(null, "Digite a titulaçao do Autor: ");
        return new Autor(nomeAutor, titulacaoAutor);
    }
}