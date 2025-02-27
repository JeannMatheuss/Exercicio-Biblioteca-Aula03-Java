import java.io.*;
import java.util.*;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Membro> membros = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public boolean removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido: " + livro);
            return true;
        } else {
            System.out.println("Erro: Livro não encontrado.");
            return false;
        }
    }
    

    public void registrarMembro(Membro membro) {
        membros.add(membro);
        System.out.println("Membro registrado: " + membro);
    }

    public void registrarEmprestimo(Livro livro, Membro membro) {
        Emprestimo emprestimo = new Emprestimo(livro, membro, new Date());
        emprestimos.add(emprestimo);
        System.out.println("Emprestimo registrado: " + emprestimo);
    }

    public boolean devolverLivro(Livro livro, Membro membro) {
        Optional<Emprestimo> emprestimoEncontrado = emprestimos.stream()
            .filter(e -> e.getLivro().equals(livro) && e.getMembro().equals(membro))
            .findFirst();
    
        if (emprestimoEncontrado.isPresent()) {
            emprestimos.remove(emprestimoEncontrado.get());
            System.out.println("Livro devolvido: " + emprestimoEncontrado.get());
            return true;
        } else {
            System.out.println("Erro: Empréstimo não encontrado.");
            return false;
        }
    }
    

    public void salvarDadosEmArquivo(String nomeArquivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(livros);
            oos.writeObject(membros);
            oos.writeObject(emprestimos);
            System.out.println("Dados salvos em " + nomeArquivo);
        }
    }
    


    @SuppressWarnings("unchecked")
    public void carregarDadosDeArquivo(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            livros = (List<Livro>) ois.readObject();
            membros = (List<Membro>) ois.readObject();
            emprestimos = (List<Emprestimo>) ois.readObject();
            System.out.println("Dados carregados de " + nomeArquivo);
        }
    }
    
}