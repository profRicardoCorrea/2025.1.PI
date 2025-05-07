package aula0705;

public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroPaginas;
    private String genero;
    private int anoPublicacao;
    private boolean emprestado;
    private int paginaAtual;

    // Construtores
    public Livro() {
        this.emprestado = false;
        this.paginaAtual = 0;
    }

    public Livro(String titulo, String autor, String isbn, int numeroPaginas) {
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    // Métodos
    public void emprestar() {
        if (!emprestado) {
            this.emprestado = true;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso");
        } else {
            System.out.println("Livro já está emprestado");
        }
    }

    public void devolver() {
        if (emprestado) {
            this.emprestado = false;
            System.out.println("Livro '" + titulo + "' devolvido com sucesso");
        }
    }

    public void ler(int paginas) {
        if (paginaAtual + paginas <= numeroPaginas) {
            this.paginaAtual += paginas;
            System.out.println("Lidas " + paginas + " páginas. Página atual: " + paginaAtual);
        } else {
            System.out.println("Número de páginas excede o total do livro");
        }
    }

    public double calcularProgresso() {
        return (double) paginaAtual / numeroPaginas * 100;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Progresso de leitura: " + calcularProgresso() + "%");
    }

    // Getters e Setters (implementar conforme necessidade)
} 