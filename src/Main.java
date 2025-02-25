public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setTitulo("Harry Potter");
        livro.setAutor("J. K. Rowling");

        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
    }
}