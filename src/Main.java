public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("Harry Potter");
        livro.setAutor("J. K. Rowling");
        livro.setIsbn(9788532511010);

        System.out.println(livro.getTitulo());
    }
}