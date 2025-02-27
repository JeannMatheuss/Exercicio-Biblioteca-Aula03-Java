import java.io.*;

public class SistemaBiblioteca {
    public static void main(String[] args) {
    Biblioteca biblioteca = inicializarBiblioteca();

    biblioteca.registrarEmprestimo(biblioteca.getLivros().get(0), biblioteca.getMembros().get(0));

    try {
        biblioteca.salvarDadosEmArquivo("biblioteca.dat");
        biblioteca.carregarDadosDeArquivo("biblioteca.dat");
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }

        biblioteca.devolverLivro(biblioteca.getLivros().get(0), biblioteca.getMembros().get(0));
        biblioteca.removerLivro(biblioteca.getLivros().get(1));
    }

    private static Biblioteca inicializarBiblioteca() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("Livro A", "Autor A", "12345"));
        biblioteca.adicionarLivro(new Livro("Livro B", "Autor B", "67890"));

        biblioteca.registrarMembro(new Membro("Membro A", 1, "emailA@fiap.com.br"));
        biblioteca.registrarMembro(new Membro("Membro B", 2, "emailB@fiap.com.br"));
        
        return biblioteca;
    }
}