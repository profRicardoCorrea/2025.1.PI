package aula0705;

public class Jogo {
    private String titulo;
    private String genero;
    private String desenvolvedora;
    private int anoLancamento;
    private double preco;
    private boolean multiplayer;
    private int classificacaoEtaria;
    private String plataforma;
    private boolean instalado;
    private double tamanhoGB;

    public Jogo() {
        this.multiplayer = false;
        this.instalado = false;
        this.classificacaoEtaria = 0;
    }

    public Jogo(String titulo, String genero, String desenvolvedora, double preco) {
        this();
        this.titulo = titulo;
        this.genero = genero;
        this.desenvolvedora = desenvolvedora;
        this.preco = preco;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public boolean isInstalado() {
        return instalado;
    }

    public void setInstalado(boolean instalado) {
        this.instalado = instalado;
    }

    public double getTamanhoGB() {
        return tamanhoGB;
    }

    public void setTamanhoGB(double tamanhoGB) {
        this.tamanhoGB = tamanhoGB;
    }
} 