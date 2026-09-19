package questao3;

public class Main {
    public static  void main(String[] args) {
        Autor fd = new Autor("Fiódor Dostoiévski", "Russa");
        Livro b = new Livro("Crime e Castigo", 30.0, fd);

        b.exibirDetalhes();
    }
}
